/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacess;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.collections.ObservableList;

/**
 *
 * @author meera
 */
public class adminui extends Application {
 @Override
 public void start(Stage stage) {
        BorderPane root = new BorderPane();
        VBox sidebar = new VBox(20);
        sidebar.setPadding(new Insets(20));
        sidebar.setStyle("-fx-background-color: #333;"); // same as login admin button
        sidebar.setPrefWidth(220);
        Label adminPanelLabel = new Label("Admin Panel");
        adminPanelLabel.setFont(Font.font(20));
        adminPanelLabel.setTextFill(Color.WHITE);
        Button overviewBtn = createSidebarButton("Overview");
        Button accommodationBtn = createSidebarButton("Accommodation");
        Button maintenanceBtn = createSidebarButton("Maintenance");
        Button notificationsBtn = createSidebarButton("Send Notification");
        Button settingsBtn = createSidebarButton("Settings");
        Button logoutBtn = createSidebarButton("Logout");
        sidebar.getChildren().addAll(adminPanelLabel, overviewBtn, accommodationBtn, maintenanceBtn, notificationsBtn, settingsBtn, logoutBtn);
        root.setLeft(sidebar);
        VBox mainContent = new VBox(20);
        mainContent.setPadding(new Insets(20));
        mainContent.setStyle("-fx-background-color: #ffffff;"); // white like login card
        Label title = new Label("Kita Mahallah - Admin Dashboard");
        title.setFont(Font.font(24));
        title.setTextFill(Color.web("#333"));
        Label subtitle = new Label("Manage all mahallah operations and services");
        subtitle.setFont(Font.font(14));
        subtitle.setTextFill(Color.GRAY);
        TableView<ObservableList<String>> table = new TableView<>();
        table.setPrefHeight(250);
        String[] columnNames = {"Name", "Status", "Application"};
        for (int i = 0; i < columnNames.length; i++) {
            final int colIndex = i;
            TableColumn<ObservableList<String>, String> col = new TableColumn<>(columnNames[i]);
            col.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().get(colIndex)));
            table.getColumns().add(col);
        }
        ObservableList<ObservableList<String>> data = FXCollections.observableArrayList();
        data.add(FXCollections.observableArrayList("Ahmad Ibrahim", "Pending", "Application A001 - Block A-301"));
        data.add(FXCollections.observableArrayList("Fatimah Zahra", "Completed", "Application A002 - Block B-205"));
        data.add(FXCollections.observableArrayList("Muhammad Ali", "Pending", "Application A003 - Block C-102"));
        data.add(FXCollections.observableArrayList("Noor Aisyah", "Rejected", "Application A004 - N/A"));
        data.add(FXCollections.observableArrayList("Hassan Omar", "Pending", "Application A005 - Block A-405"));
        table.setItems(data);
        mainContent.getChildren().addAll(title, subtitle, new Label("Recent Activity"), table);
        root.setCenter(mainContent);
        Scene scene = new Scene(root, 1000, 600);
        stage.setTitle("Admin Dashboard - KITA Mahallah");
        stage.setScene(scene);
        stage.show();
    }
    private Button createSidebarButton(String text) {
        Button btn = new Button(text);
        btn.setPrefWidth(180);
        btn.setStyle("-fx-background-color: #1e7f4f; -fx-text-fill: white; -fx-background-radius: 10;"); // login green
        btn.setOnMouseEntered(e -> btn.setStyle("-fx-background-color: #28a060; -fx-text-fill: white; -fx-background-radius: 10;")); // hover
        btn.setOnMouseExited(e -> btn.setStyle("-fx-background-color: #1e7f4f; -fx-text-fill: white; -fx-background-radius: 10;"));
        return btn;
    }
    public static void main(String[] args) {
        launch(args);
    }
}
