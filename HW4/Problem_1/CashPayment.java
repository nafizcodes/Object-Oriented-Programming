public class CashPayment extends Payment{

    @Override
    public void paymentDetails(){
        System.out.print("\nPayment amount is $" + getpayment() + " which is in cash.\n");
    }
}
