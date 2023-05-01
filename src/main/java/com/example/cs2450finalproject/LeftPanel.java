package com.example.cs2450finalproject;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class LeftPanel {
    public VBox root;

    public Node getRoot() {
        return root;
    }

    public LeftPanel() {
        root = new VBox(
                30,
                new Label("TODO")
                );
        root.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
        root.setPrefWidth(200);
    }
}
