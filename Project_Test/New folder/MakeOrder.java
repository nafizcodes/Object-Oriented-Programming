import java.util.*;

import javax.swing.JOptionPane;

public class MakeOrder{
    static Scanner sc = new Scanner(System.in);
    static int input;

    //Implement View Order

    public static void ConfirmOrder(){
    
    String inputstr = 	JOptionPane.showInputDialog("To confirm the order, please click 1 or 0 to cancel: ");
    input = Integer.parseInt(inputstr);

        switch(input){
            case 1:
            	JOptionPane.showMessageDialog(null,"\nOrder Confirming......." +
                            "\nCredit Card is being processed for the payment......." +
                            "\nAuthorization number from bank: " + getAuthorization());
            approval();
            
            int status;
            String statusstr = JOptionPane.showInputDialog("\nTo view the order status, Press(1):");
            status = Integer.parseInt(statusstr);
            
            if(status == 1) {
//            	System.out.print("\n\n---------------------------------Current Order----------------------------------\n\n");
//                System.out.println("\n---------------------------Order Status: Ordered-------------------------------------");
//            	System.out.println("Item" + "    " +"Price($)" + "     "+ "Quantity(in Lb)\n" );
//                Cart.printCart();
            	
            	JOptionPane.showMessageDialog(null, "Current Order Status: Ordered.");
            }

          
            String logoutstr = JOptionPane.showInputDialog("\n\nTo logout, press 0: ");
            int logout_input = Integer.parseInt(logoutstr);

            if(logout_input == 0){
            CustomerDriver.logout();
            }
            break;

            case 0:
            	JOptionPane.showMessageDialog(null, "\nTransaction cancelled!");
            break;

            default:
            break;

        }
    }

    public static void approval(){
        
        double credit_limit = 5000; //ASSUMING CREDIT LIMIT TO BE 5000
        Cart c = new Cart();
        if(c.getTotal() > credit_limit){
        	JOptionPane.showMessageDialog(null, "\nCredit Card limit(5000) exceeded."+
                            "\nTransaction cannot be completed this time, Sorry.");
            System.exit(1);
        }
        else{
        	JOptionPane.showMessageDialog(null,"Total is within the credit limit(5000)."
             + "\nPayment Completed.\nTransaction Completed\nThank you!");
        }

    }

    public static int getAuthorization(){
        return (getRandomNumber(1000, 9999));
    }

    public static int getRandomNumber(int lowerLimit, int upperLimit)
        {
                int num = (int) (Math.random() * upperLimit);
                if (num < lowerLimit)
                {
                        num += lowerLimit;
                }
                return num;
        }

}

