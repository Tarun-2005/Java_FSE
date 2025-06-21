package Module2.Excercise2;
public class Test{
    public static void main(String[] args) {
        Product[] products={
            new Product(101,"Ice Cream","250"),
            new Product(102,"Chocolate","200"),
            new Product(103,"Mixture","150")
        };
        Product Linear= Search.linearSearch(products, "Mixture");
        if(Linear != null){
            System.out.println("Linear Search Result: " + Linear);
        } else {
            System.out.println("Product not found using Linear Search.");
        }
        Search.SortByName(products);
        Product Binary= Search.BinarySearch(products, "Chocolate");
        if(Binary != null){
            System.out.println("Binary Search Result: " + Binary);
        } else {
            System.out.println("Product not found using Binary Search.");
        }
        

    }
}