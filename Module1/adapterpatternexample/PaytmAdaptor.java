package Module1.adapterpatternexample;

public class PaytmAdaptor implements PaymentProcessor{

    private Paytm paytm;
    public PaytmAdaptor(Paytm  paytm){
        this.paytm = paytm;

    }
    public void processPayment(double amount){
        paytm.transfer_through_paytm(amount);
    }
    
}
