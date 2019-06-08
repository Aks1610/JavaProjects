package classesObjects.displayAgentCompany;

public class Agent {

	private String fmcCode;
	private String iataCode;
	private String address;
	private String name;

	public Agent(String fmcCode, String iataCode, String address, String name) {
		super();
		this.fmcCode = fmcCode;
		this.iataCode = iataCode;
		this.address = address;
		this.name = name;
	}

	public String getFmcCode() {
		return fmcCode;
	}

	public void setFmcCode(String fmcCode) {
		this.fmcCode = fmcCode;
	}

	public String getIataCode() {
		return iataCode;
	}

	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
