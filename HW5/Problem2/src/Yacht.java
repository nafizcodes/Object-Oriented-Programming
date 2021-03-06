public class Yacht implements describable {
	private String name;
	private String year;
	private String owner;

	public Yacht(String name, String year, String owner) {
		this.name = name;
		this.year = year;
		this.owner = owner;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String describeShip() {
		return toString();
	}
	
	@Override
	public String toString() {
		return "Yacht [name=" + getName() + ", year=" + getYear() + ", owner=" + getOwner() + "]";
	}
	
}
