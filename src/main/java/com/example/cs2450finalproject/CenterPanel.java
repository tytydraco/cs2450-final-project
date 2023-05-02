package com.example.cs2450finalproject;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class CenterPanel {
    public GridPane root;
    public VBox toRightPanel;

    public Node getRoot() {
        return root;
    }
    public CenterPanel() {
        ItemBox item1 = new ItemBox("GV-N4080EAGLE-16GD.png", "Gigabyte GV-N4080EAGLE-16GD graphics card", 1149.99);
        item1.featureBox.getChildren().set(0, new Label("Cooling System:Active"));
        item1.featureBox.getChildren().set(1, new Label("Boost Clock Speed:2505 MHz"));
        item1.featureBox.getChildren().set(2, new Label("GPU Memory Size:16 GB"));

        ItemBox item2 = new ItemBox("GV-N4090GAMING OC-24GD.png", "Gigabyte GeForce RTX 4090 GAMING OC 24G", 1699.99);
        item2.featureBox.getChildren().set(0,  new Label("Cooling System:Active"));
        item2.featureBox.getChildren().set(1,  new Label("Boost Clock Speed:--"));
        item2.featureBox.getChildren().set(2,  new Label("GPU Memory Size:24 GB"));

        ItemBox item3 = new ItemBox("TUF-RTX4090-O24G-GAMING.png", "ASUS TUF-RTX4090-O24G-GAMING", 1799.99);
        item3.featureBox.getChildren().set(0,  new Label("Cooling System:Axial-tech"));
        item3.featureBox.getChildren().set(1,  new Label("Boost Clock Speed:2565 MHz"));
        item3.featureBox.getChildren().set(2,  new Label("GPU Memory Size:24 GB"));

        ItemBox item4 = new ItemBox( "GeForce-RTX4080-Back.png", "Nvidia GeForce RTX 4080", 1199.00);
        item4.featureBox.getChildren().set(0,  new Label("Cooling System: Fan"));
        item4.featureBox.getChildren().set(1,  new Label("Boost Clock Speed: 2.51 GHz"));
        item4.featureBox.getChildren().set(2,  new Label("GPU Memory Size: 16 GB"));

        ItemBox item5 = new ItemBox( "VCG409024TFXXPB1.png", "PNY GeForce RTX 4090 Gaming VERTO", 1609.99);
        item5.featureBox.getChildren().set(0,  new Label("Cooling System:Triple Fan"));
        item5.featureBox.getChildren().set(1,  new Label("Boost Clock Speed:2520 MHz"));
        item5.featureBox.getChildren().set(2,  new Label("GPU Memory Size:24 GB"));

        ItemBox item6 = new ItemBox( "SUPRIM-X.png", "MSI GeForce RTX 4090 SUPRIM X 24G", 1749.99);
        item6.featureBox.getChildren().set(0,  new Label("Cooling System:TRI-FROZR 3S"));
        item6.featureBox.getChildren().set(1,  new Label("Boost Clock Speed:--"));
        item6.featureBox.getChildren().set(2,  new Label("GPU Memory Size:24 GB"));

        ItemBox item7 = new ItemBox( "GIGABYTE-GeForce-RTX-4070-AERO-OC-12G.png", "Gigabyte GeForce RTX 4070 Ti AERO OC 12G", 899.99);
        item7.featureBox.getChildren().set(0,  new Label("Cooling System:GDDR6X"));
        item7.featureBox.getChildren().set(1,  new Label("Boost Clock Speed:2310 MHz"));
        item7.featureBox.getChildren().set(2,  new Label("GPU Memory Size:12 GB"));

        ItemBox item8 = new ItemBox( "VCG408016TFXXPB1-O_US.png", "PNY GeForce RTX 4080 Gaming VERTO", 1199.99);
        item8.featureBox.getChildren().set(0,  new Label("Cooling System:Active"));
        item8.featureBox.getChildren().set(1,  new Label("Boost Clock Speed:2510 MHz"));
        item8.featureBox.getChildren().set(2,  new Label("GPU Memory Size:16 GB"));


        Button buyButton = new Button("Buy Now");
        Button compare = new Button("Compare");
        compare.setOnAction(event-> {
            addToCompare(item1);
        });


        root = new GridPane();
        root.setVgap(5);
        root.setHgap(5);
        root.add(item1.getRoot(), 0, 0);
        root.add(item2.getRoot(), 1, 0);
        root.add(item3.getRoot(), 2, 0);
        root.add(item4.getRoot(), 3, 0);

        root.add(item5.getRoot(), 0, 1);
        root.add(item6.getRoot(), 1, 1);
        root.add(item7.getRoot(), 2, 1);
        root.add(item8.getRoot(), 3, 1);
    }

    public void addToCompare(ItemBox item) {
        toRightPanel.getChildren().add(item.getRoot());
    }
}
