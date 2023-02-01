package bean;

public class User {

	private int id;
	private String name;
	private String phone;
	private String gmail;
	private boolean gender;
	private String address;
	private int age;
	private boolean admin;
	private String userName;
	private String userPassword;
	private double priceUser;

	

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
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

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public double getPriceUser() {
		return priceUser;
	}

	public void setPriceUser(double priceUser) {
		this.priceUser = priceUser;
	}

	public User(int id, String name, String phone, String gmail, boolean gender, String address, int age, boolean admin,
			String userName, String userPassword, double priceUser) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.gmail = gmail;
		this.gender = gender;
		this.address = address;
		this.age = age;
		this.admin = admin;
		this.userName = userName;
		this.userPassword = userPassword;
		this.priceUser = priceUser;
	}

	

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phone=" + phone + ", gmail=" + gmail + ", gender=" + gender
				+ ", address=" + address + ", age=" + age + ", admin=" + admin + ", userName=" + userName
				+ ", userPassword=" + userPassword + ", priceUser=" + priceUser + "]";
	}

}
