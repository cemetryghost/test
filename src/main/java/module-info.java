module com.example.onlineauction {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.jfoenix;
    requires java.sql;

    opens com.example.onlineauction to javafx.fxml;
    exports com.example.onlineauction;
    exports com.example.onlineauction.controller;
    opens com.example.onlineauction.controller to javafx.fxml;
    exports com.example.onlineauction.dao;
    opens com.example.onlineauction.dao to javafx.fxml;
    exports com.example.onlineauction.util;
    opens com.example.onlineauction.util to javafx.fxml;
    exports com.example.onlineauction.model;
    opens com.example.onlineauction.model to javafx.fxml;
    exports com.example.onlineauction.constants;
    opens com.example.onlineauction.constants to javafx.fxml;
}