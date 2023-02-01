package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.Catalory;
import bean.Color;
import bean.Item1;
import bean.Size;
import bean.User;

public class ManagerUserDao {
	
	static private  ManagerUserDao instance;
	List<User> users = null;
	String DB_URL = "jdbc:mysql://localhost:3307/shopping";
    String USER_NAME = "root";
    String PASSWORD = "";
	
	private  ManagerUserDao() {
		
		users = new ArrayList<User>();
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement stmt = conn.createStatement();
            // get data from table 'student'
            ResultSet rs = stmt.executeQuery("select * from user1");
            while (rs.next()) {
            	
            	int id = rs.getInt(1);
            	String name = rs.getString(2);
            	String phone = rs.getString(3);
            	String gmail = rs.getString(4);
            	boolean gender = rs.getBoolean(5);
            	String address = rs.getString(6);
            	int age = rs.getInt(7);
            	boolean admin = rs.getBoolean(8);
            	String userName = rs.getString(9);
            	String password = rs.getString(10);
            	double priceUser = rs.getDouble(11);
            	
            		
            	User user = new User(id, name, phone, gmail, gender, address, age, admin, userName, password, age);
            	users.add(user);
            }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		
	}
	
	
	public static ManagerUserDao getInstance() {
		if(instance == null) {
			instance = new ManagerUserDao();
		}
		return instance;
	}

	public List<User> getAllUser() {
		return users;
	}
	
	public boolean addUser(User user) {
		return this.users.add(user);
	}
	
	public boolean deleteUser(User user) {
		return this.users.remove(user);
	}
}
