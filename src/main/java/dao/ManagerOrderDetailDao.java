package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Item;
import bean.OrderDetail;
import bean.User;

public class ManagerOrderDetailDao {
	
	String DB_URL = "jdbc:mysql://localhost:3307/shopping";
    String USER_NAME = "root";
    String PASSWORD = "";
    
    
	static private  ManagerOrderDetailDao instance;
	List<OrderDetail> order_details = null;
	
	public ManagerOrderDetailDao() {
		order_details = new ArrayList<OrderDetail>();
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement stmt = conn.createStatement();
            // get data from table 'student'
            String query = "SELECT * FROM order_detail";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
            	int orderdetail_id = rs.getInt(1);
            	int order_id = rs.getInt(2);
            	int item_id = rs.getInt(3);
            	int quantity = rs.getInt(4);
            	double total_price = rs.getDouble(5);
	
            }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
	
	public void addOrderDetail(double priceItem , int itemID , int iduser ) {
		try {

            // Initialize the database
			  Class.forName("com.mysql.jdbc.Driver");
	            Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
	           

            // Create a SQL query to insert data into demo table
            // demo table consists of two columns, so two '?' is used
	            List<Integer> listID = new ArrayList<>();
	        Statement stmt = conn.createStatement();
	        String query = "SELECT order_detail.order_detail_id FROM order_detail";
	        ResultSet rs = stmt.executeQuery(query);
	        while (rs.next()) {
				listID.add(rs.getInt(1));
				
			}
	        int newID = GetNewID(listID);
            PreparedStatement st = conn
                   .prepareStatement("INSERT INTO `order_detail`(`order_detail_id`, `item_id`, `quantity`, `total_price`, `user_id` ) VALUES(?, ?, ? , ?, ? )");

            // For the first parameter,
            // get the data using request object
            // sets the data to st pointer
            st.setInt(1, newID);
            st.setInt(2, itemID);
            st.setInt(3, 1);
            st.setDouble(4, priceItem);
            st.setInt(5, iduser);
            System.out.println(newID + " " + itemID + " " + priceItem + " " +iduser);

            // Same for second parameter
           

            // Execute the insert command using executeUpdate()
            // to make changes in database
           st.executeUpdate();

            // Close all the connections
            st.close();
          


        }
        catch (Exception e) {
            e.printStackTrace();
        }
	}
	public int GetNewID(List<Integer> listID)
    {
        int ID = 1;
        listID.sort((o1 , o2) -> o1 - o2);
        for (int i = 0; i < listID.size() - 1; i++)
        {
            if (listID.get(0) == 1)
            {
                if (listID.get(i) + 1 != listID.get(i + 1))
                {
                    ID = listID.get(i) + 1;
                    break;
                }
                ID =  listID.size() + 1;
            }
        }
        return ID;
    }
	
	public static ManagerOrderDetailDao getInstance() {
		if(instance == null) {
			instance = new ManagerOrderDetailDao();
		}
		return instance;
	}
	
	public List<OrderDetail> getAllUser() {
		return order_details ;
	}
	
	

}
