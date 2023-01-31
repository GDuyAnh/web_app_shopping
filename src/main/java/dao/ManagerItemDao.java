package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import bean.Catalory;
import bean.Color;
import bean.Item;
import bean.Size;



public class ManagerItemDao {
	
	static private  ManagerItemDao instance;
	List<Item> items = null;
	
	private  ManagerItemDao() {
		
		items = new ArrayList<Item>();
		
		items.add(new Item(1, "Nike Jordan", Catalory.SHOES, Color.WHITE, Size.L , 20, 250, true, "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/b0dcd29c-9fe8-44fd-9b4d-a821cea0cacb/air-jordan-1-mid-shoes-SQf7DM.png"));
		items.add(new Item(1, "Nike Air Force 1", Catalory.SHOES, Color.BLACK, Size.L , 10, 200, true, "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/21d38052-598b-44f6-a857-123c9f72b015/air-force-1-07-shoes-WrLlWX.png"));
		items.add(new Item(1, "Nike Infinity", Catalory.SHOES, Color.PINK, Size.M , 10, 200, false, "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/e84d7e3d-2b5e-460e-bda3-cb8a1ac2a6e9/infinity-react-3-road-running-shoes-3Vn30D.png"));
		items.add(new Item(1, "Nike Blazer", Catalory.SHOES, Color.WHITE, Size.XL , 20, 300, true, "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/9c873d33-58ff-4a69-a28c-9deabb3631eb/blazer-mid-pro-club-shoes-xCk8SQ.png"));
		items.add(new Item(1, "Nike DUNK ", Catalory.SHOES, Color.BLUE, Size.L , 20, 100, true, "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/4145c43c-322a-43f0-98e4-bc88b1ea3ce2/dunk-low-retro-shoes-SHww49.png"));
		items.add(new Item(1, "Nike FIT Academy", Catalory.SHIRT, Color.WHITE, Size.L , 100, 50, true, "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/9d941c2a-2347-4417-b0d2-3df670b9fbf3/dri-fit-academy-short-sleeve-graphic-football-top-bBN0Ht.png"));
		items.add(new Item(1, "Nike PSG", Catalory.SHIRT, Color.WHITE, Size.XL , 50, 50, true, "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/c531ed68-5661-4592-9b43-652cb77af0a4/paris-saint-germain-t-shirt-wRTD3c.png"));
		items.add(new Item(1, "Nike Sportwear", Catalory.SHIRT, Color.PINK, Size.S , 20, 200, false, "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/91f83141-3ffd-4c21-b255-0760455998ec/sportswear-t-shirt-n7bNsJ.png"));
		items.add(new Item(1, "Nike Sportwear JDI", Catalory.SHIRT, Color.RED, Size.L , 10, 500, true, "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/d8febe12-9834-4fe9-8741-c76fcf4c9529/sportswear-jdi-t-shirt-fWxmBB.png"));
		items.add(new Item(1, "Nike Sportswear Futara ", Catalory.CAPS, Color.BLACK, Size.L , 1000, 20, true, "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/c06b0ac1-0cba-44c2-a1a2-5e78cd14e183/sportswear-heritage86-futura-washed-hat-9zdC2m.png"));
		items.add(new Item(1, "Nike Sportswear Classic", Catalory.CAPS, Color.WHITE, Size.L , 20, 20, true, "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/e063b0ae-5652-4b36-8cd7-befdcad1719e/sportswear-classic-99-cap-S41lbn.png"));
		items.add(new Item(1, "Nike Court", Catalory.CAPS, Color.WHITE, Size.L , 20, 10, true, "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/cd7215b4-bdcd-4412-b3b5-7a41b7dbf419/nikecourt-heritage86-logo-tennis-hat-QQz7pd.png"));
		items.add(new Item(1, "Nike Sportwear Air", Catalory.SHIRT, Color.WHITE, Size.XL , 20, 200, true, "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/de5b0c0d-029b-478b-8f4a-40bfdfa77aa8/sportswear-air-woven-over-shirt-top-q314V9.png"));
		
	   
	   
	   
		
	}
	
	
	public static ManagerItemDao getInstance() {
		if(instance == null) {
			instance = new ManagerItemDao();
		}
		return instance;
	}

	public List<Item> getAllItem() {
		return items;
	}
	
	public boolean addItem(Item item) {
		return this.items.add(item);
	}
	
	public boolean deleteItem(Item item) {
		return this.items.remove(item);
	}
	
	public List<Item> showItemByKey(Predicate<Item> predicate){
		
		return this.items.stream().filter(predicate).toList();
	}

}
