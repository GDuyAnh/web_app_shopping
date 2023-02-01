package bean;

public class Item {
	
	private int idItem;
	private String nameItem;
	private int category;
	private int color;
	private int size;
	private int amount;
	private double priceItem;
	private int type;
	private String imageURL;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int idItem, String nameItem, int category, int color, int size, int amount, double priceItem,
			int type, String imageURL) {
		super();
		this.idItem = idItem;
		this.nameItem = nameItem;
		this.category = category;
		this.color = color;
		this.size = size;
		this.amount = amount;
		this.priceItem = priceItem;
		this.type = type;
		this.imageURL = imageURL;
	}

	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public String getNameItem() {
		return nameItem;
	}

	public void setNameItem(String nameItem) {
		this.nameItem = nameItem;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getPriceItem() {
		return priceItem;
	}

	public void setPriceItem(double priceItem) {
		this.priceItem = priceItem;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	@Override
	public String toString() {
		return "ItemData [idItem=" + idItem + ", nameItem=" + nameItem + ", category=" + category + ", color=" + color
				+ ", size=" + size + ", amount=" + amount + ", priceItem=" + priceItem + ", type=" + type
				+ ", imageURL=" + imageURL + "]";
	}
	

}
