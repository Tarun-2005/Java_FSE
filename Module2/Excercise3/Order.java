package Module2.Excercise3;

public class Order {
    public int Orderid;
    public String CustomerName;
    public double TotalAmount;
    public Order(int Orderid, String CustomerName, double TotalAmount) {
        this.Orderid = Orderid;
        this.CustomerName = CustomerName;
        this.TotalAmount=TotalAmount;
    }
    public String toString(){
        return "Orderid: "+Orderid+" CustomerName: "+CustomerName+" TotalAmount: "+TotalAmount;
    }
    
}
