package dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.User;

public class ManagerUserDao {
	
	static private  ManagerUserDao instance;
	List<User> users = null;
	
	private  ManagerUserDao() {
		
	 users = new ArrayList<User>();
	 User us1 = new User(1, "DUY ANH", "123456", "bitdubai", true);
	 User us2 = new User(2, "Kha Pham", "123456", "khangu", true);
	 User us3 = new User(3, "BIT DU BAI", "123456", "duyanhdn", true);
	 User us4 = new User(3, "Doan Quang Vinh", "123456", "quangvinhdn", true);
	 
	 
	 
	 users.add(us1);
	 users.add(us2); users.add(us3);
	 users.add(us4);
		
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
