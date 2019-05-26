package intro;

import java.util.Scanner;

public class displayUserDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User Details  :");
		System.out.println("Enter the id :");
		int id = sc.nextInt();
		System.out.println("Enter the name :");
		String name = sc.next();
		System.out.println("Enter the username :");
	    String username = sc.next();
	    System.out.println("Enter the password :");
		String password = sc.next();
		System.out.println("Enter the mobilenumber :");
		String mobileNbr = sc.next();
		System.out.println("Enter the rating :");
		Double rating = sc.nextDouble();
		System.out.println("User details are :"+"\nId : " + id + "\nName : " + name +"\nUsername : " + username + "\nMobile Number : " + mobileNbr +"\nRating : " + rating);
		sc.close();
	}
}