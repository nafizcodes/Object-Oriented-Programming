import java.util.*;

public class MakeOrder{
    static Scanner sc = new Scanner(System.in);
    static int input;

    //Implement View Order

    public static void ConfirmOrder(){
    
    System.out.println("To confirm the order, please click 1 or 0 to cancel: ");
    input = sc.nextInt();

        switch(input){
            case 1:
            System.out.println("\nOrder Confirming......." +
                            "\nCredit Card is being processed for the payment......." );
            
            System.out.println("\nAuthorization number from bank: " + getAuthorization());
            approval();
            
            int status;
            System.out.println("\nTo view the order status, Press(1):");
            status = sc.nextInt();
            
            if(status == 1) {
            	System.out.print("\n\n---------------------------------Current Order----------------------------------\n\n");
                System.out.println("\n---------------------------Order Status: Ordered-------------------------------------");
            	System.out.println("Item" + "    " +"Price($)" + "     "+ "Quantity(in Lb)\n" );
                Cart.printCart();
            }

            int logout_input;
            System.out.print("\n\nTo logout, press 0: ");
            logout_input = sc.nextInt();

            if(logout_input == 0){
            CustomerDriver.logout();
            }
            break;

            case 0:
            System.out.print("\nTransaction cancelled!");
            break;

            default:
            break;

        }
    }

    public static void approval(){
        
        double credit_limit = 5000; //ASSUMING CREDIT LIMIT TO BE 5000
        Cart c = new Cart();
        if(c.getTotal() > credit_limit){
            System.out.print("\nCredit Card limit(5000) exceeded."+
                            "\nTransaction cannot be completed this time, Sorry.");
            System.exit(1);
        }
        else{
            System.out.print("Total is within the credit limit.");
            System.out.print("\nPayment Completed.\nTransaction Completed\nThank you!");
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

