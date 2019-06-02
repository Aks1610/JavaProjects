package loopsandconditions;

import java.util.*;

public class ShippingClassification {
	public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shipment code :");
        String code = sc.nextLine();
        switch(code){
        case"100": System.out.println("Airway");break;
        case"010": System.out.println("Waterway");break;
        case"001": System.out.println("Roadway");break;
        case"110": System.out.println("Airway and Waterway");break;
        case"101": System.out.println("Airway and Roadway");break;
        case"011": System.out.println("Waterway and Roadway");break;
        case"111": System.out.println("All ways");break;
        }
	}
	}
