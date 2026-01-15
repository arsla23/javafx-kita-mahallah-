/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahallahhelper;

/**
 *
 * @author meera
 */

public class Vehicle {
    private String plateNumber;
    private String ownerId;
    private String model;
    private String color;

    public Vehicle(String plateNumber, String ownerId,
                   String model, String color) {
        this.plateNumber = plateNumber;
        this.ownerId = ownerId;
        this.model = model;
        this.color = color;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getOwnerDetails() {
        System.out.println("Fetching owner details for vehicle.");
    }
}
