package classesObjects.displayCargoDetails;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Cargo cargoObject = new Cargo();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("The cargo details are:");
		System.out.println("Enter the name");
		cargoObject.setName(br.readLine());
		System.out.println("Enter the description");
		cargoObject.setDescription(br.readLine());
		System.out.println("Enter the length");
		cargoObject.setLength(Double.parseDouble(br.readLine()));
		System.out.println("Enter the width");
		cargoObject.setWidth(Double.parseDouble(br.readLine()));
		System.out.println("The cargo details are:");
		cargoObject.displayCargoDetails();
	}

}
