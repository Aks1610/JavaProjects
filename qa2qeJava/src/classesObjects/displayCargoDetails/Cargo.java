package classesObjects.displayCargoDetails;

public class Cargo {

    private String name;
    private String description;
    private Double width;
    private Double length;
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	public Double getLength() {
		return length;
	}
	public void setLength(Double length) {
		this.length = length;
	}
    
	public void displayCargoDetails() {
		System.out.println("Name : "+ getName() +"\n" + 
				"Description : "+ getDescription() +"\n" + 
				"Length : "+ getLength() +"\n" + 
				"Width : " + getWidth());
	}

}
