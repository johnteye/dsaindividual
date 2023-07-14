module com.example.jstocks {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jstocks to javafx.fxml;
    exports com.example.jstocks;
    exports com.example.jstocks.controller;
    opens com.example.jstocks.controller to javafx.fxml;
}