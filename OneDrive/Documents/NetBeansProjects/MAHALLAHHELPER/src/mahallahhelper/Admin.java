/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahallahhelper;

/**
 *
 * @author meera
 */

public class Admin extends user {
    private String roleType;

    public Admin(String userId, String username, String password) {
        super(userId, username, password);
    }

    public String getRole() {
        return roleType;
    }

    public void setRole(String roleType) {
        this.roleType = roleType;
    }

    public void manageModules() {
        System.out.println("Managing modules.");
    }

    public void sendNotifications() {
        System.out.println("Sending notifications.");
    }

    public void checkAccommodationApplication() {
        System.out.println("Checking accommodation applications.");
    }

    public void checkMaintenanceRequest() {
        System.out.println("Checking maintenance requests.");
    }

    public void manageParkingReport() {
        System.out.println("Managing parking reports.");
    }

    public void manageLostAndFound() {
        System.out.println("Managing lost and found items.");
    }
}
