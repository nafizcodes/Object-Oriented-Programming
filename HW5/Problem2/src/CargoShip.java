public class CargoShip implements describable{
	private String name;
	private int tonnage;
	private String departPort;
	private String destinPort;
	
	
	public CargoShip(String name, int tonnage, String departPort, String destinPort) {
		this.name = name;
		this.tonnage = tonnage;
		this.departPort = departPort;
		this.destinPort = destinPort;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTonnage() {
		return tonnage;
	}
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}
	public String getDepartPort() {
		return departPort;
	}
	public void setDepartPort(String departPort) {
		this.departPort = departPort;
	}
	public String getDestinPort() {
		return destinPort;
	}
	public void setDestinPort(String destinPort) {
		this.destinPort = destinPort;
	}
	public String describeShip() {
		return toString();
	}

	@Override
	public String toString() {
		return "CargoShip [name=" + getName() + ", capacity=" + getTonnage() + ", departPort=" + getDepartPort()+ ", destinPort="
				+ getDestinPort() + "]";
	}
	
}
