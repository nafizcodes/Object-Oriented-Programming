import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cart {

    static Scanner sc = new Scanner(System.in);

    private static double ShippingPrice = 3;                      // Price for shipping

    public static Map<Item, Double> cartlist = new HashMap<>();      // Storage of items <Item - quantity>

    private static double total;                                   // Total price of all cart items
                             
    
    
    public static void printCart(){

        for(Map.Entry<Item, Double> entry : cartlist.entrySet()){
            Item i = entry.getKey();
            Double value = entry.getValue();
            
            System.out.println(i.getName()+ "     " + i.getSalePrice() + "             " + value);
            
        }
    }

    public static void addItem(Item item, double amount) {
        cartlist.put(item, amount);

        System.out.print("\n\n---------------------------------Current Cart----------------------------------\n\n");
        System.out.println("Item" + "    " +"Price($)" + "     "+ "Quantity(in Lb)\n");
        Cart.printCart();
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
     
        System.out.print("\nChoose Delivery Options:"+
                           "\n1. Pick up - Free"+
                           "\n2. By mail - $3 charge\n Enter option(1 or 2): ");

        choice = sc.nextInt();
        
        if (choice == 1){
            total += 0;
        }
        else if(choice == 2){
            total += ShippingPrice;
        }else{
            System.out.print("Please enter a valid entry!");
        }
        
        tax = tax_rate * total;
        System.out.println("\n************************************************************************");
        System.out.println("-------------------TOTAL BALANCE FROM THE TRANSACTION------------------");
        System.out.print("\n\nTax(8.25%) is $" + String.format("%.2f",tax));
        total = total + tax;
        return total;
    }

    public double getTotal(){
        return total;
    }
}
