package bean;

public class User {
	private int id;
	private String name;
	private String password;
	private String username;
	private boolean gender;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public User(int id, String name, String password, String username, boolean gender) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.username = username;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", username=" + username + ", gender="
				+ gender + "]";
	}
	

	
	
}
