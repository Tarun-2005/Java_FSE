package Module1.observerpatternexample;

public interface Stock {
    void registerObservers(Observer observer);
    void removeObserver(Observer observerserver);
    void notifyObservers();
    
}
