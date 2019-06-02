package intro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.io.IOException;

public class AvgWeightofItemsinContainer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of items n1 :");
		int n1 = Integer.parseInt(br.readLine());
		System.out.println("Enter the weight of each item w1 :");
		float w1 = Float.parseFloat(br.readLine());
		System.out.println("Enter the number of items n2 :");
		int n2 = Integer.parseInt(br.readLine());
		System.out.println("Enter the weight of each item w2 :");
		float w2 = Float.parseFloat(br.readLine());
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("The average weight of the items in container :" + df.format((n1*w1+n2*w2)/(n1+n2)));
	}

}
