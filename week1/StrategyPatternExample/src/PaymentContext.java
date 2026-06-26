public class PaymentContext {
   private PaymentStrategy paymentStrategy;
    public void setStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void execute(){
         if (paymentStrategy == null) {
            System.out.println("No payment strategy selected.");
            return;
        }
        paymentStrategy.pay();
    }
}