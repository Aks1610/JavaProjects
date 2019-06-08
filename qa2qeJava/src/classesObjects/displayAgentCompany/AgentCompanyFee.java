package classesObjects.displayAgentCompany;

public class AgentCompanyFee {
	private Agent agent;
    private Company company;
    private Integer fees;
	public AgentCompanyFee(Agent agent, Company company, Integer fees) {
		super();
		this.agent = agent;
		this.company = company;
		this.fees = fees;
	}
	public Agent getAgent() {
		return agent;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Integer getFees() {
		return fees;
	}
	public void setFees(Integer fees) {
		this.fees = fees;
	}
	
	

}
