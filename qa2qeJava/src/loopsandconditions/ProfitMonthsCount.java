package loopsandconditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProfitMonthsCount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the total number of months");
		int nbrOfMonths = Integer.parseInt(br.readLine());

		double[] profit = new double[nbrOfMonths];
		int nbrOfProfitMonths = 0;

		if (nbrOfMonths <= 0) {
			System.out.println("Invalid Input");
		} else if (nbrOfMonths > 0) {
			System.out.println("Enter the profit amount of shipment in each month");
			for (int i = 0; i < nbrOfMonths; i++) {
				profit[i] = Double.parseDouble((br.readLine()));
				if (profit[i] > 100000)
					nbrOfProfitMonths = nbrOfProfitMonths + 1;
			}
		}

		System.out.println("Profit value has exceeded Rs. 100000 for " + nbrOfProfitMonths + " month(s).");
	}

}
