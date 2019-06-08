package loopsandconditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FreeShipping {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the shipment number :");
		int ShipmentNbr = Integer.parseInt(br.readLine());
		boolean flag = false;
		int nbrToBeSumed = ShipmentNbr;
		int sum = 0;

		if (ShipmentNbr == 0 || ShipmentNbr == 1) {
			System.out.println("Not Eligible for free shipping");
		} else {
			for (sum = 0; nbrToBeSumed > 0; sum += nbrToBeSumed % 10, nbrToBeSumed /= 10)
				;

			for (int i = 2; i <= sum / 2; i++) {
				if (sum % i == 0) {
					flag = true;
					break;
				}
			}
			if (flag)
				System.out.println("Not Eligible for free shipping");
			else
				System.out.println("Eligible for free shipping");
		}

	}
}
