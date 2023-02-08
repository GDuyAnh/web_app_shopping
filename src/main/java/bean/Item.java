package bean;

public class Item {
	
	private int itemId;
	private String itemName;
	private String color;
	private String size;
	private String type;
	private double price;
	private double discount_price;
	private String category;
	private String[] images;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int itemId, String itemName, String color, String size, String type, double price,
			double discount_price, String category, String[] images) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.color = color;
		this.size = size;
		this.type = type;
		this.price = price;
		this.discount_price = discount_price;
		this.category = category;
		this.images = images;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount_price() {
		return discount_price;
	}

	public void setDiscount_price(double discount_price) {
		this.discount_price = discount_price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", color=" + color + ", size=" + size + ", type="
				+ type + ", price=" + price + ", discount_price=" + discount_price + ", category=" + category + " image" + images[0] +"]";
	}
	
	



	
	
	
	
	
}
