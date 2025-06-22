package Module1.stratergypatternexample;

public class Creditcardpayment implements PaymentStratergy{
    public void pay(int amount,String type){
        System.out.println("Paid Amount "+amount+" using "+type);
    }
}
