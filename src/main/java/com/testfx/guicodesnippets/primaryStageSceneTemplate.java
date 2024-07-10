package com.testfx.guicodesnippets;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class primaryStageSceneTemplate extends Application {
    public void start(Stage primaryStage) {
        // Create the root layout
        VBox root = new VBox(10); // 10 is the spacing between elements
        root.setPadding(new javafx.geometry.Insets(15));

        // Add a label to the layout
        Label welcomeLabel = new Label("Template Label ");
        root.getChildren().add(welcomeLabel);

        // Create the scene
        Scene scene = new Scene(root, 300, 200);

        // Set up the stage
        primaryStage.setTitle("Basic Window Template");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
