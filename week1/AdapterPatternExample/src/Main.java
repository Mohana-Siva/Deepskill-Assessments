public class Main {
    public static void main(String[] args) {

        PaymentAdapter paytmAdapter = new PaymentAdapter(new Paytm());
        PaymentAdapter gpayAdapter = new PaymentAdapter(new Gpay());
        PaymentAdapter cardAdapter = new PaymentAdapter(new Credit());
        //since we have used adapter pattern , we can use the instance of adapter class to make the payment instead of the instance created from the payment gateway itself
        paytmAdapter.processPayment();
        gpayAdapter.processPayment();
        cardAdapter.processPayment();
        
    }
}
