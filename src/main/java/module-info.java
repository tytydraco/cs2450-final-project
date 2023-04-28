module com.example.cs2450finalproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cs2450finalproject to javafx.fxml;
    exports com.example.cs2450finalproject;
}