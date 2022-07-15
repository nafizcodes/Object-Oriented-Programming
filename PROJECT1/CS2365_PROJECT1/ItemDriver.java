import java.util.Scanner;
import java.util.*;


public class ItemDriver {

    Scanner sc = new Scanner(System.in);
   // static ArrayList<Double> ItemStock = new ArrayList<Double>();
    static double[] UpdatedStock = new double[]{3000, 50000,20000,15000,6000,9000,4000,1000,500,400};

    public void date(){
        Date d1 = new Date();
        System.out.print("\nCurrent date is " + d1);
    }

    public void Catalog(){
        System.out.print(
        "                                                                List of Items                                                                             " +
        "\nOptions     Name                  Description                         Regular Price($)/Lb            SalesPrice($)        Stock Available(Lb)" +
        "\n(1)         Apple                   Fruit                                   8.0                      6.5                        3000" +
        "\n(2)         Carrot                 Vegetable                                6.0                      4.5                        5000" +
        "\n(3)         Chicken                  Meat                                   12.0                     10.5                       20000" +
        "\n(4)         Beef                     Meat                                   20.0                     18.5                       15000" +
        "\n(5)         Orange                   Fruit                                  9.0                      7.5                        6000" +
        "\n(6)         Mango                    Fruit                                  10.0                     8.5                        9000" +
        "\n(7)         Tomato                 Vegeatable                               8.0                      7.5                        4000" +
        "\n(8)         Cabbage                Vegeatable                               10.0                     9.0                        1000" +
        "\n(9)         Potato                 Vegeatable                               20.0                     16.5                       500" +
        "\n(10)        Avocado                  Fruit                                  12.0                     10.0                       400" 
        );
    }
    
    public void SelectItems(){
        int input;
        boolean notexit= true;
        while (notexit){
        System.out.print("\n---------------------------------------Enter item option to select item -------------------------------------------- " +
                         "\n-------------------------(Press 0 to end the order and see the current cart balance)------------------------\n"+
                         "                                           Option: ");
        input = sc.nextInt();
        double amount;

       

        switch(input){
            case 1:
            Item item1 = new Item("Apple", "Fruit", 8.0, 6.5);
            System.out.print("\nEnter the quantity(per Lb): ");
            amount = sc.nextDouble();
            UpdatedStock[0]  -= amount;
            Cart.addItem(item1, amount);
            break;

            case 2:
            Item item2 = new Item("Carrot", "Vegetable", 6.0, 4.5);
            System.out.print("\nEnter the quantity(per Lb): ");
            amount = sc.nextDouble();
            UpdatedStock[1]  -= amount;
            Cart.addItem(item2, amount);
            break;

            case 3:
            Item item3 = new Item("Chicken", "Meat", 12.0, 10.5);
            System.out.print("\nEnter the quantity(per Lb): ");
            amount = sc.nextDouble();
            UpdatedStock[2]  -= amount;
            Cart.addItem(item3, amount);
            break;

            case 4:
            Item item4 = new Item("Beef", "Meat", 20.0, 18.5);
            System.out.print("\nEnter the quantity(per Lb): ");
            amount = sc.nextDouble();
            UpdatedStock[3]  -= amount;
            Cart.addItem(item4, amount);
            break;

            case 5:
            Item item5 = new Item("Orange", "Fruit", 9.0, 7.5);
            System.out.print("\nEnter the quantity(per Lb): ");
            amount = sc.nextDouble();
            UpdatedStock[4]  -= amount;
            Cart.addItem(item5, amount);
            break;

            case 6:
            Item item6 = new Item("Mango", "Fruit", 10.0, 8.5);
            System.out.print("\nEnter the quantity(per Lb): ");
            amount = sc.nextDouble();
            UpdatedStock[5]  -= amount;
            Cart.addItem(item6, amount);
            break;

            case 7:
            Item item7 = new Item("Tomato", "Vegetable", 8.0, 7.5);
            System.out.print("\nEnter the quantity(per Lb): ");
            amount = sc.nextDouble();
            UpdatedStock[6]  -= amount;
            Cart.addItem(item7, amount);
            break;

            case 8:
            Item item8 = new Item("Cabbage", "Vegetable", 10.0, 9.0);
            System.out.print("\nEnter the quantity(per Lb): ");
            amount = sc.nextDouble();
            UpdatedStock[7]  -= amount;
            Cart.addItem(item8, amount);
            break;

            case 9:
            Item item9 = new Item("Potato", "Vegetable", 20.0, 16.5);
            System.out.print("\nEnter the quantity(per Lb): ");
            amount = sc.nextDouble();
            UpdatedStock[8]  -= amount;
            Cart.addItem(item9, amount);
            break;

            case 10:
            Item item10 = new Item("Avocado", "Fruit", 12.0, 10.0);
            System.out.print("\nEnter the quantity(per Lb): ");
            amount = sc.nextDouble();
            UpdatedStock[9]  -= amount;
            Cart.addItem(item10, amount);
            break;

            case 0:
            notexit = false;
            System.out.println("\n---------------------Transaction Summary-----------------------------\n");
            System.out.print("\n---------"); 
            date();
            System.out.println(" -----------");

        
            System.out.println("Item" + "    " +"Price($)" + "     "+ "Quantity(in Lb)\n");
            Cart.printCart();
            System.out.print("\n------------------------------------------------------------------\n");
            System.out.println("\nTotal Balance is $" + String.format("%.2f", Cart.calculateTotal())+ "\n\n");
            System.out.println("**********************************************************************************");
            break;

            default:
            break;
        }
        }
    }
}