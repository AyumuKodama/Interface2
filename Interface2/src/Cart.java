
public interface Cart {

	public void addItem(SelectedItem newItem);
	public void deleteItem(int deleteItemNumber);
	public double getTotal();
	public double getTax();
	public double getShipping();
	public String toString();
	
}
