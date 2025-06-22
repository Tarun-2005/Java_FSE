package Module1.observerpatternexample;

public class Webapp implements Observer {

    private String name;
    public  Webapp(String name){
        this.name = name;
    }
    public void update(String stockName,double price){
        System.err.println("Web App:  "+name+"  StockName:  "+stockName+"  Price:  "+price);
    }
}
