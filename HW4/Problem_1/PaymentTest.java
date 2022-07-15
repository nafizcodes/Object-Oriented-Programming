public class PaymentTest {
    public static void main(String[] args){
        CashPayment obj1 = new CashPayment();
        CashPayment obj2 = new CashPayment();

        CreditCardPayment obj3 = new CreditCardPayment("John", "09/2027", 1234);
        CreditCardPayment obj4 = new CreditCardPayment("Kim", "04/2026", 5678);

        System.out.print("\nCalls from CashPayment:");
        obj1.setpayment(100);
        obj1.paymentDetails();
        obj2.setpayment(200);
        obj2.paymentDetails();


        System.out.print("\n\nCalls from CreditPayment:\n");
        obj3.setpayment(300);
        obj3.paymentDetails();
        obj4.setpayment(400);
        obj4.paymentDetails();
    }
}
