import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SupplierDriver {

    private static final Map<Integer, Supplier> suppliers = new HashMap<>();       // User storage - <User ID - User Object>
    Supplier supplier = null;
    int number;
     
    ArrayList<String> securityQuestions = new ArrayList<>() { {             
        add("1) In what city were you born?");
        add("2) What is the name of your favorite pet?");
        add("3) What is the name of your first school?");
      
    }
};

    Scanner sc = new Scanner(System.in);

    public void printitem()
    {
           System.out.println(suppliers);
    }

    private final Scanner scan = new Scanner(System.in);


    public void addCustomer(Supplier customer) {
        suppliers.putIfAbsent(supplier.getId(), supplier);
    }


    public Supplier getSupplier(int id) {
        return suppliers.get(id);
    }

    public void create() {    //Create account
        int id = 0;
        String password = null;
        String name;
        String address;
        String securityQuestion;
        String answer;

        System.out.println("Create new account:");
        // ID handling
        id = enterID();

        int length = String.valueOf(id).length();

        while (!(length == 4)){
            System.out.print("Invalid length of ID. Please try again.");
            id = enterID();
            length = String.valueOf(id).length();
        }

        while (checkID(id) || id == 0) {
            System.out.println("ID value is already taken");
            id = enterID();
        }

        // Password handling
        while (Checker.checkPassword(password)) {
            password = enterPassword();
            if(Checker.checkPassword(password)){
                System.out.print("Invalid Password!");
            }   
        }

        name = enterName();
        address = enterAddress();
        securityQuestion = selectSecurityQuestion();
        answer = enterSecurityQuestionAnswer();

        supplier = new Supplier(id, password, securityQuestion, answer, name, address);

        // Confirmation
        System.out.print("\n***************************************************************************************");
        System.out.print( supplier.toString() + 
        "\n***************************************************************************************\n"+
        "\nPlease confirm the above information to Create the account" +
                            "\nTo confirm press (Y/N):");            
        char confirmation = scan.next().toLowerCase().charAt(0);

        if (confirmation == 'y') {
            addCustomer(supplier);
            System.out.println("--------------------Account successfully created-----------------------");
            return;
        }
        create();
    }

    public Supplier login() {      //login
        int id;
        String password;
        
        System.out.print("\nLog in with credentials:");
        id = enterID();
       
        // User ID handling
        if (getSupplier(id) == null || !suppliers.containsKey(id)) {
            System.out.println("ID does not exist in the system.\nTry again.");
        
            login();
        }
        password = enterPassword();

        int attempts = 1;                         // Number of attempts user has taken to log in
        // User password handling
        while (!password.equals(getSupplier(id).getPassword())) {
            if (attempts >= 3) {
                System.out.println("Maximum attempts exceeded. Terminating program.Try again later.");
                System.exit(0);
            }
            System.out.println("Incorrect password. Attempt " + attempts + "/3");
            attempts++;
            password = enterPassword();
        }

        //Security question handling 
        System.out.print(getSupplier(id).getQuestion());
        System.out.print("\nAnswer:");
        String reply = sc.nextLine();

        if (reply.equals(getSupplier(id).getAnswer())){
            System.out.println("\n------------------------------------------------Login successful---------------------------------------------" +
            "\n--------------------------------------Welcome to Order Processing System!-----------------------------------------");
            supplier = getSupplier(id);
            return supplier;
        }else{
            System.out.println("Incorrect Answer, Terminating Program");
            System.exit(0);
        }
        return supplier;
    }

    public static void logout(){
        System.out.print("Logged out successfully!");
        System.exit(1);
    }

    private String selectSecurityQuestion() {
        System.out.println("Select a security question: ");

        for (String securityQuestion : securityQuestions) {
            System.out.println(securityQuestion);
        }

        int selection = scan.nextInt();

        return securityQuestions.get(selection-1);  //for index starting at 0
    }

    private int enterID() {
        System.out.print("\nEnter the 4 digit Id: ");
        return Integer.parseInt(scan.next());
    }

    private String enterPassword() {
        System.out.println("Enter a password: ");
        System.out.println("(Password must be at least a digit, a special character( @, #, $, %, &, and *) and upper case Alphabet)");
        return scan.next();
    }

    private String enterName() {
        System.out.print("Enter your name: ");
        return scan.next();
    }

    private String enterAddress() {
        System.out.print("Enter your address: ");
        scan.nextLine();
        return scan.nextLine();
    }

    private String enterSecurityQuestionAnswer() {
        System.out.print("Enter the answer: ");
        return scan.next();
    }

    private boolean checkID(int id) {
        return suppliers.containsKey(id);
    }
    
}
