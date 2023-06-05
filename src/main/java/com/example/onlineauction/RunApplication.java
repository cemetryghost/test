package com.example.onlineauction;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RunApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        WindowsManager.openWindow("AllUsers/authorization.fxml", "Окно авторизации");
    }

    public static void main(String[] args) {
        launch();
    }
}