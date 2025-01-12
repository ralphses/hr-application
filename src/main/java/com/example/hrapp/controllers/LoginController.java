package com.example.hrapp.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import static com.example.hrapp.controllers.WindowRouter.route;

public class LoginController {

    @FXML
    private Button authenticateBtn;

    @FXML
    private Button createAccountBtn;

    @FXML
    private Button forgetPasscodeBtn;

    @FXML
    private PasswordField passcode;

    @FXML
    private TextField username;

    @FXML
    void authenticate(ActionEvent event) {
        route(event, "hr-dashboard.fxml", "Dashboard");

    }

    @FXML
    void createAccount(ActionEvent event) {
        route(event, "register-view.fxml", "Create Account");
    }

    @FXML
    void forgetPasscode(ActionEvent event) {

    }

}
