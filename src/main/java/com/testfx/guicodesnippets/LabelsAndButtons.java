package com.testfx.guicodesnippets;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class LabelsAndButtons extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Declares label
        Label label = new Label("Hello World");

        // Declares Button
        Button button = new Button("Button");
    }
}
