package Module1.decoratorpatternexample;

public class SMSNotifierDecorator extends NotifierDecorator{
        public SMSNotifierDecorator(Notifier notifier) {
            super(notifier);
        }
    public void send (String message){
            super.send(message);
            sendSMS(message);

    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS with message: " + message);
    }

 
}
