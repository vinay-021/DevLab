import Loose.EmailNotificationService;
import Loose.NotificationService;
import Tight.UserService;

public class AppMain {
    public static void main(String[] args) {

        //Tight
        UserService userService = new UserService();
        userService.notifyUser("Order Placed!");

        //Loose
        NotificationService emailService = new EmailNotificationService();
        Loose.UserService userServiceLoose=new Loose.UserService(emailService);
        userServiceLoose.notifyUser("Order Processed!");
    }
}
