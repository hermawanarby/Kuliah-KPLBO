package inheritance;

public class People {
	private String name;
	private String address;
	
	public People() {
		
	}
	
	public People(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void display() {
		System.out.println("Name: " + name +
							"\nAddress : " + address);
	}
	
}
