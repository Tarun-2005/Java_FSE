package Module1.ProxyPatternExample;

public class Test {
    public static void main (String[] args){
        Image image1= new RealImage();
        image1.display();  
        Image image2= new ProxyImage();
         image2.display();
        
    }
    
}
