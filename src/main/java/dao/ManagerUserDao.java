package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.User;

public class ManagerUserDao {
	String DB_URL = "jdbc:mysql://localhost:3307/shopping";
    String USER_NAME = "root";
    String PASSWORD = "";
	
	static private  ManagerUserDao instance;
	List<User> users = null;
	
	private  ManagerUserDao() {
		users = new ArrayList<User>();
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            Statement stmt = conn.createStatement();
            // get data from table 'student'
            ResultSet rs = stmt.executeQuery("SELECT user.user_id, user.user_name, user.phone_number, user.mail, type.type_name, user.address, user.age, user.is_admin, user.password \r\n"
            		+ "FROM USER\r\n"
            		+ "INNER JOIN type ON type.type_id = user.gender + 1;");
            while (rs.next()) {
            	
            	int id = rs.getInt(1);
            	String name = rs.getString(2);
            	String phone = rs.getString(3);
            	String gmail = rs.getString(4);
            	String gender = rs.getString(5);
            	String address = rs.getString(6);
            	int age = rs.getInt(7);
            	boolean admin = rs.getBoolean(8);
            	String password = rs.getString(9);
            	
            	
            		
            	User user = new User(id, name, phone, gmail,gender, address, age, admin, password);
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
