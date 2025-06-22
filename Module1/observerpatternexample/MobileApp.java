package Module1.observerpatternexample;

public class MobileApp implements Observer {
    private String name;
    public MobileApp(String name){
        this.name = name;
    }
    public void update(String stockName,double price){
        System.err.println("Mobile App:  "+name+"  StockName:  "+stockName+"  Price:  "+price);
    }
    
}
