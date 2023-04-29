package com.example.cs2450finalproject;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class LeftPanel {
    public VBox root;

    public Node getRoot() {
        return root;
    }

    public LeftPanel() {
        Button resetButton = new Button("Reset Filters");
        resetButton.setPrefWidth(100);

        HBox resetHBox = new HBox(resetButton);
        resetHBox.setAlignment(Pos.BASELINE_CENTER);

        resetButton.setAlignment(Pos.BASELINE_CENTER);


        Filter categoryFilter = new Filter("Product Category", new Node[] {
                new FilterItem("Graphics Cards", 113).getRoot(),
                new FilterItem("GeForce Laptops", 54).getRoot(),
                new FilterItem("NVIDIA Studio Laptop", 33).getRoot(),
                new FilterItem("Gaming Desktops", 19).getRoot(),
                new FilterItem("Gaming Monitors", 9).getRoot(),
                new FilterItem("Gaming Mice", 8).getRoot(),
                new FilterItem("NVLink", 2).getRoot()
        });

        Filter gpuFilter = new Filter("GPU", new Node[] {
                new FilterItem("RTX 4080", 22).getRoot(),
                new FilterItem("RTX 4070", 20).getRoot(),
                new FilterItem("RTX 4070 TI", 18).getRoot(),
                new FilterItem("RTX 4090", 18).getRoot(),
                new FilterItem("RTX 4060", 2).getRoot(),
                new FilterItem("RTX 4050", 2).getRoot()
        });

        Region topSpacer = new Region();
        topSpacer.setPrefHeight(30);

        root = new VBox(
                30,
                topSpacer,
                resetHBox,
                categoryFilter.getRoot(),
                gpuFilter.getRoot()
                );
        root.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setPrefWidth(200);

        BorderPane.setAlignment(resetButton, Pos.BASELINE_CENTER);
    }
}
