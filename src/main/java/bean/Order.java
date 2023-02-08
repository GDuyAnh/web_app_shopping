package bean;

public class Order {
	
	private int order_id;
	private String description;
	private String time_order;
	private String time_delivery;
	private double total_payment;
	private boolean status;
	private String phone;
	private String name_receiver;
	private String address_reciver;
	private String mail;
	private int user_id;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}
	
	public Order(int order_id, String description, String time_order, String time_delivery, double total_payment,
			boolean status, String phone, String name_receiver, String address_reciver, String mail, int user_id) {
		super();
		this.order_id = order_id;
		this.description = description;
		this.time_order = time_order;
		this.time_delivery = time_delivery;
		this.total_payment = total_payment;
		this.status = status;
		this.phone = phone;
		this.name_receiver = name_receiver;
		this.address_reciver = address_reciver;
		this.mail = mail;
		this.user_id = user_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTime_order() {
		return time_order;
	}

	public void setTime_order(String time_order) {
		this.time_order = time_order;
	}

	public String getTime_delivery() {
		return time_delivery;
	}

	public void setTime_delivery(String time_delivery) {
		this.time_delivery = time_delivery;
	}

	public double getTotal_payment() {
		return total_payment;
	}

	public void setTotal_payment(double total_payment) {
		this.total_payment = total_payment;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName_receiver() {
		return name_receiver;
	}

	public void setName_receiver(String name_receiver) {
		this.name_receiver = name_receiver;
	}

	public String getAddress_reciver() {
		return address_reciver;
	}

	public void setAddress_reciver(String address_reciver) {
		this.address_reciver = address_reciver;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", description=" + description + ", time_order=" + time_order
				+ ", time_delivery=" + time_delivery + ", total_payment=" + total_payment + ", status=" + status
				+ ", phone=" + phone + ", name_receiver=" + name_receiver + ", address_reciver=" + address_reciver
				+ ", mail=" + mail + ", user_id=" + user_id + "]";
	}
	
	
	
	
	
	
	

}
