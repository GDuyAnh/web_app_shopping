package bean;

public class OrderDetail {
	
	private int order_detail_id;
	private int order_id;
	private int item_id;
	private int quantity;
	private double total_price;
	private int user_id;
	
	public OrderDetail() {
		// TODO Auto-generated constructor stub
	}

	public OrderDetail(int order_detail_id, int order_id, int item_id, int quantity, double total_price, int user_id) {
		super();
		this.order_detail_id = order_detail_id;
		this.order_id = order_id;
		this.item_id = item_id;
		this.quantity = quantity;
		this.total_price = total_price;
		this.user_id = user_id;
	}

	public int getOrder_detail_id() {
		return order_detail_id;
	}

	public void setOrder_detail_id(int order_detail_id) {
		this.order_detail_id = order_detail_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "OrderDetail [order_detail_id=" + order_detail_id + ", order_id=" + order_id + ", item_id=" + item_id
				+ ", quantity=" + quantity + ", total_price=" + total_price + ", user_id=" + user_id + "]";
	}

	

}
