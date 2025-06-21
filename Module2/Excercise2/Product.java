package Module2.Excercise2;

public class Product {
    int productid;
    String productName;
    String price;

public  Product(int productid,String productName, String price){
    this.productid = productid;
    this.productName = productName;
    this.price = price;
}
public String toString(){
    return "Product [productid=" + productid + ", productName=" + productName + ", price=" + price + "]";
}
}