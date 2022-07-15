import java.util.ArrayList;

public class ShipTest {
    public static void main(String[] args){

        Ship ship1 = new Ship("Titanic", "1999");
        CruiseShip ship2 = new CruiseShip("Greyhound" , 200);
        CargoShip ship3 = new CargoShip("The Spear", 10000);

        ArrayList<Object> ship = new ArrayList<Object>();

        ship.add(ship1);
        ship.add(ship2);
        ship.add(ship3);

        for (int i=0 ; i < ship.size() ; i++){
            System.out.println(ship.get(i));
        }
     }   
}