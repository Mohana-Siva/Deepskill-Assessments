public class PaymentAdapter implements PaymentProcessor {
    private Gpay gpay;
    private Paytm paytm;
    private Credit credit;

    public PaymentAdapter(Gpay gpay){
        this.gpay = gpay;
    }
    public PaymentAdapter(Paytm paytm){
        this.paytm = paytm;
    }
    public PaymentAdapter(Credit credit){
        this.credit = credit;
    }
    @Override
    public void processPayment(){
        if(gpay!=null){
            gpay.gpayPayment();
            gpay.verifyViaPAN();
            System.out.println("----x----");
        }
        else if(credit!=null){
            credit.creditPayment();
            credit.verifyViaPassport();
            System.out.println("----x----");

        }
        else if(paytm!=null){
            paytm.paytmPayment();
            paytm.verifyViaAadhar();
            System.out.println("----x----");

        }
    }

    
}
