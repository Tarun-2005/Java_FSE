package Module2.Excercise1;

public class Test {
    public static void main(String[] args) {
        Manager maanager=new Manager();
        Product product1=new Product(101,"Ice Cream","1kg","250");
        Product product2=new Product(102,"Chocolate","500g","150");
        Product product3=new Product(103,"Mixture","200g","100");
        maanager.addProduct(product1);
        maanager.addProduct(product2);  
        maanager.addProduct(product3);
        maanager.updatePoduct(101,"Vanilla Ice Cream","1kg","300");
        maanager.deleteProduct(102);
        maanager.ShowAllproducts();
    }
}
