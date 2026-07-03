import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class NotificationServiceTest {

    @Test
    public void notification() {

        String message = "Hello!";
        String mobile = "xxxxxxxxxx";

        // Create mock
        SMSGateway smsGateway = mock(SMSGateway.class);

        // Stub the method
        when(smsGateway.sendSMS(mobile, message))
                .thenReturn("SMS SENT!!");

        // Create service
        NotificationService service = new NotificationService(smsGateway);

        // Call the method
        String result = service.sendNotification(mobile, message);

        // Verify result
        assertEquals("SMS SENT!!", result);

        // Verify interaction
        verify(smsGateway).sendSMS(mobile, message);
    }
}