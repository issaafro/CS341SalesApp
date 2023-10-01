package dabney;

public class SalesItem {
	private String item;
	private double price;
	private int quantity;
	
	public SalesItem(String itemName, double itemPrice, int itemQuantity) {
		item = itemName;
		price = itemPrice;
		quantity = itemQuantity;
	}
	
	public double getTotal() {
		return quantity * price;
	}
	
	public String toString() {
		return item + "\t$" + String.format("%.2f", price) + "\t" + quantity;
	}
}
