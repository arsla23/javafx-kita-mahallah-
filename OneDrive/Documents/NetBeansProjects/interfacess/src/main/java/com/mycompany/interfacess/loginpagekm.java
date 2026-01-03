package com.mycompany.interfacess;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class loginpagekm extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        
        Image bgImage = new Image("file:src/main/java/com/mycompany/interfacess/im1.jpg");
        BackgroundImage background = new BackgroundImage(
                bgImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(
                        100, 100, true, true, true, false
                )
        );
        root.setBackground(new Background(background));
        
        VBox card = new VBox(15);
        card.setPadding(new Insets(30));
        card.setAlignment(Pos.CENTER);
        card.setMaxWidth(380);
        card.setMaxHeight(Region.USE_PREF_SIZE);
        card.setStyle(
                "-fx-background-color: rgba(255,255,255,0.95);" +
                "-fx-background-radius: 20;" +
                "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.3), 20, 0, 0, 5);"
        );
        
        Label title = new Label("KITA Mahallah");
        title.setStyle("-fx-font-size: 22px; -fx-font-weight: bold;");
        
        Label subtitle = new Label("Login to continue");
        subtitle.setTextFill(Color.GRAY);
        
        TextField userField = new TextField();
        userField.setPromptText("Username");
        
        PasswordField passField = new PasswordField();
        passField.setPromptText("Password");
        
        Button studentBtn = new Button("Login as Student");
        Button adminBtn = new Button("Login as Admin");
        
        studentBtn.setPrefWidth(220);
        adminBtn.setPrefWidth(220);
        
        studentBtn.setStyle(
                "-fx-background-color: #1e7f4f;" +
                "-fx-text-fill: white;" +
                "-fx-background-radius: 10;"
        );
        
        adminBtn.setStyle(
                "-fx-background-color: #333;" +
                "-fx-text-fill: white;" +
                "-fx-background-radius: 10;"
        );
        
        Label status = new Label();
        
        studentBtn.setOnAction(e -> {
            status.setText("Logged in as Student");
            status.setTextFill(Color.GREEN);
        });
        
        adminBtn.setOnAction(e -> {
            status.setText("Logged in as Admin");
            status.setTextFill(Color.BLUE);
        });
        
        card.getChildren().addAll(
                title,
                subtitle,
                userField,
                passField,
                studentBtn,
                adminBtn,
                status
        );
        
        // Center the card
        root.setCenter(card);
        
        Scene scene = new Scene(root, 1000, 600);
        stage.setTitle("KITA Mahallah Login");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}