import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CustomerDriver c = new CustomerDriver();
        SupplierDriver s = new SupplierDriver();
    
        int input;
        char choice;
        boolean notexit = true;
        
        System.out.print("Welcome to the Store!");
        while(notexit){
        System.out.print("\n*****Choose the User Type*****\nIf you are Supplier, Press(s) \nIf you are a Customer, Press(c) \n Option: ");
        choice = sc.next().toLowerCase().charAt(0);
        
        if (choice == 's') {
        	System.out.print("--------------------------Welcome to Supplier's Portal-----------------------------------");
            System.out.print("\n\n1.Create Account. \n2.Login  \n3.Exit \nChoose Option: ");
            input = sc.nextInt();

            switch(input){
              case 1:
              s.create();
              break;

              case 2:
              s.login();
              boolean end = true;
              while(end) 
              {
              System.out.print("\n\n1.View Stock \n2.Process Order \n3.Ship Order\n4.Logout\nChoose Option:");
              int SupChoice = sc.nextInt();
              
              if (SupChoice == 1) {
            	  OrderControl.ViewStock();
              }else if (SupChoice == 2) {
            	  OrderControl.ProcessOrder();
              }else if(SupChoice == 3) {
            	  OrderControl.ShipOrder();
              }else {
            	  System.out.print("Logged out Successfully");
            	  end = false; 
              }
              }
              System.exit(0);
              
              break;

              case 3:
              System.out.print("Terminating from the program!");
              notexit = false;
              break;

              default:
              break;
              
        }
        }
            
        if(choice == 'c') {
        	System.out.print("--------------------------Welcome to Customer's Portal-----------------------------------");
            System.out.print("\n\n1.Create Account. \n2.Login  \n3.Exit \nChoose Option: ");
            input = sc.nextInt();

            switch(input){
              case 1:
              c.create();
              break;

              case 2:
              c.login();
              ItemDriver i = new ItemDriver();
              i.Catalog();
              i.SelectItems();

              MakeOrder.ConfirmOrder();

              break;

              case 3:
              System.out.print("Terminating from the program!");
              notexit = false;
              break;

              default:
              break;
        	
            }
        }
        
      }
        System.exit(0);
    }
}