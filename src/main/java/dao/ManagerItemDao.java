package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Catalory;
import bean.Color;
import bean.Item1;
import bean.Item;
import bean.Size;



public class ManagerItemDao {
	String DB_URL = "jdbc:mysql://localhost:3307/shopping";
    String USER_NAME = "root";
    String PASSWORD = "";
    
    
	static private ManagerItemDao instance;
	List<Item1> items = null;
	
	private ManagerItemDao() {
		items = new ArrayList<Item1>();
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement stmt = conn.createStatement();
            // get data from table 'student'
            ResultSet rs = stmt.executeQuery("select * from item");
            while (rs.next()) {
            	
            	int id = rs.getInt(1);
            	String name = rs.getString(2);
            	Catalory category = Catalory.values()[rs.getInt(3)];
            	Color color = Color.values()[rs.getInt(4)];
            	Size size = Size.values()[rs.getInt(5)];
            	int amount = rs.getInt(6);
            	double price = rs.getDouble(7);
            	Boolean type = rs.getInt(8)==1 ? true : false;
            	String imgUrl = rs.getString(9);
            		
            	Item1 item = new Item1(id, name, category, color, size, amount, price, type, imgUrl);
            	items.add(item);
            }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	public static ManagerItemDao getInstance() {
        if(instance == null) {
            instance = new ManagerItemDao();
        }
        return instance;
    }

    public List<Item1> getAllItem() {
        return items;
    }

    public boolean addItem(Item1 item) {
        return this.items.add(item);
    }

    public boolean deleteItem(Item1 item) {
        return this.items.remove(item);
    }

    public List<Item1> showItemByKey(Predicate<Item1> predicate){

        return this.items.stream().filter(predicate).toList();
    }
}
	


	



