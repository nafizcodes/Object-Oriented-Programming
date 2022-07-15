import java.util.Scanner;

public class CarpetTest {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");
        double len = sc.nextDouble();

        System.out.print("Enter the width: ");
        double w = sc.nextDouble();

        System.out.print("Enter the cost per square foot: ");
        double inputCost = sc.nextDouble();

        RoomDimension dimensionObject = new RoomDimension(len , w);

        RoomCarpet carpetObject = new RoomCarpet(dimensionObject, inputCost);

        System.out.print(carpetObject);

        System.exit(0);
    }
}   
