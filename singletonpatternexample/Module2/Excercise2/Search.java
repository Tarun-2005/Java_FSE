package Module2.Excercise2;

import java.util.Arrays;
import java.util.Comparator;

public class Search {
    public static Product linearSearch(Product[] products,String name){
        for (Product product: products) {
            if (product.productName.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
    public static Product  BinarySearch(Product[] products,String name){
        int left=0;
        int right=products.length-1;
        while(left<=right){
            int mid= (left+right)/2;
            int cmp= name.compareToIgnoreCase(products[mid].productName);
            if(cmp==0){
                return products[mid];
            }
            else if(cmp<0){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }   
        return null;
    
    }
    public static void SortByName( Product[] products){
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
    }

    
}
