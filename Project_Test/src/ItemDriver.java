import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.*;


public class ItemDriver {

    Scanner sc = new Scanner(System.in);
   // static ArrayList<Double> ItemStock = new ArrayList<Double>();
    static double[] UpdatedStock = new double[]{3000, 50000,20000,15000,6000,9000,4000,1000,500,400};

    public void date(){
        Date d1 = new Date();
        JOptionPane.showMessageDialog(null,"\nCurrent date is " + d1);
    }

    public void Catalog(){
    	JOptionPane.showMessageDialog(null,
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
        String input_str =	JOptionPane.showInputDialog(
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
        	           
        		+ "\n---------------------------------------Enter item option to select item -------------------------------------------- " +
                         "\n-------------------------(Press 0 to end the order and see the current cart balance)------------------------\n"+
                         "                                           Option: ");
        input = Integer.parseInt(input_str);
        double amount;

       

        switch(input){
            case 1:
            Item item1 = new Item("Apple", "Fruit", 8.0, 6.5);
            String amountstr1 = JOptionPane.showInputDialog("\nEnter the quantity of Apple(per Lb): ");
            amount = Double.parseDouble(amountstr1);
            UpdatedStock[0]  -= amount;
            Cart.addItem(item1, amount);
            break;

            case 2:
            Item item2 = new Item("Carrot", "Vegetable", 6.0, 4.5);
            String amountstr2 = JOptionPane.showInputDialog("\nEnter the quantity of Carrot(per Lb): ");
            amount = Double.parseDouble(amountstr2);
            UpdatedStock[1]  -= amount;
            Cart.addItem(item2, amount);
            break;

            case 3:
            Item item3 = new Item("Chicken", "Meat", 12.0, 10.5);
            String amountstr3 = JOptionPane.showInputDialog("\nEnter the quantity of Chicken(per Lb): ");
            amount = Double.parseDouble(amountstr3);
            UpdatedStock[2]  -= amount;
            Cart.addItem(item3, amount);
            break;

            case 4:
            Item item4 = new Item("Beef", "Meat", 20.0, 18.5);
            String amountstr4 = JOptionPane.showInputDialog("\nEnter the quantity of Beef(per Lb): ");
            amount = Double.parseDouble(amountstr4);
            UpdatedStock[3]  -= amount;
            Cart.addItem(item4, amount);
            break;

            case 5:
            Item item5 = new Item("Orange", "Fruit", 9.0, 7.5);
            String amountstr5 = JOptionPane.showInputDialog("\nEnter the quantity of Orange(per Lb): ");
            amount = Double.parseDouble(amountstr5);
            UpdatedStock[4]  -= amount;
            Cart.addItem(item5, amount);
            break;

            case 6:
            Item item6 = new Item("Mango", "Fruit", 10.0, 8.5);
            String amountstr6 = JOptionPane.showInputDialog("\nEnter the quantity of Mango(per Lb): ");
            amount = Double.parseDouble(amountstr6);
            UpdatedStock[5]  -= amount;
            Cart.addItem(item6, amount);
            break;

            case 7:
            Item item7 = new Item("Tomato", "Vegetable", 8.0, 7.5);
            String amountstr7 = JOptionPane.showInputDialog("\nEnter the quantity of Tomato(per Lb): ");
            amount = Double.parseDouble(amountstr7);
            UpdatedStock[6]  -= amount;
            Cart.addItem(item7, amount);
            break;

            case 8:
            Item item8 = new Item("Cabbage", "Vegetable", 10.0, 9.0);
            String amountstr8 = JOptionPane.showInputDialog("\nEnter the quantity of Cabbage(per Lb): ");
            amount = Double.parseDouble(amountstr8);
            UpdatedStock[7]  -= amount;
            Cart.addItem(item8, amount);
            break;

            case 9:
            Item item9 = new Item("Potato", "Vegetable", 20.0, 16.5);
            String amountstr9 = JOptionPane.showInputDialog("\nEnter the quantity of Potato(per Lb): ");
            amount = Double.parseDouble(amountstr9);
            UpdatedStock[8]  -= amount;
            Cart.addItem(item9, amount);
            break;

            case 10:
            Item item10 = new Item("Avocado", "Fruit", 12.0, 10.0);
            String amountstr10 = JOptionPane.showInputDialog("\nEnter the quantity of Avocado(per Lb): ");
            amount = Double.parseDouble(amountstr10);
            UpdatedStock[9]  -= amount;
            Cart.addItem(item10, amount);
            break;

            case 0:
            notexit = false;
            Cart.printFinalCart();
            break;

            default:
            break;
        }
        }
    }
}