package Module2.Excercise3;

public class Test {
    public static void main(String[] args) {
        Order[] orders={
            new Order(1,"Tarun",2500),
            new Order(2, "Bhuvanesh",300),
            new Order(3,"Pranav",400),
            new Order(3, "Smith", 100)};
            System.out.println("Before Sorting");
            for (Order order : orders) {
                System.out.println(order);
        }
        Sort sort=new Sort();
        sort.quicksort(orders, 0, orders.length-1);
        System.out.println("After Sorting");
        for (Order order : orders) {
            System.out.println(order);
        }

        
    }
}
    

