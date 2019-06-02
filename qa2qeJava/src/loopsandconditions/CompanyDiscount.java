package loopsandconditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompanyDiscount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the weight");
		int weight = Integer.parseInt(br.readLine());
		System.out.println("Enter the distance");
		int distance = Integer.parseInt(br.readLine());
		
		if (weight < 100 || distance < 500)
			System.out.println("Datex shipping offers discount");
		else
			System.out.println("Datex shipping offers no discount");
	}

}
