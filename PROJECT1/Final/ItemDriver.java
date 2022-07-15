import java.util.Scanner;
import java.util.*;


public class ItemDriver {

    Scanner sc = new Scanner(System.in);

    public void date(){
        Date d1 = new Date();
        System.out.print("\nCurrent date is " + d1);
    }

    public void Catalog(){
        System.out.print(
        "                                                     List of Items                                                          " +
        "\nOptions     Name                  Description                         Regular Price($)/Lb            SalesPrice($)        " +
        "\n(1)         Apple                   Fruit                                   8.0                      6.5                " +
        "\n(2)         Carrot                 Vegetable                                6.0                      4.5                " +
        "\n(3)         Chicken                  Meat                                   12.0                     10.5               " +
        "\n(4)         Beef                     Meat                                   20.0                     18.5               " +
        "\n(5)         Orange                   Fruit                                  9.0                      7.5                " +
        "\n(6)         Mango                    Fruit                                  10.0                     8.5                " +
        "\n(7)         Tomato                 Vegeatable                               8.0                      7.5                " +
        "\n(8)         Cabbage                Vegeatable                               10.0                     9.0                " +
        "\n(9)         Pizza                  Frozen Food                              20.0                     16.5               " +
        "\n(10)        Ranch                   Dressing                                12.0                     10.0               " 
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
            Cart.addItem(item1, amount);
            break;

            case 2:
            Item item2 = new Item("Carrot", "Vegetable", 6.0, 4.5);
            System.out.print("\nEnter the quantity(per Lb): ");
            amount = sc.nextDouble();
            Cart.addItem(item2, amount);
            break;

            case 3:
            Item item3 = new Item("Chicken", "Meat", 12.0, 10.5);
            System.out.print("\nEnter the quantity(per Lb): ");
            amount = sc.nextDouble();
            Cart.addItem(item3, amount);
            break;

            case 4:
            Item item4 = new Item("Beef", "Meat", 20.0, 18.5);
            System.out.print("\nEnter the quantity(per Lb): ");
            amount = sc.nextDouble();
            Cart.addItem(item4, amount);
            break;

            case 5:
            Item item5 = new Item("Orange", "Fruit", 9.0, 7.5);
            System.out.print("\nEnter the quantity(per Lb): ");
            amount = sc.nextDouble();
            Cart.addItem(item5, amount);
            break;

            case 6:
            Item item6 = new Item("Mango", "Fruit", 10.0, 8.5);
            System.out.print("\nEnter the quantity(per Lb): ");
            amount = sc.nextDouble();
            Cart.addItem(item6, amount);
            break;

            case 7:
            Item item7 = new Item("Tomato", "Vegetable", 8.0, 7.5);
            System.out.print("\nEnter the quantity(per Lb): ");
            amount = sc.nextDouble();
            Cart.addItem(item7, amount);
            break;

            case 8:
            Item item8 = new Item("Cabbage", "Vegetable", 10.0, 9.0);
            System.out.print("\nEnter the quantity(per Lb): ");
            amount = sc.nextDouble();
            Cart.addItem(item8, amount);
            break;

            case 9:
            Item item9 = new Item("Pizza", "Frozen Food", 20.0, 16.5);
            System.out.print("\nEnter the quantity(per Lb): ");
            amount = sc.nextDouble();
            Cart.addItem(item9, amount);
            break;

            case 10:
            Item item10 = new Item("Ranch", "Dressing", 12.0, 10.0);
            System.out.print("\nEnter the quantity(per Lb): ");
            amount = sc.nextDouble();
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