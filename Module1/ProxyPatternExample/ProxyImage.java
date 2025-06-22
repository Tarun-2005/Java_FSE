package Module1.ProxyPatternExample;

public class ProxyImage implements Image{
private RealImage realImage;
    public void display() {
       if (realImage==null){
               realImage = new RealImage();
       }
       realImage.display();
    
    
}
}