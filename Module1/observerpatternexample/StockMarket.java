package Module1.observerpatternexample;
import java.util.*;
public  class StockMarket implements Stock {
    private List<Observer> observers=new ArrayList<>();
    private String StockName;
    private double price;
    public void registerObservers(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
}   
    public void notifyObservers(){
        for (Observer observers : observers) {
            observers.update(StockName, price);
    }

}
    public void setStockData(String StockName, double price) {
        this.StockName=StockName;
        this.price=price;
        notifyObservers();
    }
}