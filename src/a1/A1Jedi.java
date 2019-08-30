package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numStoreItems = scan.nextInt();

		String[] itemName = new String[numStoreItems];
		int[] howManyBought = new int[numStoreItems];
		int[] howManyCustomers = new int[numStoreItems];
		for (int i = 0; i < numStoreItems; i++) {
			itemName[i] = scan.next();
			double price = scan.nextDouble();
		}

		int numberOfCustomers = scan.nextInt();

		for (int i = 0; i < numberOfCustomers; i++) {
			boolean[] customerAdded = new boolean[numStoreItems];
			String firstName = scan.next();
			String lastName = scan.next();
			int numItemsBought = scan.nextInt();

			for (int j = 0; j < numItemsBought; j++) {
				int itemBoughtQuantity = scan.nextInt();
				String itemBoughtName = scan.next();
				for (int k = 0; k < numStoreItems; k++) {
					if (itemName[k].equals(itemBoughtName)) {
						howManyBought[k] += itemBoughtQuantity;
						if (customerAdded[k] == false) {
							howManyCustomers[k] += 1;
							customerAdded[k] = true;

						}
					} 
				}
			}
		}

		for (int j = 0; j < numStoreItems; j++) {
			if (howManyCustomers[j] == 0) {
				System.out.println("No customers bought " + itemName[j]);

			} else {
				System.out.println(howManyCustomers[j] + " customers bought " + howManyBought[j] + " " + itemName[j]);

			}
		}
	}
}		
