
public class CartTester {

	public static void main(String[] args) {
		
		ShoppingCart cart1 = new ShoppingCart();
		cart1.addItem(new SelectedItem(1, "widget", 0.95, 5));
		cart1.addItem(new SelectedItem(2, "gadget", 0.25, 10));
		cart1.addItem(new SelectedItem(3, "doohickey", 0.35, 3));
		cart1.deleteItem(2);
		cart1.addItem(new SelectedItem(3, "doohickey", 0.35, 2));
		cart1.addItem(new SelectedItem(4, "thingamabob", 0.12, 7));
		System.out.println(cart1.toString());
		
		ShoppingCart cart2 = new ShoppingCart();
		for (int i = 1; i <= 1000; i++) {
			String nameString = "Volume " + i;
			cart2.addItem(new SelectedItem(i, nameString, 10.99, i));
		}
		System.out.println("**********");
		System.out.println(cart2.toString());
	}
}