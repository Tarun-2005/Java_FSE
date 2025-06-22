package Module2.Excercise7;

public class Financial {
    
    public static double prediction(double amount ,int year,double rate){
        if (year==0){
            System.out.printf("Value  %.2f after %d years%n", amount, year);
            return amount;
        }else{
            double value = (1+rate)*prediction(amount, year-1, rate);
            System.out.printf("Value  %.2f after %d years%n", value, year);
            return value;   
        }
    }
        public static void main(String[] args){
            double amount=100000;
            int year=5;
            double rate=0.10;
            double predictedAmount = prediction(amount, year, rate);
            System.out.printf("predictedAmount %.2f after %d years%n", predictedAmount, year);
        }
    }


