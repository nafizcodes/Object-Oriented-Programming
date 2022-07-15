import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CustomerDriver c = new CustomerDriver();
    
        int input;
        boolean notexit = true;
        while(notexit){
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
        System.exit(0);
    }
}