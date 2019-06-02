package intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ItemSearch {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of containers :");
		int containers = Integer.parseInt(br.readLine());
		System.out.println("Enter the item number :");
		int items = Integer.parseInt(br.readLine());
		System.out.println("Item number " + items + " will be in the container " + (items%containers == 0 ? containers : items%containers));
	}

}
