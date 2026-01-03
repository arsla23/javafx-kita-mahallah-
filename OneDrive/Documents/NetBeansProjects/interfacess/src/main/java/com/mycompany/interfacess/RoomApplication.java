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
import javafx.stage.Stage;

/**
 *
 * @author meera
 */

public class RoomApplication extends Application {
    
    private String[] maleMahallahs = {
        "Al-Faruq", "As-Siddiq", "Ali Ibn Abi Talib", "Bilal Ibn Rabah",
        "Uthman Ibn Affan", "Zubair Al-Awwam"
    };
    
    private String[] femaleMahallahs = {
        "Aminah", "Asiah", "Asma'", "Hafsah", "Halimatus Saadiah",
        "Maryam", "Nusaibah", "Safiyyah", "Sumayyah"
    };
    
    private String[] genderNeutralMahallahs = {
        "Ruqayyah", "Salahuddin"
    };
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        root.setStyle("-fx-background-color: #f5f9f5;");
        
        // HEADER
        HBox header = new HBox();
        header.setPadding(new Insets(15, 25, 15, 25));
        header.setStyle("-fx-background-color: #2E7D32;");
        
        Label title = new Label("🏛️ KITA MAHALLAH ROOM APPLICATION");
        title.setStyle("-fx-text-fill: white; -fx-font-size: 18px; -fx-font-weight: bold;");
        header.getChildren().add(title);
        
        // MAIN CONTENT
        VBox mainContent = new VBox(20);
        mainContent.setPadding(new Insets(30));
        mainContent.setAlignment(Pos.TOP_CENTER);
        
        // Step 1: Select Gender
        VBox genderSection = new VBox(10);
        genderSection.setAlignment(Pos.CENTER_LEFT);
        
        Label step1Label = new Label("STEP 1: SELECT YOUR GENDER");
        step1Label.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: #1B5E20;");
        
        ToggleGroup genderGroup = new ToggleGroup();
        HBox genderOptions = new HBox(25);
        
        RadioButton maleBtn = new RadioButton("MALE STUDENT");
        maleBtn.setToggleGroup(genderGroup);
        maleBtn.setSelected(true);
        maleBtn.setStyle("-fx-font-weight: bold;");
        
        RadioButton femaleBtn = new RadioButton("FEMALE STUDENT");
        femaleBtn.setToggleGroup(genderGroup);
        femaleBtn.setStyle("-fx-font-weight: bold;");
        
        RadioButton neutralBtn = new RadioButton("PREFER GENDER NEUTRAL");
        neutralBtn.setToggleGroup(genderGroup);
        neutralBtn.setStyle("-fx-font-weight: bold;");
        
        genderOptions.getChildren().addAll(maleBtn, femaleBtn, neutralBtn);
        genderSection.getChildren().addAll(step1Label, genderOptions);
        
        // Step 2: Select Mahallah
        VBox mahallahSection = new VBox(10);
        mahallahSection.setAlignment(Pos.CENTER_LEFT);
        
        Label step2Label = new Label("STEP 2: SELECT MAHALLAH");
        step2Label.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: #1B5E20;");
        
        ComboBox<String> mahallahCombo = new ComboBox<>();
        mahallahCombo.setPrefWidth(250);
        mahallahCombo.setPromptText("Choose your Mahallah");
        
        // Initially load male mahallahs
        mahallahCombo.getItems().addAll(maleMahallahs);
        mahallahCombo.setValue(maleMahallahs[0]);
        
        // Update mahallah list when gender changes
        maleBtn.selectedProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal) {
                mahallahCombo.getItems().clear();
                mahallahCombo.getItems().addAll(maleMahallahs);
                mahallahCombo.setValue(maleMahallahs[0]);
            }
        });
        
        femaleBtn.selectedProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal) {
                mahallahCombo.getItems().clear();
                mahallahCombo.getItems().addAll(femaleMahallahs);
                mahallahCombo.setValue(femaleMahallahs[0]);
            }
        });
        
        neutralBtn.selectedProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal) {
                mahallahCombo.getItems().clear();
                mahallahCombo.getItems().addAll(genderNeutralMahallahs);
                mahallahCombo.setValue(genderNeutralMahallahs[0]);
            }
        });
        
        mahallahSection.getChildren().addAll(step2Label, mahallahCombo);
        
        // Step 3: Room Details
        VBox roomSection = new VBox(10);
        roomSection.setAlignment(Pos.CENTER_LEFT);
        
        Label step3Label = new Label("STEP 3: ENTER ROOM DETAILS");
        step3Label.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: #1B5E20;");
        
        GridPane roomGrid = new GridPane();
        roomGrid.setHgap(15);
        roomGrid.setVgap(10);
        
        // Block Letter
        Label letterLabel = new Label("Block Letter:");
        ComboBox<String> letterCombo = new ComboBox<>();
        letterCombo.getItems().addAll("A", "B", "C", "D", "E", "F", "G");
        letterCombo.setValue("A");
        letterCombo.setPrefWidth(80);
        
        // Floor
        Label floorLabel = new Label("Floor:");
        ComboBox<String> floorCombo = new ComboBox<>();
        floorCombo.getItems().addAll("1", "2", "3", "4");
        floorCombo.setValue("1");
        floorCombo.setPrefWidth(80);
        
        // Room Number
        Label roomNumLabel = new Label("Room:");
        ComboBox<String> roomCombo = new ComboBox<>();
        roomCombo.getItems().addAll("1", "2", "3", "4", "5", "6", "7");
        roomCombo.setValue("1");
        roomCombo.setPrefWidth(80);
        
        // Compartment
        Label compLabel = new Label("Compartment:");
        ComboBox<String> compCombo = new ComboBox<>();
        compCombo.getItems().addAll("A", "B", "C", "D");
        compCombo.setValue("A");
        compCombo.setPrefWidth(80);
        
        roomGrid.add(letterLabel, 0, 0);
        roomGrid.add(letterCombo, 1, 0);
        roomGrid.add(floorLabel, 0, 1);
        roomGrid.add(floorCombo, 1, 1);
        roomGrid.add(roomNumLabel, 2, 0);
        roomGrid.add(roomCombo, 3, 0);
        roomGrid.add(compLabel, 2, 1);
        roomGrid.add(compCombo, 3, 1);
        
        roomSection.getChildren().addAll(step3Label, roomGrid);
        
        // Room Preview
        VBox previewSection = new VBox(10);
        previewSection.setAlignment(Pos.CENTER);
        previewSection.setPadding(new Insets(15));
        previewSection.setStyle("-fx-background-color: #E8F5E9; -fx-background-radius: 10;");
        
        Label previewTitle = new Label("ROOM PREVIEW");
        previewTitle.setStyle("-fx-font-weight: bold; -fx-text-fill: #2E7D32;");
        
        Label roomPreview = new Label("A1.1A");
        roomPreview.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        
        Label previewDesc = new Label("Block A, Floor 1, Room 1, Compartment A");
        previewDesc.setStyle("-fx-font-size: 12px; -fx-text-fill: #666;");
        
        // Update preview when selections change
        Runnable updatePreview = () -> {
            String roomCode = letterCombo.getValue() + floorCombo.getValue() + 
                             "." + roomCombo.getValue() + compCombo.getValue();
            roomPreview.setText(roomCode);
            previewDesc.setText("Block " + letterCombo.getValue() + 
                              ", Floor " + floorCombo.getValue() + 
                              ", Room " + roomCombo.getValue() + 
                              ", Compartment " + compCombo.getValue());
        };
        
        letterCombo.setOnAction(e -> updatePreview.run());
        floorCombo.setOnAction(e -> updatePreview.run());
        roomCombo.setOnAction(e -> updatePreview.run());
        compCombo.setOnAction(e -> updatePreview.run());
        
        updatePreview.run(); // Initial preview
        
        previewSection.getChildren().addAll(previewTitle, roomPreview, previewDesc);
        
        // Action Buttons
        HBox buttonBox = new HBox(20);
        buttonBox.setAlignment(Pos.CENTER);
        
        Button applyBtn = new Button("✅ SUBMIT APPLICATION");
        applyBtn.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white; " +
                         "-fx-font-weight: bold; -fx-font-size: 14px; -fx-padding: 12 25;");
        applyBtn.setOnAction(e -> submitApplication(mahallahCombo, letterCombo, 
                                                   floorCombo, roomCombo, compCombo));
        
        Button cancelBtn = new Button("❌ CANCEL");
        cancelBtn.setStyle("-fx-background-color: #f44336; -fx-text-fill: white; " +
                          "-fx-font-weight: bold; -fx-padding: 12 25;");
        cancelBtn.setOnAction(e -> primaryStage.close());
        
        buttonBox.getChildren().addAll(applyBtn, cancelBtn);
        
        // Mahallah Type Indicator
        Label typeInfo = new Label();
        typeInfo.setStyle("-fx-font-size: 12px; -fx-text-fill: #666;");
        
        // Update type info when mahallah changes
        mahallahCombo.setOnAction(e -> {
            String selected = mahallahCombo.getValue();
            if (isGenderNeutralMahallah(selected)) {
                typeInfo.setText("✓ Selected: Gender Neutral Mahallah");
                typeInfo.setStyle("-fx-text-fill: #4CAF50; -fx-font-weight: bold;");
            } else if (isFemaleMahallah(selected)) {
                typeInfo.setText("✓ Selected: Female Mahallah");
                typeInfo.setStyle("-fx-text-fill: #FF69B4; -fx-font-weight: bold;");
            } else {
                typeInfo.setText("✓ Selected: Male Mahallah");
                typeInfo.setStyle("-fx-text-fill: #2196F3; -fx-font-weight: bold;");
            }
        });
        
        // Initial type info
        typeInfo.setText("✓ Selected: Male Mahallah");
        typeInfo.setStyle("-fx-text-fill: #2196F3; -fx-font-weight: bold;");
        
        mainContent.getChildren().addAll(genderSection, mahallahSection, roomSection, 
                                        previewSection, typeInfo, buttonBox);
        
        root.setTop(header);
        root.setCenter(mainContent);
        
        Scene scene = new Scene(root, 800, 650);
        primaryStage.setTitle("KITA Mahallah - Room Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private boolean isGenderNeutralMahallah(String name) {
        for (String neutral : genderNeutralMahallahs) {
            if (name.equals(neutral)) return true;
        }
        return false;
    }
    
    private boolean isFemaleMahallah(String name) {
        for (String female : femaleMahallahs) {
            if (name.equals(female)) return true;
        }
        return false;
    }
    
    private void submitApplication(ComboBox<String> mahallah, ComboBox<String> letter, 
                                   ComboBox<String> floor, ComboBox<String> room, 
                                   ComboBox<String> comp) {
        String roomNumber = letter.getValue() + floor.getValue() + "." + 
                           room.getValue() + comp.getValue();
        String selectedMahallah = mahallah.getValue();
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Application Successful");
        alert.setHeaderText("✅ Room Application Submitted");
        alert.setContentText("Mahallah: " + selectedMahallah + 
                           "\nRoom: " + roomNumber + 
                           "\n\nYour application will be processed within 3-5 working days." +
                           "\nYou will receive a notification once approved.");
        alert.showAndWait();
    }
    
    public void show() {
        Stage stage = new Stage();
        start(stage);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}