import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class OrderControl {
	static Scanner sc = new Scanner(System.in);
	static int[] InitialStock = new int[]{3000, 50000,20000,15000,6000,9000,4000,1000,500,400};
	static ArrayList<String> ItemNames = new ArrayList<>() { {             
        add("Apple"); add("Carrot");add("Chicken"); add("Beef");
        add("Orange"); add("Mango"); add("Tomato"); add("Cabbage");
        add("Potato"); add("Avocado");
    }
};
	public static void ViewStock(){
		JOptionPane.showMessageDialog(null,"-------------------------------Stock Details----------------------------------" +
			        "\nOptions     Name          Initial Stock        Current Stock" +
			        "\n(1)         Apple            3000               " + ItemDriver.UpdatedStock[0] +            
			        "\n(2)         Carrot           5000               " + ItemDriver.UpdatedStock[1]+
			        "\n(3)         Chicken         20000               " + ItemDriver.UpdatedStock[2] +
			        "\n(4)         Beef            15000               " + ItemDriver.UpdatedStock[3] +
			        "\n(5)         Orange           6000               " + ItemDriver.UpdatedStock[4] +
			        "\n(6)         Mango            9000               " + ItemDriver.UpdatedStock[5] +
			        "\n(7)         Tomato           4000               " + ItemDriver.UpdatedStock[6] +
			        "\n(8)         Cabbage          1000               " + ItemDriver.UpdatedStock[7] +
			        "\n(9)         Potato            500               " + ItemDriver.UpdatedStock[8] +
			        "\n(10)        Avocado           400               " + ItemDriver.UpdatedStock[9]
			        );
	}
	
	public static void ProcessOrder() {
//		Summary: Supplier checks that the items are available to fulfill an order and processes the
//		order.
//		Actor: Supplier
//		Precondition: Supplier has logged in. (Supplier can create an account using the Create Account
//		use case in the COS and log into the system using the Log On use case in the COS.)
//		Main sequence:
//		1. The supplier requests orders.
//		2. The system displays customer orders and their items to the supplier.
//		3. The supplier selects an order.
//		4. The system checks if the warehouse has the items in stock.
//		5. If the items are in stock, the system reserves the order’s items and changes the order
//		status from "ordered" to "ready."
//		6. The system updates the number of available and reserved items in the warehouse. The
//		total of items in the warehouse is a summation of available items and reserved items.
//		7. The system displays a message that the items have been reserved.
//		Alternative sequence:
//		Step 5: If an item(s) is out of stock, the system displays that the item(s) needs to be
//		refilled.
//		Postcondition: The supplier has processed an order. 
		
		Cart.printOrderedCart();
		
	}

	
	public static void ShipOrder() {
//		Summary: The supplier ships an order’s items manually and then confirms the order sent to a
//		customer.
//		Actor: Supplier
//		Precondition: An order’s items were reserved, and the supplier logged in. 
//		Main sequence:
//			1. The supplier requests customer orders in “ready” status.
//			2. The system displays the customer orders and items in “ready” status.
//			3. The supplier selects a customer order and ships the order’s items manually to the
//			customer.
//			4. The supplier changes the customer order status to “shipped’ status.
//			5. The system updates the number of reserved items in stock.
//			6. The system displays the order’s status to the supplier.
//			Alternative sequence: None
//			Postcondition: Supplier has shipped a customer order. 

		StringBuilder sb = new StringBuilder();
		sb.append("\nOrder Processing.....\nOrder Status:Ordered"+
		"\n---------------------------------Ready Order----------------------------------\n\n"+
	    "Item" + "    " +"Price($)" + "     "+ "Quantity(in Lb)\n");
		
	    for(Map.Entry<Item, Double> entry : Cart.cartlist.entrySet()){
	        Item i = entry.getKey();
	        Double value = entry.getValue();
	        
	        sb.append( i.getName()+ "     " + i.getSalePrice() + "             " + value +"\n" );
	
	        }
	    JOptionPane.showMessageDialog(null, sb);
		String inputstr = JOptionPane.showInputDialog("\nTo confirm Shipping, Press(1): ");
		int input = Integer.parseInt(inputstr);
		if (input ==1) {
		JOptionPane.showMessageDialog(null,"\n**********Order Status Updating********** \nOrder Status: Shipped");
		}
	    }


}

