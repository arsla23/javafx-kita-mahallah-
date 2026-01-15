/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahallahhelper;

/**
 *
 * @author meera
 */

    public class Student extends user {
    private String mahallah;
    private String roomNumber;

    public Student(String userId, String username, String password,
                   String mahallah, String roomNumber) {
        super(userId, username, password);
        this.mahallah = mahallah;
        this.roomNumber = roomNumber;
    }

    public String getMahallah() {
        return mahallah;
    }

    public void setMahallah(String mahallah) {
        this.mahallah = mahallah;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void viewServices() {
        System.out.println("Viewing available services.");
    }
}
