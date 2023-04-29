package com.example.cs2450finalproject;

import javafx.collections.FXCollections;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.lang.reflect.Array;

public class Filter {
    public VBox root;
    private boolean collapsed = false;

    public Node getRoot() {
        return root;
    }

    public Filter(String title, Node[] filterItems) {
        Button button = new Button("^");

        Label label = new Label(title);
        label.setPrefWidth(200);
        label.setTextFill(Color.WHITE);
        HBox hBox = new HBox(label, button);


        root = new VBox(
                3,
                hBox,
                new Separator()
        );

        button.setOnAction(event -> {
            if (!collapsed) {
                collapsed = true;
                button.setText("v");
                root.getChildren().removeAll(filterItems);
            } else {
                collapsed = false;
                button.setText("^");
                root.getChildren().addAll(filterItems);
            }
        });



        root.getChildren().addAll(filterItems);
    }
}