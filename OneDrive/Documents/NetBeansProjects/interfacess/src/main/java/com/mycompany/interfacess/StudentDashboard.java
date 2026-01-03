/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacess;
import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author meera
 */

public class StudentDashboard extends Application {
    
    private List<String> notifications = new ArrayList<>();
    private String userMahallah = "Bilal Ibn Rabah"; // Changed to Bilal
    
    @Override
    public void start(Stage primaryStage) {
        // Sample notifications
        notifications.add("Room application under review");
        notifications.add("Maintenance request #MR001 completed");
        notifications.add("Parking fine due in 3 days");
        notifications.add("Mahallah meeting tomorrow at 8 PM");
        
        BorderPane root = new BorderPane();
        root.setStyle("-fx-background-color: #f8fafc;");
        
        // HEADER
        HBox header = createHeader();
        root.setTop(header);
        
        // MAIN CONTENT
        VBox mainContent = createMainContent();
        root.setCenter(mainContent);
        
        // USER MAHALLAH INFO (sidebar)
        VBox mahallahInfo = createMahallahInfo();
        root.setLeft(mahallahInfo);
        
        // NOTIFICATIONS PANEL
        VBox notificationsPanel = createNotificationsPanel();
        root.setRight(notificationsPanel);
        
        Scene scene = new Scene(root, 1000, 650);
        primaryStage.setTitle("KITA Mahallah - Student Portal");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private HBox createHeader() {
        HBox header = new HBox(20);
        header.setPadding(new Insets(15, 30, 15, 30));
        header.setStyle("-fx-background-color: #2E7D32;");
        
        Label title = new Label("🏛️ KITA MAHALLAH - " + userMahallah.toUpperCase());
        title.setStyle("-fx-text-fill: white; -fx-font-size: 22px; -fx-font-weight: bold;");
        
        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);
        
        Label userLabel = new Label("Student: Ali Ibn Talib | Room: B-301"); // Changed to B block
        userLabel.setStyle("-fx-text-fill: white; -fx-font-size: 14px;");
        
        header.getChildren().addAll(title, spacer, userLabel);
        return header;
    }
    
    private VBox createMahallahInfo() {
        VBox sidebar = new VBox(15);
        sidebar.setPadding(new Insets(20));
        sidebar.setPrefWidth(220);
        sidebar.setStyle("-fx-background-color: #1B5E20;");
        
        Label sidebarTitle = new Label("YOUR MAHALLAH");
        sidebarTitle.setStyle("-fx-text-fill: white; -fx-font-size: 18px; -fx-font-weight: bold;");
        
        // Mahallah Details Card
        VBox mahallahCard = new VBox(15);
        mahallahCard.setPadding(new Insets(15));
        mahallahCard.setStyle("-fx-background-color: rgba(255,255,255,0.15); -fx-background-radius: 10;");
        
        // Mahallah Icon and Name
        HBox nameRow = new HBox(10);
        Label icon = new Label("🕌");
        icon.setStyle("-fx-font-size: 24px;");
        
        Label mahallahName = new Label(userMahallah);
        mahallahName.setStyle("-fx-text-fill: white; -fx-font-size: 16px; -fx-font-weight: bold;");
        
        nameRow.getChildren().addAll(icon, mahallahName);
        
        // Mahallah Type
        Label typeLabel = new Label("Male Mahallah");
        typeLabel.setStyle("-fx-text-fill: #87CEEB; -fx-font-size: 14px; -fx-font-weight: bold;");
        
        // Separator
        Separator separator = new Separator();
        separator.setStyle("-fx-background-color: rgba(255,255,255,0.3);");
        
        // Room Details
        VBox roomDetails = new VBox(8);
        
        HBox roomRow = new HBox(10);
        Label roomIcon = new Label("🚪");
        Label roomLabel = new Label("Room: B-301");
        roomLabel.setStyle("-fx-text-fill: white; -fx-font-size: 13px;");
        roomRow.getChildren().addAll(roomIcon, roomLabel);
        
        HBox floorRow = new HBox(10);
        Label floorIcon = new Label("📊");
        Label floorLabel = new Label("Floor: 3");
        floorLabel.setStyle("-fx-text-fill: white; -fx-font-size: 13px;");
        floorRow.getChildren().addAll(floorIcon, floorLabel);
        
        HBox blockRow = new HBox(10);
        Label blockIcon = new Label("🏢");
        Label blockLabel = new Label("Block: B");
        blockLabel.setStyle("-fx-text-fill: white; -fx-font-size: 13px;");
        blockRow.getChildren().addAll(blockIcon, blockLabel);
        
        roomDetails.getChildren().addAll(roomRow, floorRow, blockRow);
        
        mahallahCard.getChildren().addAll(nameRow, typeLabel, separator, roomDetails);
        
        // Quick Actions
        VBox actionsBox = new VBox(10);
        actionsBox.setPadding(new Insets(15, 0, 0, 0));
        
        Label actionsTitle = new Label("QUICK ACTIONS");
        actionsTitle.setStyle("-fx-text-fill: #81C784; -fx-font-size: 12px; -fx-font-weight: bold;");
        
        Button changeRoomBtn = new Button("Change Room");
        changeRoomBtn.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-pref-width: 180;");
        
        Button roommatesBtn = new Button("View Roommates");
        roommatesBtn.setStyle("-fx-background-color: #2196F3; -fx-text-fill: white; -fx-pref-width: 180;");
        
        Button facilitiesBtn = new Button("Mahallah Facilities");
        facilitiesBtn.setStyle("-fx-background-color: #FF9800; -fx-text-fill: white; -fx-pref-width: 180;");
        
        actionsBox.getChildren().addAll(actionsTitle, changeRoomBtn, roommatesBtn, facilitiesBtn);
        
        sidebar.getChildren().addAll(sidebarTitle, mahallahCard, actionsBox);
        return sidebar;
    }
    
    private VBox createMainContent() {
        VBox content = new VBox(25);
        content.setPadding(new Insets(30));
        content.setAlignment(Pos.TOP_CENTER);
        
        Label welcome = new Label("As-salamu alaykum, Ali!");
        welcome.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-text-fill: #1B5E20;");
        
        Label subtitle = new Label("Welcome to " + userMahallah + " Mahallah");
        subtitle.setStyle("-fx-font-size: 14px; -fx-text-fill: #666;");
        
        // SERVICE BOXES (Fixed layout)
        VBox servicesBox = new VBox(20);
        servicesBox.setAlignment(Pos.CENTER);
        
        Label servicesTitle = new Label("RESIDENT SERVICES");
        servicesTitle.setStyle("-fx-font-size: 18px; -fx-font-weight: bold; -fx-text-fill: #2E7D32;");
        
        // Service Grid with better boxes
        GridPane serviceGrid = new GridPane();
        serviceGrid.setHgap(20);
        serviceGrid.setVgap(20);
        serviceGrid.setAlignment(Pos.CENTER);
        
        // Service data
        String[] services = {"Room Application", "Maintenance Request", "Parking Report", "Lost Item", "Found Item"};
        String[] icons = {"🏠", "🔧", "🚗", "🔍", "📦"};
        String[] colors = {"#4CAF50", "#2196F3", "#FF9800", "#9C27B0", "#009688"};
        
        for (int i = 0; i < services.length; i++) {
            VBox serviceBox = createServiceBox(icons[i], services[i], colors[i]);
            serviceGrid.add(serviceBox, i % 3, i / 3);
        }
        
        servicesBox.getChildren().addAll(servicesTitle, serviceGrid);
        
        // Quick Stats
        HBox statsBox = new HBox(20);
        statsBox.setAlignment(Pos.CENTER);
        
        VBox roomStat = createStatBox("Room Status", "B-301", "Active", "#4CAF50");
        VBox feeStat = createStatBox("Fee Status", "Paid", "Semester 1 2024", "#2196F3");
        VBox parkingStat = createStatBox("Parking", "Active", "Vehicle: ABC1234", "#FF9800");
        
        statsBox.getChildren().addAll(roomStat, feeStat, parkingStat);
        
        // Today's Activities
        VBox activitiesBox = new VBox(10);
        activitiesBox.setPadding(new Insets(20));
        activitiesBox.setStyle("-fx-background-color: white; -fx-border-color: #ddd; -fx-border-radius: 10;");
        activitiesBox.setPrefWidth(500);
        
        Label activitiesTitle = new Label("📅 TODAY'S ACTIVITIES - BILAL MAHALLAH");
        activitiesTitle.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: #2E7D32;");
        
        VBox activitiesList = new VBox(8);
        String[] activities = {
            "✓ Fajr Prayer - Musolla (5:45 AM)",
            "○ Breakfast served - Cafeteria (7:00-9:00 AM)",
            "✓ Classes begin (9:00 AM)",
            "○ Asr Prayer - Musolla (4:30 PM)",
            "○ Study Session - Library (6:00-8:00 PM)",
            "✓ Maghrib Prayer - Musolla (7:15 PM)",
            "○ Dinner served - Cafeteria (7:30-9:30 PM)"
        };
        
        for (String activity : activities) {
            HBox activityRow = new HBox(10);
            Label status = new Label(activity.startsWith("✓") ? "✓" : "○");
            status.setStyle("-fx-text-fill: " + (activity.startsWith("✓") ? "#4CAF50" : "#FF9800") + ";");
            
            Label activityLabel = new Label(activity.substring(1).trim());
            activityLabel.setStyle("-fx-font-size: 13px;");
            
            activityRow.getChildren().addAll(status, activityLabel);
            activitiesList.getChildren().add(activityRow);
        }
        
        activitiesBox.getChildren().addAll(activitiesTitle, activitiesList);
        
        content.getChildren().addAll(welcome, subtitle, servicesBox, statsBox, activitiesBox);
        return content;
    }
    
    private VBox createServiceBox(String icon, String title, String color) {
        VBox serviceBox = new VBox(10);
        serviceBox.setPadding(new Insets(15));
        serviceBox.setPrefSize(150, 130);
        serviceBox.setAlignment(Pos.CENTER);
        serviceBox.setStyle("-fx-background-color: white; -fx-border-color: " + color + "; " +
                           "-fx-border-width: 2; -fx-background-radius: 10; -fx-border-radius: 10; " +
                           "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.1), 5, 0, 0, 3);");
        
        // Icon
        Label iconLabel = new Label(icon);
        iconLabel.setStyle("-fx-font-size: 28px;");
        
        // Title
        Label titleLabel = new Label(title);
        titleLabel.setStyle("-fx-font-size: 12px; -fx-font-weight: bold; -fx-text-fill: " + color + ";");
        titleLabel.setWrapText(true);
        titleLabel.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        
        // Make it clickable
        serviceBox.setOnMouseClicked(e -> {
            if (title.equals("Room Application")) {
                openRoomApplication();
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Service");
                alert.setHeaderText(title);
                alert.setContentText("This service will open soon!");
                alert.show();
            }
        });
        
        // Hover effect
        serviceBox.setOnMouseEntered(e -> {
            serviceBox.setStyle("-fx-background-color: #F1F8E9; -fx-border-color: " + color + "; " +
                               "-fx-border-width: 3; -fx-background-radius: 10; -fx-border-radius: 10; " +
                               "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.2), 8, 0, 0, 5);");
        });
        
        serviceBox.setOnMouseExited(e -> {
            serviceBox.setStyle("-fx-background-color: white; -fx-border-color: " + color + "; " +
                               "-fx-border-width: 2; -fx-background-radius: 10; -fx-border-radius: 10; " +
                               "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.1), 5, 0, 0, 3);");
        });
        
        serviceBox.getChildren().addAll(iconLabel, titleLabel);
        return serviceBox;
    }
    
    private VBox createStatBox(String title, String value, String description, String color) {
        VBox statBox = new VBox(5);
        statBox.setPadding(new Insets(15));
        statBox.setStyle("-fx-background-color: white; -fx-border-color: #ddd; -fx-border-radius: 8; " +
                        "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.05), 3, 0, 0, 2);");
        statBox.setPrefWidth(180);
        
        Label titleLabel = new Label(title);
        titleLabel.setStyle("-fx-font-size: 12px; -fx-text-fill: #666;");
        
        Label valueLabel = new Label(value);
        valueLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: " + color + ";");
        
        Label descLabel = new Label(description);
        descLabel.setStyle("-fx-font-size: 11px; -fx-text-fill: #888;");
        
        statBox.getChildren().addAll(titleLabel, valueLabel, descLabel);
        return statBox;
    }
    
    private VBox createNotificationsPanel() {
        VBox panel = new VBox(10);
        panel.setPadding(new Insets(20));
        panel.setPrefWidth(250);
        panel.setStyle("-fx-background-color: #e8f5e9;");
        
        Label title = new Label("🔔 NOTIFICATIONS");
        title.setStyle("-fx-font-size: 16px; -fx-font-weight: bold; -fx-text-fill: #2E7D32;");
        
        VBox notificationsList = new VBox(8);
        for (int i = 0; i < notifications.size(); i++) {
            HBox notifItem = new HBox(10);
            notifItem.setPadding(new Insets(10));
            notifItem.setStyle("-fx-background-color: white; -fx-background-radius: 8;");
            
            Label dot = new Label("•");
            dot.setStyle("-fx-text-fill: #4CAF50; -fx-font-size: 20px;");
            
            VBox notifContent = new VBox(3);
            Label text = new Label(notifications.get(i));
            text.setWrapText(true);
            
            Label timeLabel = new Label((i + 1) + " hour" + (i > 0 ? "s" : "") + " ago");
            timeLabel.setStyle("-fx-font-size: 11px; -fx-text-fill: #888;");
            
            notifContent.getChildren().addAll(text, timeLabel);
            notifItem.getChildren().addAll(dot, notifContent);
            notificationsList.getChildren().add(notifItem);
        }
        
        Button viewAllBtn = new Button("View All Notifications →");
        viewAllBtn.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold;");
        
        panel.getChildren().addAll(title, notificationsList, viewAllBtn);
        return panel;
    }
    
    private void openRoomApplication() {
        RoomApplication roomApp = new RoomApplication();
        roomApp.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}