interface Notifier {
    void send();
}

// Concrete Component
class EmailNotifier implements Notifier {

    private String message;

    public EmailNotifier(String message) {
        this.message = message;
    }

    @Override
    public void send() {
        System.out.println("Email Notification: " + message);
    }
}

// Abstract Decorator
abstract class NotifierDecorator implements Notifier {

    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        notifier.send();
    }
}

// Concrete Decorator - SMS
class SMSNotifierDecorator extends NotifierDecorator {

    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("SMS Notification Sent");
    }
}

// Concrete Decorator - Slack
class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Slack Notification Sent");
    }
}

// Test Class
public class Main {

    public static void main(String[] args) {

        System.out.println("Email Only:");
        Notifier email = new EmailNotifier("Hello, How are you?");
        email.send();

        System.out.println();

        System.out.println("Email + SMS:");
        Notifier emailSMS =
                new SMSNotifierDecorator(
                        new EmailNotifier("Hello, How are you?"));
        emailSMS.send();

        System.out.println();

        System.out.println("Email + SMS + Slack:");
        Notifier emailSMSSlack =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier("Hello, How are you?")));
        emailSMSSlack.send();
    }
}