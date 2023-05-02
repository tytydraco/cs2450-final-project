package com.example.cs2450finalproject;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;

public class RightPanel {
    public VBox root;

    public Node getRoot() {
        return root;
    }
    public RightPanel() {



        ItemBox item1 = new ItemBox( "GeForce-RTX4080-Back.png", "Nvidia GeForce RTX 4080", 1199.00);

        root = new VBox(item1.getRoot());
        root.getStyleClass().add("right-pane");
        root.setPrefWidth(200);
        root.setPrefHeight(450);
    }
}
