public class NotificationService {
    SMSGateway smsGateway;
    public  NotificationService(SMSGateway smsGateway){
        this.smsGateway = smsGateway;
    }
    public String sendNotification(String mobile , String message){
        smsGateway.sendSMS(mobile,message);
        return "SMS SENT!!";
    }
}
