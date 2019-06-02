package loopsandconditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TotalPofit {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of months :");
		int nbrOfMonths = Integer.parseInt(br.readLine());

		int[] profit = new int[nbrOfMonths];
		int totalProfit = 0;

		if (nbrOfMonths <= 0) {
			System.out.println("Invalid Input");
		} else if (nbrOfMonths > 0) {
			System.out.println("Enter the profit of each month in shipment");
			for (int i = 0; i < nbrOfMonths; i++) {
				profit[i] = Integer.parseInt(br.readLine());
				totalProfit = totalProfit + profit[i];
			}
		}

		System.out.println("Total profit : " + totalProfit);
	}

}