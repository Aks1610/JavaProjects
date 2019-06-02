package loopsandconditions;

import java.util.Scanner;

public class ValuableCustomer {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of shipments per month :");
		int no = sc.nextInt();
		if (no > 0 && no <= 20) {
			System.out.println("Not a valuable customer");
		} else if (no > 20) {
			System.out.println("Valuable customer");
		} else if (no < 0 || no == 0) {
			System.out.println("Invalid Input ");
		}
		sc.close();
	}
}
