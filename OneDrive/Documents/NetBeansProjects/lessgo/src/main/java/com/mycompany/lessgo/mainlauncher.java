/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lessgo;

import javafx.application.Application;
import javafx.stage.Stage;
/**
 *
 * @author meera
 */

    


public class mainlauncher extends Application {


    @Override
    public void start(Stage primaryStage) {
        // Start with the login page
        loginpagekm loginApp = new loginpagekm();
        Stage loginStage = new Stage();
        loginApp.start(loginStage);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}