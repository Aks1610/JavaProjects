package intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class ItemDetails {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the item details");
		System.out.println("Enter the name of the item : Fish");
		String name = br.readLine();
		System.out.println("Enter the description : Sea Food");
		String desc = br.readLine();
		System.out.println("Enter the item number : 789462	");
		int itemNbr = Integer.parseInt(br.readLine());
		System.out.println("Enter the price : 12560.50");
		double price = Double.parseDouble((br.readLine()));
		System.out.println("Item Details");
		System.out.println("Name : " + name);
		System.out.println("Description : " + desc);
		System.out.println("Item Number : " + itemNbr);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Price : " + df.format(price));
	}

}
