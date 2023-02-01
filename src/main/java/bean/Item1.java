package bean;

public class Item1 {
	
	private int idItem;
	private String nameItem;
	Catalory cataloryItem;
	Color colorItem;
	Size sizeItem;
	private int amountItem;
	private double priceItem;
	private boolean genderItem;
	private String imageURL;
	
	public Item1() {
		// TODO Auto-generated constructor stub
	}

	public Item1(int idItem, String nameItem, Catalory cataloryItem, Color colorItem, Size sizeItem, int amountItem,
			double priceItem, boolean genderItem, String imageURL) {
		super();
		this.idItem = idItem;
		this.nameItem = nameItem;
		this.cataloryItem = cataloryItem;
		this.colorItem = colorItem;
		this.sizeItem = sizeItem;
		this.amountItem = amountItem;
		this.priceItem = priceItem;
		this.genderItem = genderItem;
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

	public Catalory getCataloryItem() {
		return cataloryItem;
	}

	public void setCataloryItem(Catalory cataloryItem) {
		this.cataloryItem = cataloryItem;
	}

	public Color getColorItem() {
		return colorItem;
	}

	public void setColorItem(Color colorItem) {
		this.colorItem = colorItem;
	}

	public Size getSizeItem() {
		return sizeItem;
	}

	public void setSizeItem(Size sizeItem) {
		this.sizeItem = sizeItem;
	}

	public int getAmountItem() {
		return amountItem;
	}

	public void setAmountItem(int amountItem) {
		this.amountItem = amountItem;
	}

	public double getPriceItem() {
		return priceItem;
	}

	public void setPriceItem(double priceItem) {
		this.priceItem = priceItem;
	}

	public boolean isGenderItem() {
		return genderItem;
	}

	public void setGenderItem(boolean genderItem) {
		this.genderItem = genderItem;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	@Override
	public String toString() {
		return "Item [idItem=" + idItem + ", nameItem=" + nameItem + ", cataloryItem=" + cataloryItem + ", colorItem="
				+ colorItem + ", sizeItem=" + sizeItem + ", amountItem=" + amountItem + ", priceItem=" + priceItem
				+ ", genderItem=" + genderItem + ", imageURL=" + imageURL + "]";
	}
	
	
	
	
	
}
