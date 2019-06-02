package loopsandconditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvaluateGrades {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the total number of countries : ");
		int countries = Integer.parseInt(br.readLine());
		System.out.println("Enter the total number of shipment per month : ");
		int nbrShipment = Integer.parseInt(br.readLine());

		if (countries > 150 && nbrShipment > 1500) {
			System.out.println("The company grade is : A");
		} else if (countries > 125 && nbrShipment > 1200) {
			System.out.println("The company grade is : B");
		} else if (countries > 100 && nbrShipment > 1000) {
			System.out.println("The company grade is : C");
		} else if (countries > 75 && nbrShipment > 700) {
			System.out.println("The company grade is : D");
		} else if ((countries > 0 && countries <= 75) && (nbrShipment >= 0 && nbrShipment <= 700)) {
			System.out.println("The company grade is : E");
		} else
			System.out.println("Invalid Input");
	}

}
