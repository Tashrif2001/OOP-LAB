package foreach_class;

public class Main {

	public static void main(String[] args) {
		
		Grocery item[]=new Grocery[3];
		item[0] = new Grocery();
	    item[0].itemNames= "apple";
	    item[0].itemPrices = 45;
	    item[0].onSale = true;
	    item[0].itemQuantities = 5;
		System.out.println("Grocery List:");

		for (Grocery items : item) {

			System.out.print("- " + items.itemNames + ": ");
			System.out.print(items.itemQuantities + " x ");
			System.out.print("$" + items.itemPrices + " = ");
			double itemTotal = items.itemQuantities * items.itemPrices;
			System.out.print("$" + itemTotal);
			if (items.onSale) {
				System.out.print(" (on sale!)");
			}
			System.out.println();
		}
		
		
	}
}
