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
public class ContactMessage {
    

    private String messageId;
    private String senderId;
    private String message;
    private Date dateSent;

    public ContactMessage(String messageId, String senderId,
                          String message, Date dateSent) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.message = message;
        this.dateSent = dateSent;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDateSent() {
        return dateSent;
    }

    public void setDateSent(Date dateSent) {
        this.dateSent = dateSent;
    }

    public void sendMessage() {
        System.out.println("Message sent.");
    }
}
