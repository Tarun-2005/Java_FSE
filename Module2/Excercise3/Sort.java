package Module2.Excercise3;

public class Sort  {
    public void bubblesort(Order[] orders){
        int n=orders.length;
        for(int i=0;i<n;i++){
            for (int j=0;j<n-1-i;j++){
                if(orders[j].TotalAmount > orders[j+1].TotalAmount){
                Order  temp=orders[j];
                orders[j]=orders[j+1];
                orders[j+1]=temp;
                

            }
        }
    }
    
}
    public void quicksort(Order[] orders,int start,int end){
        if(start<end){
            int pivot=partition(orders,start,end);
            quicksort(orders, start, pivot-1);
            quicksort(orders, pivot+1, end);
            
        }
    }

    private int partition(Order[] orders, int start, int end) {
        double pivot=orders[end].TotalAmount;
        int i=start-1;
        for(int j=start;j<end;j++){
            if(orders[j].TotalAmount<pivot){
                i++;
                Order temp=orders[i];
                orders[i]=orders[j];
                orders[j]=temp;
            }
        
        }
        Order temp = orders[i + 1];
    orders[i + 1] = orders[end];
    orders[end] = temp;

    return i + 1;

    }
}
