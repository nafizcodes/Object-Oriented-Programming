import java.util.*;

import javax.swing.JOptionPane;


public class CustomerDriver {

    private static final Map<Integer, Customer> customers = new HashMap<>();       // User storage - <User ID - User Object>
    Customer customer = null;
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
           System.out.println(customers);
    }

    private final Scanner scan = new Scanner(System.in);


    public void addCustomer(Customer customer) {
        customers.putIfAbsent(customer.getId(), customer);
    }

    public Customer getCustomer(int id) {
        return customers.get(id);
    }

    public void create() {    //Create account
        int id = 0;
        String password = null;
        String name;
        String address;
        long creditCardNumber = 0;
        String securityQuestion;
        String answer;

        JOptionPane.showMessageDialog(null,"Create new account:");
        // ID handling
        id = enterID();

        int length = String.valueOf(id).length();

        while (!(length == 4)){
        	JOptionPane.showMessageDialog(null,"Invalid length of ID. Please try again.");
            id = enterID();
            length = String.valueOf(id).length();
        }

        while (checkID(id) || id == 0) {
        	JOptionPane.showMessageDialog(null,"ID value is already taken");
            id = enterID();
        }

        // Password handling
        while (Checker.checkPassword(password)) {
            password = enterPassword();
            if(Checker.checkPassword(password)){
            	JOptionPane.showMessageDialog(null,"Invalid Password!");
            }   
        }

        name = enterName();
        address = enterAddress();

         
        while (Checker.checkCard(creditCardNumber)){     //Assuming the cardnumber is 8digit
            creditCardNumber = enterCreditCardNumber();
            if (Checker.checkCard(creditCardNumber)){
            	JOptionPane.showMessageDialog(null,"Invalid Cardnumber.");
            }
        }


        securityQuestion = selectSecurityQuestion();
        answer = enterSecurityQuestionAnswer();

        customer = new Customer(id, password, securityQuestion, answer, name, address, creditCardNumber);

        // Confirmation
        String input_conf = JOptionPane.showInputDialog("\n***************************************************************************************"
        	+customer.toString() + 
        "\n***************************************************************************************\n"+
        "\nPlease confirm the above information to Create the account" +
                            "\nTo confirm press (y/n):");            
        //char confirmation = scan.next().toLowerCase().charAt(0);

        if (input_conf.equals("y")){
            addCustomer(customer);
            JOptionPane.showMessageDialog(null,"--------------------Account successfully created-----------------------");
            return;
        }
        //create();
    }

    public Customer login() {      //login
        int id;
        String password;
        
        JOptionPane.showMessageDialog(null,"\nLog in with credentials:");
        id = enterID();
       
        // User ID handling
        if (getCustomer(id) == null || !customers.containsKey(id)) {
        	JOptionPane.showMessageDialog(null,"ID does not exist in the system.\nTry again.");
        
            login();
        }
        password = enterPassword();

        int attempts = 1;                         // Number of attempts user has taken to log in
        // User password handling
        while (!password.equals(getCustomer(id).getPassword())) {
            if (attempts >= 3) {
            	JOptionPane.showMessageDialog(null,"Maximum attempts exceeded. Terminating program.Try again later.");
                System.exit(0);
            }
            JOptionPane.showMessageDialog(null,"Incorrect password. Attempt " + attempts + "/3");
            attempts++;
            password = enterPassword();
        }

        //Security question handling 
        String reply = JOptionPane.showInputDialog(getCustomer(id).getQuestion() + "\nAnswer:");

        if (reply.equals(getCustomer(id).getAnswer())){
        	JOptionPane.showMessageDialog(null,"\n------------------------------------------------Login successful---------------------------------------------" +
            "\n--------------------------------------Welcome to Customer Order System!-----------------------------------------");
            customer = getCustomer(id);
            return customer;
        }else{
        	JOptionPane.showMessageDialog(null,"Incorrect Answer, Try again later.\n Thank you.");
            System.exit(0);
        }
        return customer;
    }

    public static void logout(){
    	JOptionPane.showMessageDialog(null,"Logged out successfully!");
    }

    private String selectSecurityQuestion() {
    	
    	String selection = JOptionPane.showInputDialog("Select a security question: "
    			+ "\n1) In what city were you born?" + "\n2) What is the name of your favorite pet?" 
    			+ "\n3) What is the name of your first school?");
//
//        for (String securityQuestion : securityQuestions) {
//            System.out.println(securityQuestion);
//        }

        int selection_int = Integer.parseInt(selection);

        return securityQuestions.get(selection_int -1);  //for index starting at 0
    }

    private int enterID() {
    	String input_id = JOptionPane.showInputDialog("\nEnter the 4 digit Id: ");
        return Integer.parseInt(input_id);
    }

    private String enterPassword() {
    	String input_pass = JOptionPane.showInputDialog("Enter a password: \n(Password must be at least a digit, a special character( @, #, $, %, &, and *) and upper case Alphabet)");
        return input_pass;
    }

    private String enterName() {
    	String input_name = JOptionPane.showInputDialog("Enter your name: ");
        return input_name;
    }

    private String enterAddress() {
        String input_add = JOptionPane.showInputDialog("Enter your address: ");
        return input_add;
    }
           
    private long enterCreditCardNumber() {
    	String input_card = JOptionPane.showInputDialog("Enter your credit card number(8 digit): ");
        return Long.parseLong(input_card);
    }


    private String enterSecurityQuestionAnswer() {
    	String input_ans = JOptionPane.showInputDialog("Enter the answer: ");
        return input_ans;
    }

    private boolean checkID(int id) {
        return customers.containsKey(id);
    }
}

