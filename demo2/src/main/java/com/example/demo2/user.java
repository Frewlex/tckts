package com.example.demo2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class user {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button makeButton;

    @FXML
    private ChoiceBox<?> makeChoicePrior;

    @FXML
    private TextField makeDate;

    @FXML
    private TextField makeName;

    @FXML
    private TextField makeTags;

    @FXML
    private TextField makeTheme;

    @FXML
    void handle(ActionEvent event)
    {
    }

    private void makeTick(String name, String theme, String date, String tags, String prior) {
    }

    @FXML
    void initialize() {


    }

}
