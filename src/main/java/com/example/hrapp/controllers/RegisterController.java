package com.example.hrapp.controllers;

import com.example.hrapp.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.hrapp.controllers.WindowRouter.route;

public class RegisterController {

    @FXML
    private Button authenticateBtn;

    @FXML
    private TextField email;

    @FXML
    private TextField fullname;

    @FXML
    private PasswordField passcode;

    @FXML
    private TextField phone;

    @FXML
    private Button registerBtn;

    @FXML
    void authenticate(ActionEvent event) {
        route(event, "login-view.fxml", "Sign In");
    }

    @FXML
    void register(ActionEvent event) {

    }

}
