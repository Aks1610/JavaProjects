package loopsandconditions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistanceBetweenPorts {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the distance of port1 :");
		int distancePort1 = Integer.parseInt(br.readLine());
		System.out.println("Enter the distance of port2 :");
		int distancePort2 = Integer.parseInt(br.readLine());
		
		if(distancePort1 <distancePort2)
			System.out.println("Port1 is closer than Port2");
		else if (distancePort2 < distancePort1)
			System.out.println("Port2 is closer than Port1");
		else if (distancePort1 == distancePort2)
			System.out.println("Both Port1 and Port2 are closer");
	}

}
