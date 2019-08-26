package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numStoreItems = scan.nextInt();

		String[] itemName = new String[numStoreItems];
		double[] itemPrice = new double[numStoreItems];

		for (int i = 0; i < numStoreItems; i++) {
			itemName[i] = scan.next();
			itemPrice[i] = scan.nextDouble();
		}

		int numCustomers = scan.nextInt();

		double[] totalSpent = new double[numCustomers];
		String[] firstName = new String[numCustomers];
		String[] lastName = new String[numCustomers];

		for (int j = 0; j < numCustomers; j++) {
			firstName[j] = scan.next();
			lastName[j] = scan.next();

			int numItemsBought = scan.nextInt();

			for (int k = 0; k < numItemsBought; k++) {
				int itemBoughtQuantity = scan.nextInt();
				String itemBoughtName = scan.next();

				for (int l = 0; l < numStoreItems; l++) {
					if (itemName[l].equals(itemBoughtName)) {
						totalSpent[j] += itemPrice[l] * itemBoughtQuantity;

					}
				}
			}
		}

		double averageTotal = 0;

		double maxSpent = totalSpent[0];
		String maxSpentFirstName = firstName[0];
		String maxSpentLastName = lastName[0];

		double minSpent = totalSpent[0];
		String minSpentFirstName = firstName[0];
		String minSpentLastName = lastName[0];

		for (int i = 0; i < totalSpent.length; i++) {
			if (maxSpent < totalSpent[i]) {
				maxSpent = totalSpent[i];
				maxSpentFirstName = firstName[i];
				maxSpentLastName = lastName[i];			
			}

			if (minSpent > totalSpent[i]) {
				minSpent = totalSpent[i];
				minSpentFirstName = firstName[i];
				minSpentLastName = lastName[i];
			}

			averageTotal += totalSpent[i];
		}

		System.out.println("Biggest: " + maxSpentFirstName + " " + maxSpentLastName + " (" + String.format("%.2f", maxSpent) + ")");
		System.out.println("Smallest: " + minSpentFirstName + " " + minSpentLastName + " (" + String.format("%.2f", minSpent) + ")");
		System.out.println("Average: " + String.format("%.2f", averageTotal/numCustomers));

	}
}
