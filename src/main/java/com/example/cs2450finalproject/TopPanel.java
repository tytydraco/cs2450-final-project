package com.example.cs2450finalproject;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class TopPanel {
    public HBox root;

    public Node getRoot() {
        return root;
    }

    private boolean allCollapsed = false;

    public TopPanel() {
        Button resetButton = new Button("...");
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

        Filter manufacturerFilter = new Filter("Manufacturer", new Node[] {
                new FilterItem("NVIDIA", 79).getRoot(),
                new FilterItem("ACER", 59).getRoot(),
                new FilterItem("ALIENWARE", 42).getRoot(),
                new FilterItem("AORUS", 33).getRoot(),
                new FilterItem("ASUS", 29).getRoot(),
                new FilterItem("BUILD REDUX", 13).getRoot(),
                new FilterItem("CLX", 6).getRoot(),
                new FilterItem("CORSAIR", 1).getRoot()
        });

        Filter screenSizeFilter = new Filter("Screen Size", new Node[] {
                new FilterItem("55\"", 3).getRoot(),
                new FilterItem("43\"", 1).getRoot(),
                new FilterItem("38\"", 2).getRoot(),
                new FilterItem("37.5\"", 2).getRoot(),
                new FilterItem("35\"", 4).getRoot(),
                new FilterItem("34\"", 5).getRoot(),
                new FilterItem("32\"", 2).getRoot(),
                new FilterItem("28\"", 7).getRoot()
        });

        Filter nvTechFilter = new Filter("NVIDIA Technology", new Node[] {
                new FilterItem("Reflex", 7).getRoot(),
                new FilterItem("G SYNC", 2).getRoot()
        });

        Region topSpacer = new Region();
        topSpacer.setPrefHeight(30);

        resetButton.setOnAction(event -> {
            allCollapsed = !allCollapsed;

            if (allCollapsed) {
                root.setPrefHeight(0);
            } else {
                root.setPrefHeight(200);
            }

            // Unhide / hide all collapses
            categoryFilter.setCollapsed(allCollapsed);
            gpuFilter.setCollapsed(allCollapsed);
            manufacturerFilter.setCollapsed(allCollapsed);
            screenSizeFilter.setCollapsed(allCollapsed);
            nvTechFilter.setCollapsed(allCollapsed);
        });

        root = new HBox(
                30,
                resetButton,
                categoryFilter.getRoot(),
                gpuFilter.getRoot(),
                manufacturerFilter.getRoot(),
                screenSizeFilter.getRoot(),
                nvTechFilter.getRoot()
        );
        root.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setPrefHeight(200);

        BorderPane.setAlignment(resetButton, Pos.BASELINE_CENTER);
    }
}
