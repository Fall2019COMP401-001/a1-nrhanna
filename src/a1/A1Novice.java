package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numCustomers = scan.nextInt();

		for (int i = 0; i < numCustomers; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int numItemsBought = scan.nextInt();

			double totalSpent = 0;

			for (int j = 0; j < numItemsBought; j++) {
				int quantityOfEachItemBought = scan.nextInt();
				String itemName = scan.next();
				double itemPrice = scan.nextDouble();

				totalSpent = totalSpent + itemPrice * quantityOfEachItemBought;

			}

			System.out.println(firstName.charAt(0) + ". " + lastName + ": " + String.format("%.2f", totalSpent));

		}
	}
}
