package bean;

public class OrderDetail {
	
	private int order_detail_id;
	private Integer order_id;
	private int item_id;
	private int quantity;
	private double total_price;
	private int user_id;
	private String name;
	private double price;
	private String color;
	private String size;
	private String category;
	private String image;
	public OrderDetail(int order_detail_id, Integer order_id, int item_id, int quantity, double total_price,
			int user_id, String name, double price, String color, String size, String category, String image) {
		super();
		this.order_detail_id = order_detail_id;
		this.order_id = order_id;
		this.item_id = item_id;
		this.quantity = quantity;
		this.total_price = total_price;
		this.user_id = user_id;
		this.name = name;
		this.price = price;
		this.color = color;
		this.size = size;
		this.category = category;
		this.image = image;
	}
	
	public int getOrder_detail_id() {
		return order_detail_id;
	}
	public void setOrder_detail_id(int order_detail_id) {
		this.order_detail_id = order_detail_id;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "OrderDetail [order_detail_id=" + order_detail_id + ", order_id=" + order_id + ", item_id=" + item_id
				+ ", quantity=" + quantity + ", total_price=" + total_price + ", user_id=" + user_id + ", name=" + name
				+ ", price=" + price + ", color=" + color + ", size=" + size + ", category=" + category + ", image="
				+ image + "]";
	}
	


	



	
	

	

}
