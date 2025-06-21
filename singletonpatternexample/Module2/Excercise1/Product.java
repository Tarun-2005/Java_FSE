package Module2.Excercise1;

public class Product {
    private int Productid;
    private String ProductName;
    private String quantity;
    private String price;
    public Product (int Productid,String ProductName,String quantity,String price){
        this.Productid=Productid;
        this.ProductName=ProductName;
        this.quantity=quantity;
        this.price=price;

    }
    public int getProductid() {
        return Productid;
    }
    public void setProductid(int productid) {
       this.Productid = productid;
    }
    public String getProductName() {
        return ProductName;
    }
    public void setProductName(String productName) {
        this.ProductName = productName;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    public String toString(){
        return "Product [Productid=" + Productid + ", ProductName=" + ProductName + ", quantity=" + quantity + ", price=" + price + "]";
    }
}
