public class Payment{

    private double payment;

    public double getpayment(){
        return payment;
    }

    public void setpayment(double p){
        payment = p;
    }

    public void paymentDetails(){
        System.out.print("Payment amount is $" + getpayment());
    }
}