package foreach;

public class Main {

	public static void main(String[] args) {
		String[] itemNames = {"apples", "bananas", "bread", "milk"};
		int[] itemQuantities = {3, 2, 1, 2};
		float[] itemPrices = {1.99f, 0.99f, 2.49f, 2.39f};
		boolean[] itemOnSale = {false, false, true, true};
		Grocery item[]=new Grocery[4];
		for(int i=0; i<4; i++) {
		item[i] = new Grocery();
	    item[i].itemNames= itemNames[i];
	    item[i].itemPrices = itemPrices[i];
	    item[i].onSale = itemOnSale[i];
	    item[i].itemQuantities = itemQuantities[i];
		}
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
