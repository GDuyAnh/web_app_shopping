package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Item;



public class ManagerItemDao {
	String DB_URL = "jdbc:mysql://localhost:3307/shopping";
    String USER_NAME = "root";
    String PASSWORD = "";
    
    
	static private  ManagerItemDao instance;
	List<Item> items = null;
	
	private ManagerItemDao() {
		items = new ArrayList<Item>();
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement stmt = conn.createStatement();
            // get data from table 'student'
            String query = "SELECT item.item_id, item.item_name, item.color, item.size, type.type_name, item.price, item.discount_price, category.name_category, s.imgs\r\n"
            		+ "FROM item \r\n"
            		+ "INNER JOIN category ON item.category_id = category.category_id \r\n"
            		+ "INNER JOIN type ON item.type = type.type_id\r\n"
            		+ "INNER JOIN (\r\n"
            		+ "	SELECT image.image_id, GROUP_CONCAT(image.image_url, '&') as imgs  \r\n"
            		+ "    FROM image\r\n"
            		+ "    GROUP BY image.image_id\r\n"
            		+ ") s ON item.image_id = s.image_id";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
            	int id = rs.getInt(1);
            	String name = rs.getString(2);
            	String color = rs.getString(3);
            	String size = rs.getString(4);
            	String type_name = rs.getString(5);
            	Double price = rs.getDouble(6);
            	Double price_sale = rs.getDouble(7);
            	String category = rs.getString(8);
            	String[] imgs = rs.getString(9).split("|");
            	
            	Item item = new Item(id, name, color, size, type_name, price, price_sale, category, imgs);
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

	public List<Item> getItem() {
		List<Item> items1 = new ArrayList<Item>();
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement stmt = conn.createStatement();
            // get data from table 'student'
            String query = "SELECT item.item_id, item.item_name, item.color, item.size, type.type_name, item.price, item.discount_price, category.name_category, s.imgs\r\n"
            		+ "FROM item \r\n"
            		+ "INNER JOIN category ON item.category_id = category.category_id \r\n"
            		+ "INNER JOIN type ON item.type = type.type_id\r\n"
            		+ "INNER JOIN (\r\n"
            		+ "	SELECT image.image_id, GROUP_CONCAT(image.image_url, '&') as imgs  \r\n"
            		+ "    FROM image\r\n"
            		+ "    GROUP BY image.image_id\r\n"
            		+ ") s ON item.image_id = s.image_id";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
            	int id = rs.getInt(1);
            	String name = rs.getString(2);
            	String color = rs.getString(3);
            	String size = rs.getString(4);
            	String type_name = rs.getString(5);
            	Double price = rs.getDouble(6);
            	Double price_sale = rs.getDouble(7);
            	String category = rs.getString(8);
            	String[] imgs = rs.getString(9).split("&");
            	
            	Item item = new Item(id, name, color, size, type_name, price, price_sale, category, imgs);
            	items1.add(item);
            	System.out.println(item);
            }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		return items1;
	}
	
	public boolean addItem(Item item) {
		return this.items.add(item);
	}
	
	public boolean deleteItem(Item item) {
		return this.items.remove(item);
	}
	
	public List<Item> showItemByKey(Predicate<Item> predicate){
		
		return this.getItem().stream().filter(predicate).toList();
	}
	
	public List<Item> getItemByCategory(int catagoryId){ 
		List<Item> items1 = new ArrayList<Item>();
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement stmt = conn.createStatement();
            // get data from table 'student'
            String query = "SELECT item.item_id, item.item_name, item.color, item.size, type.type_name, item.price, item.discount_price, category.name_category, s.imgs\r\n"
            		+ "FROM item \r\n"
            		+ "INNER JOIN category ON item.category_id = category.category_id \r\n"
            		+ "INNER JOIN type ON item.type = type.type_id\r\n"
            		+ "INNER JOIN (\r\n"
            		+ "	SELECT image.image_id, GROUP_CONCAT(image.image_url, '&') as imgs  \r\n"
            		+ "    FROM image\r\n"
            		+ "    GROUP BY image.image_id\r\n"
            		+ ") s ON item.image_id = s.image_id \r\n";
            query += "WHERE item.category_id =" + catagoryId;
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
            	int id = rs.getInt(1);
            	String name = rs.getString(2);
            	String color = rs.getString(3);
            	String size = rs.getString(4);
            	String type_name = rs.getString(5);
            	Double price = rs.getDouble(6);
            	Double price_sale = rs.getDouble(7);
            	String category = rs.getString(8);
            	String[] imgs = rs.getString(9).split("&");
            	
            	Item item = new Item(id, name, color, size, type_name, price, price_sale, category, imgs);
            	items1.add(item);
            }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		return items1;
	}

	public List<Item> getItemsWithWhereClause(String whereClause) {
		List<Item> items1 = new ArrayList<Item>();
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement stmt = conn.createStatement();
            // get data from table 'student'
            String query = "SELECT item.item_id, item.item_name, item.color, item.size, type.type_name, item.price, item.discount_price, category.name_category, s.imgs\r\n"
            		+ "FROM item \r\n"
            		+ "INNER JOIN category ON item.category_id = category.category_id \r\n"
            		+ "INNER JOIN type ON item.type = type.type_id\r\n"
            		+ "INNER JOIN (\r\n"
            		+ "	SELECT image.image_id, GROUP_CONCAT(image.image_url, '&') as imgs  \r\n"
            		+ "    FROM image\r\n"
            		+ "    GROUP BY image.image_id\r\n"
            		+ ") s ON item.image_id = s.image_id\r\n";
            query += whereClause;
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
            	int id = rs.getInt(1);
            	String name = rs.getString(2);
            	String color = rs.getString(3);
            	String size = rs.getString(4);
            	String type_name = rs.getString(5);
            	Double price = rs.getDouble(6);
            	Double price_sale = rs.getDouble(7);
            	String category = rs.getString(8);
            	String[] imgs = rs.getString(9).replace(",https", "https").split("&");
            	
            	Item item = new Item(id, name, color, size, type_name, price, price_sale, category, imgs);
            	items1.add(item);
            }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		return items1;
	}

	public List<Item> getItemBycondition(String whereclause) {
		List<Item> items1 = new ArrayList<Item>();
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement stmt = conn.createStatement();
            // get data from table 'student'
            String query = "SELECT item.item_id, item.item_name, item.color, item.size, type.type_name, item.price, item.discount_price, category.name_category, s.imgs\r\n"
            		+ "FROM item \r\n"
            		+ "INNER JOIN category ON item.category_id = category.category_id \r\n"
            		+ "INNER JOIN type ON item.type = type.type_id\r\n"
            		+ "INNER JOIN (\r\n"
            		+ "	SELECT image.image_id, GROUP_CONCAT(image.image_url, '&') as imgs  \r\n"
            		+ "    FROM image\r\n"
            		+ "    GROUP BY image.image_id\r\n"
            		+ ") s ON item.image_id = s.image_id \r\n";
            query += whereclause;
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
            	int id = rs.getInt(1);
            	String name = rs.getString(2);
            	String color = rs.getString(3);
            	String size = rs.getString(4);
            	String type_name = rs.getString(5);
            	Double price = rs.getDouble(6);
            	Double price_sale = rs.getDouble(7);
            	String category = rs.getString(8);
            	String[] imgs = rs.getString(9).split("&");
            	
            	Item item = new Item(id, name, color, size, type_name, price, price_sale, category, imgs);
            	items1.add(item);
            	System.out.println(item);
            }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		return items1;
	}

}
