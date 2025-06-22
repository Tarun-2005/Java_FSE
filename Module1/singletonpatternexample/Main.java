package Module1.singletonpatternexample;



public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getinstance();
        logger.displaymsg();
        Logger anotherLogger = Logger.getinstance();
        if (logger == anotherLogger) {
            System.out.println("Both logger instances are the same.");
        } else {
            System.out.println("Logger instances are different.");
        }
    }
    
}
