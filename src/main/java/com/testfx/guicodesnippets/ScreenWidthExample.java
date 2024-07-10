package com.testfx.guicodesnippets;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.stage.Stage;

public class ScreenWidthExample extends Application {
    @Override
    public void start(Stage primaryStage) {

        //Step 1 - Create the root layout
        VBox root = new VBox(10); // set the spacing size
        root.setPadding(new javafx.geometry.Insets(15));

        // Add a label to the layout
        Label welcomeLabel = new Label("Template Label ");
        root.getChildren().add(welcomeLabel);

        // Create the scene
        Scene scene = new Scene(root, 300, 200);

        // Set up the stage
        primaryStage.setTitle("Basic Window Template");
        // primaryStage.setFullScreen(true);  sets to full screen size
        // primaryStage.setMaximized(true);    sets screen size maximized
        // primaryStage.setWidth(Screen.getPrimary().getBounds().getWidth());
        // primaryStage.setHeight(Screen.getPrimary().getBounds().getHeight());
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
