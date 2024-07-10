package com.testfx.guicodesnippets;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ModularEventHandlingTemplate extends Application {

        private TextArea logArea;
        private TextField inputField;

        @Override
        public void start(Stage primaryStage) {
            VBox root = new VBox(10);
            root.setPadding(new Insets(15));

            inputField = new TextField();
            inputField.setPromptText("Enter text here");

            ClearButton clearButton = new ClearButton();
            clearButton.addEventHandler(ClearEvent.CLEAR_EVENT, e -> handleClear());

            logArea = new TextArea();
            logArea.setEditable(false);
            logArea.setPrefHeight(200);

            HBox inputBox = new HBox(10);
            inputBox.getChildren().addAll(inputField, clearButton);

            root.getChildren().addAll(inputBox, logArea);

            // Event handling
            inputField.setOnAction(e -> handleSubmit(inputField.getText()));

            Scene scene = new Scene(root, 300, 350);
            primaryStage.setTitle("Modular Event Handling Template");
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

        private void handleClear() {
            inputField.clear();
            log("Input cleared");
        }

        private void log(String message) {
            logArea.appendText(message + "\n");
            System.out.println(message);
        }

        public static void main(String[] args) {
            launch(args);
        }
    }

