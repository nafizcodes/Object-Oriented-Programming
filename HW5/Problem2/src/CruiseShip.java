import java.util.Arrays;

public class CruiseShip implements describable{
	private String name;
	private String visits[];
	private int max_passengers;
	
	public CruiseShip(String name, String[] visits, int max_passengers) {
		this.name = name;
		this.visits = visits;
		this.max_passengers = max_passengers;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String[] getVisits() {
		return visits;
	}

	public void setVisits(String[] visits) {
		this.visits = visits;
	}

	public int getMax_passengers() {
		return max_passengers;
	}

	public void setMax_passengers(int max_passengers) {
		this.max_passengers = max_passengers;
	}
	
	public String describeShip() {
		return toString();
	}

	@Override
	public String toString() {
		return "CruiseShip [name=" + getName() + ", cities visited =" + Arrays.toString(visits)
				+ ", max_passengers=" + getMax_passengers() + "]";
	}

}
