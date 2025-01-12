module com.example.hrapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hrapp to javafx.fxml;
    opens com.example.hrapp.controllers to javafx.fxml;


    exports com.example.hrapp;
    exports com.example.hrapp.controllers;
}