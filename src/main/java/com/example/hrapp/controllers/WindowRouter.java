package com.example.hrapp.controllers;

import com.example.hrapp.HelloApplication;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class WindowRouter {

    public static void route(Event event, String page, String pageTitle) {
        try {
            Parent root = new FXMLLoader(HelloApplication.class.getResource(page)).load();
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setOnCloseRequest(winEvent -> new Alert(Alert.AlertType.CONFIRMATION, "Exit " + pageTitle + "?")
                    .showAndWait()
                    .ifPresent(present -> {
                        if (present == ButtonType.OK) window.close();
                        else winEvent.consume();
                    })
            );
            setWindow(window, root, pageTitle);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void setWindow(Stage stage, Parent root, String stageTitle) {
        Scene scene = new Scene(root, 1100, 620);
        stage.setScene(scene);

        double centerX = (Screen.getPrimary().getVisualBounds().getWidth() - stage.getWidth()) / 2;
        double centerY = (Screen.getPrimary().getVisualBounds().getHeight() - stage.getHeight()) / 2;

        // Set the stage position to center it on the screen
        stage.setX(centerX);
        stage.setY(centerY);
        stage.setTitle(stageTitle);
        stage.setResizable(false);
        stage.show();
    }
}
