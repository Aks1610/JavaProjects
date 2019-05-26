package intro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class displayAgentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the agent details");
			System.out.println("Enter the agent name :");
			String name = br.readLine();
			System.out.println("Enter the identification number :");
			String id = br.readLine();
			System.out.println("Enter the accountNumber :");
			String acc = br.readLine();
			System.out.println("Enter the creditLimit :");
			String cre = br.readLine();
			Double credit = Double.parseDouble(cre);
			DecimalFormat df = new DecimalFormat("#.00");
			System.out.println("Agent details are" + "\nName : " + name + "\nIdentification Number : " + id
					+ "\nAccount Number : " + acc + "\nCredit Limit : " + df.format(credit));

		} catch (Exception e) {
			System.out.println(e);

		}

	}

}