package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
            	
            		
            	User user = new User(id, name, phone, gmail, gender, address, age, admin, userName, password, priceUser);
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
	
	public void addUser(User user) {
		try {

            // Initialize the database
			  Class.forName("com.mysql.jdbc.Driver");
	            Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
	           

            // Create a SQL query to insert data into demo table
            // demo table consists of two columns, so two '?' is used
            PreparedStatement st = conn
                   .prepareStatement("insert into user1 values(?, ?, ? , ? , ? , ? , ? , ?, ?, ?, ?)");

            // For the first parameter,
            // get the data using request object
            // sets the data to st pointer
            st.setInt(1, user.getId());

            // Same for second parameter
            st.setString(2, user.getName());
            st.setString(3, user.getPhone());
            st.setString(4, user.getGmail());
            st.setBoolean(5, user.isGender());
            st.setString(6, user.getAddress());
            st.setInt(7, user.getAge());
            st.setBoolean(8, user.isAdmin());
            
            st.setString(9, user.getUserName());
            st.setString(10, user.getUserPassword());
            st.setDouble(11, user.getPriceUser());

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
	
	public boolean deleteUser(User user) {
		return this.users.remove(user);
	}
}
