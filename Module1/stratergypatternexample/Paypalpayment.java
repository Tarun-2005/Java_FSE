package Module1.stratergypatternexample;

public class Paypalpayment implements PaymentStratergy{
    public void pay(int amount,String type){
        System.out.println("Amount paid: "+amount+" through "+type);
    }
}
