package com.example.cs2450finalproject;

import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;

public class FilterItem {
    public HBox root;

    public Node getRoot() {
        return root;
    }

    public FilterItem(String name, int count) {
        CheckBox checkBox = new CheckBox();
        checkBox.setPrefWidth(10);
        checkBox.setPrefHeight(10);
        Label label = new Label(name);
        Label countLabel = new Label("(" + count + ")");

        label.setTextFill(Color.WHITE);
        countLabel.setTextFill(Color.WHITE);

        root = new HBox(
                5,
                checkBox,
                label,
                countLabel
        );
        label.setPrefWidth(150);
        root.setPrefWidth(200);
    }
}
