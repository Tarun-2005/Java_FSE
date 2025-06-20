package digitalnurture.singletonpatternexample;

public class Test {
    public static void main(String[] args){
        Runnable task = () ->{
        Logger logger1 = Logger.getinstance();
        logger1.displaymsg();
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        Thread t4 = new Thread(task);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            t1.join();
            t2.join();  
            t3.join();
            t4.join();
        }  
         catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
