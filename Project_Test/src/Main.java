import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CustomerDriver c = new CustomerDriver();
        SupplierDriver s = new SupplierDriver();
    
        String input;
        String choice;
        boolean notexit = true;
        
        JOptionPane.showMessageDialog(null,"Welcome to the Store!");
        while(notexit){
        choice = JOptionPane.showInputDialog("\n*****Choose the User Type*****\nIf you are a Customer, Press(c)\nIf you are Supplier, Press(s) \n Option: ");
        //choice.toLowerCase().charAt(0);
        
        if (choice.equals("s")) {
        	JOptionPane.showMessageDialog(null,"--------------------------Welcome to Supplier's Portal-----------------------------------");
        	input = JOptionPane.showInputDialog("\n\n1.Create Account. \n2.Login  \n3.Exit \nChoose Option: ");
            int input_int = Integer.parseInt(input);

            switch(input_int){
              case 1:
              s.create();
              break;

              case 2:
              s.login();
              boolean end = true;
              while(end) 
              {
            String SupChoice_str = JOptionPane.showInputDialog("\n\n1.View Stock \n2.Process Order \n3.Ship Order\n4.Logout\nChoose Option:");
              int SupChoice = Integer.parseInt(SupChoice_str);
              
              if (SupChoice == 1) {
            	  OrderControl.ViewStock();
              }else if (SupChoice == 2) {
            	  OrderControl.ProcessOrder();
              }else if(SupChoice == 3) {
            	  OrderControl.ShipOrder();
              }else {
            	  JOptionPane.showMessageDialog(null,"Logged out Successfully");
            	  end = false; 
              }
              }
              System.exit(0);
              
              break;

              case 3:
            	  JOptionPane.showMessageDialog(null,"Terminating from the program!");
              notexit = false;
              break;

              default:
              break;
              
        }
        }
            
        if(choice.equals( "c")) {
        	JOptionPane.showMessageDialog(null,"--------------------------Welcome to Customer's Portal-----------------------------------");
        	String input_str = JOptionPane.showInputDialog("\n\n1.Create Account. \n2.Login  \n3.Exit \nChoose Option: ");
            int input_int = Integer.parseInt(input_str);

            switch(input_int){
              case 1:
              c.create();
              break;

              case 2:
              c.login();
              ItemDriver i = new ItemDriver();
              //i.Catalog();
              i.SelectItems();

              MakeOrder.ConfirmOrder();

              break;

              case 3:
            JOptionPane.showMessageDialog(null, "Terminating from the program!");
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