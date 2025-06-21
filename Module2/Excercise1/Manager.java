package Module2.Excercise1;
import java.util.HashMap;
import java.util.Map;



public class Manager {
    private Map<Integer,Product> invo =new HashMap<>();
    public void addProduct(Product product){
        invo.put(product.getProductid(), product);
        System.out.println("Product:"+product);

    }
    public void updatePoduct(int ProductId,String ProductName,String quantity,String price){
        if (invo.containsKey(ProductId)){
            Product product = invo.get(ProductId);
            product.setProductName(ProductName);
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Updated Product: " + product);
        } else {
            System.out.println("Product with ID " + ProductId + " does not exist.");
        }
    }
    public void deleteProduct(int ProductId){
        if(invo.containsKey(ProductId)){
            Product product =invo.remove(ProductId);
            System.out.println("Deleted Product: " + product);
        }
        else{
            System.out.println("Product with ID " + ProductId + " does not exist.");
        }
    }
    public void ShowAllproducts(){
        for(Product product : invo.values()){
            System.out.println("Product: " + product);
    }
    }

    
}
