package classesObjects.displayAgentCompany;

public class Company {

    private int id;
    private String fmcCode;
    private String address;
    private String companyName;
	public Company(int id, String fmcCode, String address, String companyName) {
		super();
		this.id = id;
		this.fmcCode = fmcCode;
		this.address = address;
		this.companyName = companyName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFmcCode() {
		return fmcCode;
	}
	public void setFmcCode(String fmcCode) {
		this.fmcCode = fmcCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
