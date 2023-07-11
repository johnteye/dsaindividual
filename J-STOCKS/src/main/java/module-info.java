module com.example.jstocks {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jstocks to javafx.fxml;
    exports com.example.jstocks;
}