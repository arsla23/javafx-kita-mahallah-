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

public class roomappilication {
    private String applicationId;
    private String roomType;
    private String status;
    private Date dateSubmitted;

    public roomappilication(String applicationId, String roomType,
                                    String status, Date dateSubmitted) {
        this.applicationId = applicationId;
        this.roomType = roomType;
        this.status = status;
        this.dateSubmitted = dateSubmitted;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public void submitApplication() {
        System.out.println("Accommodation application submitted.");
    }

    public void updateStatus() {
        System.out.println("Application status updated.");
    }
}
