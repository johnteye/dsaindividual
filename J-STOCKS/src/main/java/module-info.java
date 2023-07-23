module com.example.jstocks {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires fontawesomefx;


    opens com.example.jstocks to javafx.fxml;
    exports com.example.jstocks;
}