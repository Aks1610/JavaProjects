package intro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.io.IOException;

public class ComodityDetails {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter commodity id :");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter commodity name :");
		String name = br.readLine();
		System.out.println("Enter commodity price :");
		float price = Float.parseFloat(br.readLine());
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.printf("Commodity Id :" + id);
		System.out.printf("\nCommodity Name :" + name);
		System.out.printf("\nCommodity Price :" + df.format(price));
	}

}
