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



        root = new VBox();
        root.getStyleClass().add("right-pane");
        root.setPrefWidth(280);
        root.setPrefHeight(450);
    }
}
