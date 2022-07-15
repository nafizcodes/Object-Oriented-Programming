
public class ShipTest {
	public static void main(String[] args) {
		
		Yacht obj1 = new Yacht("Seagull", "1999", "Mexico");
		String[] visits = {"DALLAS", "AUSTIN","LUBBOCK"};
		CruiseShip obj2 = new CruiseShip("Titanic", visits, 100000);
		CargoShip obj3 = new CargoShip("Royal", 20000, "NEW YORK", "CALIFORNIA");
		
		
		describable[] myarray = new describable[3]; // declare an interface array of objects that implement describable
		
		myarray[0] = obj1;
		myarray[1] = obj2;
		myarray[2] = obj3;
		
		
		for (describable d: myarray ) {
			System.out.println(d.describeShip() + "\n");
		}
	}
}
