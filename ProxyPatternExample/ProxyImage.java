package digitalnurture.ProxyPatternExample;

public class ProxyImage implements Image{
private RealImage realImage;
    public void display() {
       if (realImage==null){
               realImage = new RealImage();
       }
       realImage.display();
    
    
}
}