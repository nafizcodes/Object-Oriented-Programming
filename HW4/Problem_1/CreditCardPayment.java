public class CreditCardPayment extends Payment{
    private String name;
    private String expr_date;
    private int card_number;

    CreditCardPayment(String n, String d, int card_number){
        this.name = n;
        this.expr_date = d;
        this.card_number = card_number;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public String getDate(){
        return expr_date;
    }

    public void setData(String d){
        expr_date = d;
    }

    public int getCardnumber(){
        return card_number;
    }

    public void setCardnumber(int number){
        card_number = number;
    }
    
    @Override
    public void paymentDetails(){
        System.out.print("\nCredit Card Information: \n");
        System.out.print("Name: " + getName() + "\nExpiration date: " + getDate() + "\nCard Number: " + getCardnumber());
        System.out.print("\nPayment amount is $" + getpayment() + " which is with credit card.\n\n");
    }
}

