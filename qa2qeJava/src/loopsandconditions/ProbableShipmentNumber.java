package loopsandconditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProbableShipmentNumber {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the range for shipment numbers :");
		int startRange = Integer.parseInt(br.readLine());
		int endRange = Integer.parseInt(br.readLine());
		int probShipNbr[] = new int[endRange-startRange];
	
		for (int i = startRange, j = 0; i <= endRange && j<=(endRange-startRange); i++) {
			if (i % 3 == 0) {
				probShipNbr[j] = i;
				System.out.println(probShipNbr[j]);
			}
			else if (probShipNbr.length == 0)
				System.out.println("Shipment numbers unavailable");
		}

	}

}
