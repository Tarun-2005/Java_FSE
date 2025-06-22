package Module1.stratergypatternexample;

public class Test {
    public static void main(String[] args) {
        
        paymentContext  paymentContext = new paymentContext(new Creditcardpayment());
        paymentContext.executePayment(1000, "Credit Card");
        paymentContext = new paymentContext(new Paypalpayment()); 
        paymentContext.executePayment(20000, "Paypal");
    }
    
}
