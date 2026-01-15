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


public class ParkingReport {
    private String reportId;
    private String plateNumber;
    private String location;
    private String issue;
    private Date dateReported;

    public ParkingReport(String reportId, String plateNumber,
                         String location, String issue,
                         Date dateReported) {
        this.reportId = reportId;
        this.plateNumber = plateNumber;
        this.location = location;
        this.issue = issue;
        this.dateReported = dateReported;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public Date getDateReported() {
        return dateReported;
    }

    public void setDateReported(Date dateReported) {
        this.dateReported = dateReported;
    }

    public void submitReport() {
        System.out.println("Parking report submitted.");
    }

    public void notifyOwner() {
        System.out.println("Vehicle owner notified.");
    }
}
