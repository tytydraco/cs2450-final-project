package com.example.cs2450finalproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane borderPane = new BorderPane();

        LeftPanel leftPanel = new LeftPanel();
        TopPanel topPanel = new TopPanel();
        CenterPanel centerPanel = new CenterPanel();

        borderPane.setTop(topPanel.getRoot());
        borderPane.setLeft(leftPanel.getRoot());
        borderPane.setCenter(centerPanel.getRoot());

        Scene scene = new Scene(borderPane);
        stage.setTitle("NVIDIA");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}