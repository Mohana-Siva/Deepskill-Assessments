public class Logger {
    private static final Logger logger = new Logger(); ; // only one object of Logger can exist

    private Logger() // constructor is private so nobody can create objects directly , used final to make it immutable and thread safety
    {
        System.out.println("Logger initialized :)");
    }

    public static Logger getLogger() {
         return logger;
    }

    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}