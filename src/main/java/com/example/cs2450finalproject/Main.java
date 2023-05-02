package com.example.cs2450finalproject;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        BorderPane borderPane = new BorderPane();

        TopPanel topPanel = new TopPanel();
        CenterPanel centerPanel = new CenterPanel();


        borderPane.setCenter(centerPanel.getRoot());

        Label title = new Label("Shop GeForce Graphics Cards, Laptops, and Systems");
        title.setId("title");
        title.setTextFill(Color.WHITE);

        Region spacer = new Region();
        spacer.setPrefHeight(30);

        VBox topVbox = new VBox(title, topPanel.getRoot(), spacer);
        topVbox.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));

        borderPane.setTop(topVbox);

        Scene scene = new Scene(borderPane, 1920, 1080);
        scene.getStylesheets().add(Main.class.getResource("style.css").toExternalForm());        stage.setTitle("NVIDIA");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}