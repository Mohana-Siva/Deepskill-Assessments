public class Main {

    public static void main(String[] args) {

       //module-1
        Logger logger1 = Logger.getLogger();
        logger1.log("User logged in");

        // module-2
        Logger logger2 = Logger.getLogger();
        logger2.log("Order placed successfully");

        // module -3
        Logger logger3 = Logger.getLogger();
        logger3.log("Payment completed");

        System.out.println();

        
        if(logger1 == logger2 && logger2 == logger3){
            System.out.println("Only one Logger instance exists");
        }
        else{
            System.out.println("Multiple Logger instances created");
        }
        // Logger logged = new Logger("Iam the one to cause error"); -> since the constructor of Logger is private , we cannot create an instance.
    }
}