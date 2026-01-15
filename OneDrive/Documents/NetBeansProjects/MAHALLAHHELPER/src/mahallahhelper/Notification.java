/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahallahhelper;
import java.util.Date;
/**
 *
 * @author meera
 */



public class Notification {
    private String notificationId;
    private String notification;
    private String type;
    private Date dateSent;

    public Notification(String notificationId, String notification,
                        String type, Date dateSent) {
        this.notificationId = notificationId;
        this.notification = notification;
        this.type = type;
        this.dateSent = dateSent;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public void sendToUser() {
        System.out.println("Notification sent to user.");
    }

    public void broadcast() {
        System.out.println("Notification broadcasted.");
    }
}
