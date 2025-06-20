
package digitalnurture.adapterpatternexample;
public class GpayAdaptor implements PaymentProcessor{

    private Gpay gpay;
    public GpayAdaptor(Gpay gpay){
        this.gpay = gpay;

    }
    public void processPayment(double amount){
        gpay.transfer_through_gpay(amount);
    }

    
}
