package digitalnurture.singletonpatternexample;

public class Logger {
    private volatile  static Logger instance;
    private Logger(){
        System.out.println("logger instance Created..");

    }
    public   static Logger getinstance(){
        if(instance==null){
              synchronized (Logger.class) {
                  if(instance==null){
                    instance=new Logger();

        }

        }
    }
    return instance;
    }
 public void displaymsg(){
    System.out.println("This is a logger class");
}
           
       
}


