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


public class LostFoundItem {
    private String itemId;
    private String itemName;
    private String category;
    private String description;
    private String status;
    private Date dateReported;
    private String reportedBy;

    public LostFoundItem(String itemId, String itemName, String category,
                         String description, String status,
                         Date dateReported, String reportedBy) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.category = category;
        this.description = description;
        this.status = status;
        this.dateReported = dateReported;
        this.reportedBy = reportedBy;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateReported() {
        return dateReported;
    }

    public void setDateReported(Date dateReported) {
        this.dateReported = dateReported;
    }

    public String getReportedBy() {
        return reportedBy;
    }

    public void setReportedBy(String reportedBy) {
        this.reportedBy = reportedBy;
    }

    public void reportLost() {
        System.out.println("Lost item reported.");
    }

    public void reportFound() {
        System.out.println("Found item reported.");
    }

    public void updateStatus() {
        System.out.println("Item status updated.");
    }
}
