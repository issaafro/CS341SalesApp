package dabney;

import java.util.ArrayList;

public class SalesList {
	// DATA MEMBERS
	private ArrayList<SalesItem> allItems;
	
	// CONSTRUCTOR
	public SalesList() {
		allItems = new ArrayList<SalesItem>();
	}
	
	public void addNewItem(SalesItem salesItem) {
		// TASK 1: CREATE A NEW SALES ITEM AND ADD IT TO THE ARRAY
		allItems.add(salesItem);
	}
	
	public String getSalesList() {
		String str = "";
		for(int i = 0; i < allItems.size(); i++) {
			str += allItems.get(i).toString() + "\n";
		}
		return str;
	}
	
	public Double computeTotalAmount() {
		double totalAmount = 0;
		for(int i = 0; i < allItems.size(); i++) {
			totalAmount += allItems.get(i).getTotal();
		}
		return totalAmount;
	}

}
