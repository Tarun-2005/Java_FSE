package Module1.ProxyPatternExample;
public class RealImage  implements Image{
    public RealImage(){
        LoadFromServer();
    }

    public void display(){
        System.out.println("Displaying real image");
    }
    private void LoadFromServer(){
        System.out.println("Loading image from server");
    }
}