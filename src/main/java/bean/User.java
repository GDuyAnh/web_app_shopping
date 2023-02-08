package bean;

public class User {
	private int user_id;
	private String user_name;
	private String phone_number;
	private String mail;
	private String gender;
	private String address;
	private int age;
	private boolean is_admin;
	private String password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int user_id, String user_name, String phone_number, String mail, String gender, String address, int age,
			boolean is_admin, String password) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.phone_number = phone_number;
		this.mail = mail;
		this.gender = gender;
		this.address = address;
		this.age = age;
		this.is_admin = is_admin;
		this.password = password;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isIs_admin() {
		return is_admin;
	}

	public void setIs_admin(boolean is_admin) {
		this.is_admin = is_admin;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", phone_number=" + phone_number + ", mail="
				+ mail + ", gender=" + gender + ", address=" + address + ", age=" + age + ", is_admin=" + is_admin
				+ ", password=" + password +  "]";
	}
	
}
