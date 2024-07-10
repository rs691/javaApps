package com.testfx.guicodesnippets;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventHandlingTemplate extends Application {

    private TextArea logArea;

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(10);
        root.setPadding(new Insets(15));

        TextField inputField = new TextField();
        inputField.setPromptText("Enter text here");

        Button submitButton = new Button("Submit");

        logArea = new TextArea();
        logArea.setEditable(false);
        logArea.setPrefHeight(200);

        root.getChildren().addAll(inputField, submitButton, logArea);

        // Event handling
        inputField.setOnAction(e -> handleSubmit(inputField.getText()));
        submitButton.setOnAction(e -> handleSubmit(inputField.getText()));

        Scene scene = new Scene(root, 500, 350);
        // Load the CSS file
        scene.getStylesheets().add(getClass().getResource("/css/styles.css").toExternalForm());
        primaryStage.setTitle("Event Handling Template");
        primaryStage.setScene(scene);
        primaryStage.show();

        log("Application started");
    }

    private void handleSubmit(String text) {
        if (!text.isEmpty()) {
            log("Submitted: " + text);
        } else {
            log("Empty submission");
        }
    }

    private void log(String message) {
        // Log to TextArea
        logArea.appendText(message + "\n");

        // Log to console
        System.out.println(message);
    }

    public static void main(String[] args) {
        launch(args);
    }
}