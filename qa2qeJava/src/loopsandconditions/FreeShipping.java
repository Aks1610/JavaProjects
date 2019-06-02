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

		for (int i = 2; i <= ShipmentNbr / 2; ++i) {
			if (ShipmentNbr % i == 0) {
				flag = true;
			}
		}
		if (flag)
			System.out.println("Not Eligible for free shipping");
		else
			System.out.println("Eligible for free shipping");

	}

}
