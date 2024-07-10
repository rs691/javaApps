package com.testfx.guicodesnippets;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StyledWindowTemplate extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the root layout
        VBox root = new VBox(10);
        root.setPadding(new Insets(15));

        // Add components
        Label welcomeLabel = new Label("Welcome to JavaFX!");
        TextField nameField = new TextField();
        nameField.setPromptText("Enter your name");
        Button submitButton = new Button("Submit");

        root.getChildren().addAll(welcomeLabel, nameField, submitButton);

        // Create the scene
        Scene scene = new Scene(root, 300, 200);

        // Load the CSS file
        scene.getStylesheets().add(getClass().getResource("/css/styles.css").toExternalForm());

        // Set up the stage
        primaryStage.setTitle("Styled Window Template");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}