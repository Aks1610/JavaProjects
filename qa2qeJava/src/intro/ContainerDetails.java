package intro;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ContainerDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the container number");
		String containerNbr = sc.nextLine();
		System.out.println("Enter the container length");
		float length = sc.nextFloat();
		System.out.println("Enter the container width");
		float width = sc.nextFloat();
		System.out.println("Enter the container height");
		float height = sc.nextFloat();
		System.out.println("Enter the container weight");
		float weight = sc.nextFloat();
		DecimalFormat de = new DecimalFormat("#.00");
		DecimalFormat df = new DecimalFormat("#.000");
		System.out.println("Container details\n" + 
				"Container number :"+ containerNbr +"\n" + 
				"Container length :"+ de.format(length) +"\n" + 
				"Container width :"+ de.format(width) +"\n" + 
				"Container height :"+ de.format(height) +"\n" + 
				"Container weight :"+ df.format(weight));
	}

}
