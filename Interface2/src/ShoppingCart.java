import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingCart implements Cart {

	ArrayList<SelectedItem> cartItems = new ArrayList<SelectedItem>();
	private double total;
	private double tax;
	private double shipping;
	
	public void addItem(SelectedItem newItem) {
		if (cartItems.contains(newItem)) {
			newItem.setQuantity(1);
		} else {
			cartItems.add(newItem);
		}
	}
	
	public void deleteItem(int deleteItemNumber) {
		for (int i = 0; i < cartItems.size(); i++) {
			if (deleteItemNumber == cartItems.get(i).getItemNumber()) {
				cartItems.remove(i);
			}
		}
	}
	
	public double getTotal() {
		for (int i = 0; i < cartItems.size(); i++) {
			total += cartItems.get(i).getUnitPrice() * cartItems.get(i).getQuantity();
		}
		return total;
	}
	
	public double getTax() {
		tax = total * 0.045;
		return tax;
	}
	
	public double getShipping() {
		if (getTotal() <= 10) {
			shipping = 2.50;
		} else {
			shipping = total * 0.15;
		}
		return shipping;
	}
	
	public String toString() {
		String temp;
		String str = "";
		
		for (int i = 0; i < cartItems.size(); i++) {
			temp = "Item: " +  cartItems.get(i).getDescription() + "\nQuantity: " + cartItems.get(i).getQuantity() + 
					"\nUnit Price: $" + cartItems.get(i).getUnitPrice() + "\nTotal Price: $" + 
					cartItems.get(i).getUnitPrice() * cartItems.get(i).getQuantity() + "\n\n"; 
			str += temp;
		} 
		double taxRound = getTax() * 100;
		double shippingRound = Math.floor(getShipping() * 100) / 100;
		String str1 = "Total: $" + getTotal() + "\nTax: $" + getTax() + "\nShipping: $" + getShipping() +
				"\nGRAND TOTAL: $" + (getTotal() + getTax() + getShipping());
		
		return str + str1;
	}
	
}
