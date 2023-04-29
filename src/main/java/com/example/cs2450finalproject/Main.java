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

        LeftPanel leftPanel = new LeftPanel();
        TopPanel topPanel = new TopPanel();
        CenterPanel centerPanel = new CenterPanel();


        borderPane.setLeft(leftPanel.getRoot());
        borderPane.setCenter(centerPanel.getRoot());

        Label title = new Label("Shop GeForce Graphics Cards, Laptops, and Systems");
        title.setFont(new Font(30));
        title.setTextFill(Color.WHITE);

        VBox topVbox = new VBox(title, topPanel.getRoot());
        topVbox.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));

        borderPane.setTop(topVbox);

        Scene scene = new Scene(borderPane, 1000, 500);
        stage.setTitle("NVIDIA");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}