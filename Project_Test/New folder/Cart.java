import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cart {

    static Scanner sc = new Scanner(System.in);

    private static double ShippingPrice = 3;                      // Price for shipping

    public static Map<Item, Double> cartlist = new HashMap<>();      // Storage of items <Item - quantity>

    private static double total;                                   // Total price of all cart items
                             
    
    public void date(){
        Date d1 = new Date();
        JOptionPane.showMessageDialog(null,"\nCurrent date is " + d1);
    }
    
    public static void printCart(){
    	StringBuilder sb = new StringBuilder();
        for(Map.Entry<Item, Double> entry : cartlist.entrySet()){
            Item i = entry.getKey();
            Double value = entry.getValue();
            
            JOptionPane.showMessageDialog(null, i.getName()+ "     " + i.getSalePrice() + "             " + value);
            
             
            }
        }
    
    public static void printOrderedCart(){
    	StringBuilder sb = new StringBuilder();
    	sb.append("\nOrder Processing.....\nOrder Status:Ordered"+
		"\n---------------------------------Customer's Order----------------------------------\n\n" +
        "Item" + "    " +"Price($)" + "     "+ "Quantity(in Lb)\n");
    	
        for(Map.Entry<Item, Double> entry : cartlist.entrySet()){
            Item i = entry.getKey();
            Double value = entry.getValue();
            
            sb.append( i.getName()+ "     " + i.getSalePrice() + "             " + value + "\n");
            
             
            }
        	sb.append("\n\nChecking Stock...\n");
        for ( int i = 0 ; i<10 ; i++) {
			if (ItemDriver.UpdatedStock[i] < 0) {
				sb.append("Item " + OrderControl.ItemNames.get(i) + " is out of stock.\n\n");
		}else {
			sb.append(OrderControl.ItemNames.get(i) + " Stock Available\n");
		}
        }
        
        for ( int i = 0 ; i<10 ; i++) {
			if ( ItemDriver.UpdatedStock[i] < 0 ) {
				sb.append(OrderControl.ItemNames.get(i) +" item needs to be refilled");
				sb.append("\nOrder cannot be processed at this time due to low stock of items.");
				System.exit(0);
			}
		}
        JOptionPane.showMessageDialog(null, sb);
        
    }
    
    
    public static void printFinalCart(){
    	StringBuilder sb = new StringBuilder();
    	sb.append("\n---------------------Transaction Summary-----------------------------\n"+
                "Item" + "    " +"Price($)" + "     "+ "Quantity(in Lb)\n");
        for(Map.Entry<Item, Double> entry : cartlist.entrySet()){
            Item i = entry.getKey();
            Double value = entry.getValue();
            
            sb.append( i.getName()+ "     " + i.getSalePrice() + "             " + value + "\n");
            
            
        }
        sb.append(
                "\n------------------------------------------------------------------\n" +
                "\nTotal Balance is $" + String.format("%.2f", Cart.calculateTotal())+ " with 8.5% Tax.\n\n" +
                "************************************************************************");
        JOptionPane.showMessageDialog(null, sb);
    }
   
    
    public static void printCurrentCart(){
    	 
    	StringBuilder sb = new StringBuilder();
    	sb.append("\n\n---------------------------------Current Cart----------------------------------\n\n"
                + "Item" + "    " +"Price($)" + "     "+ "Quantity(in Lb)\n");
        for(Map.Entry<Item, Double> entry : cartlist.entrySet()){
        	
            Item i = entry.getKey();
            Double value = entry.getValue();
            
            sb.append( i.getName()+ "     " + i.getSalePrice() + "             " + value + "\n");
            
        }
        JOptionPane.showMessageDialog(null, sb);
    }

    public static void addItem(Item item, double amount) {
        cartlist.put(item, amount);

        Cart.printCurrentCart();
    }

    public static double calculateTotal() {
        double tax_rate = 0.0825;
        double tax;
        int choice;
        
        for (Item i : cartlist.keySet()) {
            double price = i.getSalePrice();
            double quantity = cartlist.get(i);
            total += price*quantity;
        }
     
        String choice_input = JOptionPane.showInputDialog("\nChoose Delivery Options:"+
                           "\n1. Pick up - Free"+
                           "\n2. By mail - $3 charge\n Enter option(1 or 2): ");
        
        choice = Integer.parseInt(choice_input);
        
        if (choice == 1){
            total += 0;
        }
        else if(choice == 2){
            total += ShippingPrice;
        }else{
        	JOptionPane.showMessageDialog(null, "Please enter a valid entry!");
        }
        
        tax = tax_rate * total;
//        JOptionPane.showMessageDialog(null,
//        "\n************************************************************************" +
//        "-------------------TOTAL BALANCE FROM THE TRANSACTION------------------" +
//        "\n\nTax(8.25%) is $" + String.format("%.2f",tax));
//        total = total + tax;
        return total;
    }

    public double getTotal(){
        return total;
    }
}
