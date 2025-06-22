package Module1.observerpatternexample;

public class Test {
    public static void main(String[] args) {
        StockMarket stockMarket=new StockMarket();
        Observer MobileObserver= new MobileApp("Tarun");
        Observer DesktopObserver=new Webapp("Rahul");
        stockMarket.registerObservers(MobileObserver);
        stockMarket.registerObservers(DesktopObserver);
        stockMarket.setStockData("Nifty", 25000);
        stockMarket.setStockData("Sensex", 50000);
    }
    
}
