package Module1.adapterpatternexample;
public class Test {
    public static void main(String[] args) {
        PaytmAdaptor paytmAdaptor = new PaytmAdaptor(new Paytm());
        paytmAdaptor.processPayment(100000.0);
        GpayAdaptor gpayAdaptor = new GpayAdaptor(new Gpay());
        gpayAdaptor.processPayment(20000.0);
        System.out.println("Payment processed successfully using adapters.");
    }
}