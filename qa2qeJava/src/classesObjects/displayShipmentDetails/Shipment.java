package classesObjects.displayShipmentDetails;

import java.text.DecimalFormat;

public class Shipment {
	private int id;
	private String shipperName;
	private String modeOfTransportation;
	private Float totalWeight;
	private String arrivalPort;
	private String departurePort;
	private static int nextShipmentId = 1000;
	public Shipment(int id, String shipperName, String modeOfTransportation, Float totalWeight, String arrivalPort,
			String departurePort) {
		super();
		this.id = id;
		this.shipperName = shipperName;
		this.modeOfTransportation = modeOfTransportation;
		this.totalWeight = totalWeight;
		this.arrivalPort = arrivalPort;
		this.departurePort = departurePort;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShipperName() {
		return shipperName;
	}
	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}
	public String getModeOfTransportation() {
		return modeOfTransportation;
	}
	public void setModeOfTransportation(String modeOfTransportation) {
		this.modeOfTransportation = modeOfTransportation;
	}
	public Float getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(Float totalWeight) {
		this.totalWeight = totalWeight;
	}
	public String getArrivalPort() {
		return arrivalPort;
	}
	public void setArrivalPort(String arrivalPort) {
		this.arrivalPort = arrivalPort;
	}
	public String getDeparturePort() {
		return departurePort;
	}
	public void setDeparturePort(String departurePort) {
		this.departurePort = departurePort;
	}
	
	public static Shipment createNewShipment(String shipperName,String modeOfTransportation,Float totalWeight,String arrivalPort,String departurePort) {
		nextShipmentId++;
		int id = nextShipmentId;
		Shipment shipment = new Shipment(id, shipperName, modeOfTransportation, totalWeight, arrivalPort, departurePort);
	
		return shipment;
	}
	
	public static void displayShipmentDetails(Shipment shipment) {
		System.out.println(shipment);
	}
	
	@Override
	public String toString(){
	DecimalFormat format = new DecimalFormat("0.##");
	String weight = format.format(this.totalWeight);
	return String.format(("%-15d%-15s%-25s%-15s%-20s%s"),
	this.id,
	this.shipperName,
	this.modeOfTransportation,
	weight+ "Kg",
	this.arrivalPort,this.departurePort);
	 
	}

}
