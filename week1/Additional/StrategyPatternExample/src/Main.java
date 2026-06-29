import java.util.Scanner;

class CreditCardPayment implements PaymentStrategy{
       @Override
       public void pay(){
        System.out.println("Payment done using Credit Card");
       }
}

class PayPalPayment implements PaymentStrategy{
        @Override
        public void pay(){
            System.out.println("Payment done using PayPal");
        }
}


public class Main {
    public static void main(String[] args) {
        
        PaymentContext p1 = new PaymentContext();
        
        
        System.out.println("For Credit Card press 1"+"\nFor PayPal press 2");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1: // changing the strategy at runtime
                p1.setStrategy(new CreditCardPayment());
                p1.execute();
                break;
            case 2:
                p1.setStrategy(new PayPalPayment());
                p1.execute();
                break;
            default:
                System.out.println("Enter valid choice");
                break;
        }
        
        sc.close();

    }
    
}
