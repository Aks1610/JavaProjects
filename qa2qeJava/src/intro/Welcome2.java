package intro;

import java.util.Scanner;

public class Welcome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
        System.out.println ("Enter the name"); 
        String name = sc.nextLine(); 
        System.out.println ("Hello " + name + "! Get access to the unique shipping! ");
        sc.close();
	}

}
