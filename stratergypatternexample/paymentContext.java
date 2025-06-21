package digitalnurture.stratergypatternexample;

public class paymentContext {
    private PaymentStratergy paymentstratergy;
    public paymentContext(PaymentStratergy paymentstratergy){
            this.paymentstratergy=paymentstratergy;
    }
    public void executePayment(int amount,String type){
            paymentstratergy.pay(amount,type);
    }
    
    
}
