package classesObjects.displayShipmentDetails;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
	public class Main {
	
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the number of shipments :");
			int nbrOfShipment = Integer.parseInt(br.readLine());
			Shipment[] shipment = new Shipment[nbrOfShipment];
	
			for (int i = 0; i < nbrOfShipment; i++) {
				System.out.println("Enter the shipment" + (i + 1) + "details");
				System.out.println("Enter the shipper name :");
				String n = br.readLine();
				System.out.println("Enter the mode of transportation :");
				String t = br.readLine();
				System.out.println("Enter the total weight :");
				float w = Float.parseFloat(br.readLine());
				System.out.println("Enter the arrival port :");
				String a = br.readLine();
				System.out.println("Enter the departure port :");
				String d = br.readLine();
				
				shipment[i] = Shipment.createNewShipment(n, t, w, a, d);
			}
	
			System.out.println("Shipment details are");
	
			System.out.format(("%-15s%-15s%-25s%-15s%-20s%s%n"), "Id", "Shippername", "Mode of transportation",
					"Total weight", "Arrival port", "Departure port");
			
			for(int i = 0; i < nbrOfShipment; i++) {
				Shipment.displayShipmentDetails(shipment[i]);
			}
		}
	
	}
