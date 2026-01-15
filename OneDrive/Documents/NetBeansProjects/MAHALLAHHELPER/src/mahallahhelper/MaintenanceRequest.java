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

public class MaintenanceRequest {
    private String requestId;
    private String issueType;
    private String description;
    private String status;
    private Date dateReported;

    public MaintenanceRequest(String requestId, String issueType,
                              String description, String status,
                              Date dateReported) {
        this.requestId = requestId;
        this.issueType = issueType;
        this.description = description;
        this.status = status;
        this.dateReported = dateReported;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
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
}
