package com.example.cs2450finalproject;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class ItemBox {
    public GridPane root;

    public Node getRoot() {
        return root;
    }
    public ItemBox(String imageName, String product, double price) {

        ImageView img = new ImageView(new Image(String.format("file:src/main/resources/img/%s", imageName)));
        img.setPreserveRatio(true);
        img.setFitHeight(100);

        Label productName = new Label(product);
        productName.getStyleClass().add("product-name");

        Label cost = new Label(String.format("$%,.2f", price));


        Label feature1 = new Label("Cooling System: Fan");
        Label feature2 = new Label("Boost Clock Speed: 2.51 GHz");
        Label feature3 = new Label("GPU Memory Size: 16 GB");

        VBox featureBox = new VBox(5, feature1, feature2, feature3);

        root = new GridPane();
        root.add(img, 0,0);
        root.add(productName, 0,1);
        root.add(cost, 0,2);
        root.add(featureBox, 0,3);

        GridPane.setFillWidth(root, true);
        GridPane.setHalignment(img, HPos.CENTER);
        GridPane.setHalignment(cost, HPos.RIGHT);

        root.getStyleClass().add("item-box");
        root.setAlignment(Pos.BASELINE_CENTER);
    }
}
