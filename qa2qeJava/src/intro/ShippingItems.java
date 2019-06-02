package intro;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ShippingItems {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of items :");
		int nbrOfItems = Integer.parseInt(br.readLine());
		System.out.println("Enter the weight of each item :");
		int weightEachItem = Integer.parseInt(br.readLine());
		System.out.println("Enter the capacity of a container :");
		int containerCapacity = Integer.parseInt(br.readLine());
		if(nbrOfItems*weightEachItem < containerCapacity) {
			System.out.println("Number of items that can be shipped in a container : " + nbrOfItems +"\n" + 
					"Number of items left out : " + 0);
		}else {
			System.out.println("Number of items that can be shipped in a container : " + containerCapacity/weightEachItem +"\n" + 
					"Number of items left out : " + (int) Math.ceil(((nbrOfItems*weightEachItem)-containerCapacity)/weightEachItem));
		}
		
	}

}
