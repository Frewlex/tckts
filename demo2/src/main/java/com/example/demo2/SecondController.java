package com.example.demo2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.TextField;

public class SecondController implements Initializable {

    @FXML
    private Rectangle FirstChat1;

    @FXML
    private Rectangle FirstChat11;

    @FXML
    private Rectangle FirstChat111;

    @FXML
    private Rectangle FirstChat1111;

    @FXML
    private Rectangle FirstChat11111;

    @FXML
    private Rectangle FirstChat111111;

    @FXML
    private Rectangle FirstChat1111111;

    @FXML
    private Rectangle FirstChat11111111;

    @FXML
    private Rectangle FirstChat111111111;

    @FXML
    private Rectangle FirstChat1111111111;

    @FXML
    private AnchorPane Frame;

    @FXML
    private AnchorPane buttonBracket;

    @FXML
    private Button chatsButton;

    @FXML
    private Button searchButton;

    @FXML
    private TextField searchTicketR;

    @FXML
    private Button ticketButton;

    @FXML
    private TextField findNameSecond;

    @FXML
    private Text firstChatName;
    @FXML
    private Text firstChatName1;
    @FXML
    private Text firstChatName11;
    @FXML
    private Text firstChatName111;
    @FXML
    private Text firstChatName1111;

    @FXML
    private Button findBtn2;

    @FXML
    private Circle crc;

    @FXML
    private Circle crc1;

    @FXML
    private Circle crc11;

    @FXML
    private Circle crc111;

    @FXML
    private Circle crc1111;

    @FXML
    private ImageView avt;

    @FXML
    private ImageView avt1;

    @FXML
    private ImageView avt11;

    @FXML
    private ImageView avt111;

    @FXML
    private ImageView avt1111;

    @FXML
    void initialize()
    {
    }

    @FXML
    void ticketButtonActionSecond(){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("1.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();

        ticketButton.getScene().getWindow().hide();
    }

    @FXML
    void firstChatBtnAction(){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CHAT.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        FirstChat11.getScene().getWindow().hide();
    }
    @FXML
    void secondChatBtnAction(){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CHAT2.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        FirstChat11.getScene().getWindow().hide();
    }
    @FXML
    void thirdChatBtnAction(){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CHAT3.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        FirstChat11.getScene().getWindow().hide();
    }
    @FXML
    void fourthChatBtnAction(){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CHAT4.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        FirstChat11.getScene().getWindow().hide();
    }
    @FXML
    void fifthChatBtnAction(){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CHAT5.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        FirstChat11.getScene().getWindow().hide();
    }

    @FXML
    public void findBtn2Action(){
        findBtn2.setOnAction(ActionEvent ->
        {
            String input1 = findNameSecond.getText();
            if(input1=="")
            {
                if(firstChatName.getText()!="")
                {
                    FirstChat11.setVisible(true);
                    avt.setVisible(true);
                    crc.setVisible(true);
                    firstChatName.setVisible(true);
                }
                else
                {
                    FirstChat11.setVisible(false);
                    avt.setVisible(false);
                    crc.setVisible(false);
                    firstChatName.setVisible(false);
                }
                if(firstChatName1.getText()!="")
                {
                    FirstChat111.setVisible(true);
                    avt1.setVisible(true);
                    crc1.setVisible(true);
                    firstChatName1.setVisible(true);
                }
                else
                {
                    FirstChat111.setVisible(false);
                    avt1.setVisible(false);
                    crc1.setVisible(false);
                    firstChatName1.setVisible(false);
                }
                if(firstChatName11.getText()!="")
                {
                    FirstChat1111.setVisible(true);
                    avt11.setVisible(true);
                    crc11.setVisible(true);
                    firstChatName11.setVisible(true);
                }
                else
                {
                    FirstChat1111.setVisible(false);
                    avt11.setVisible(false);
                    crc11.setVisible(false);
                    firstChatName11.setVisible(false);
                }
                if(firstChatName111.getText()!="")
                {
                    FirstChat11111.setVisible(true);
                    avt111.setVisible(true);
                    crc111.setVisible(true);
                    firstChatName111.setVisible(true);
                }
                else
                {
                    FirstChat11111.setVisible(false);
                    avt111.setVisible(false);
                    crc111.setVisible(false);
                    firstChatName111.setVisible(false);
                }
                if(firstChatName1111.getText()!="")
                {
                    FirstChat111111.setVisible(true);
                    avt1111.setVisible(true);
                    crc1111.setVisible(true);
                    firstChatName1111.setVisible(true);
                }
                else
                {
                    FirstChat111111.setVisible(false);
                    avt1111.setVisible(false);
                    crc1111.setVisible(false);
                    firstChatName1111.setVisible(false);
                }
            }
            else if(input1!="")
            {
                if(input1.equalsIgnoreCase(firstChatName.getText()))
                {
                    FirstChat11.setVisible(true);
                    avt.setVisible(true);
                    crc.setVisible(true);
                    firstChatName.setVisible(true);
                    FirstChat111.setVisible(false);
                    avt1.setVisible(false);
                    crc1.setVisible(false);
                    firstChatName1.setVisible(false);
                    FirstChat1111.setVisible(false);
                    avt11.setVisible(false);
                    crc11.setVisible(false);
                    firstChatName11.setVisible(false);
                    FirstChat11111.setVisible(false);
                    avt111.setVisible(false);
                    crc111.setVisible(false);
                    firstChatName111.setVisible(false);
                    FirstChat111111.setVisible(false);
                    avt1111.setVisible(false);
                    crc1111.setVisible(false);
                    firstChatName1111.setVisible(false);
                }
                else if(input1.equalsIgnoreCase(firstChatName1.getText()))
                {
                    FirstChat111.setVisible(true);
                    avt1.setVisible(true);
                    crc1.setVisible(true);
                    firstChatName1.setVisible(true);
                    FirstChat11.setVisible(false);
                    avt.setVisible(false);
                    crc.setVisible(false);
                    firstChatName.setVisible(false);
                    FirstChat1111.setVisible(false);
                    avt11.setVisible(false);
                    crc11.setVisible(false);
                    firstChatName11.setVisible(false);
                    FirstChat11111.setVisible(false);
                    avt111.setVisible(false);
                    crc111.setVisible(false);
                    firstChatName111.setVisible(false);
                    FirstChat111111.setVisible(false);
                    avt1111.setVisible(false);
                    crc1111.setVisible(false);
                    firstChatName1111.setVisible(false);
                }
                else if(input1.equalsIgnoreCase(firstChatName11.getText()))
                {
                    FirstChat1111.setVisible(true);
                    avt11.setVisible(true);
                    crc11.setVisible(true);
                    firstChatName11.setVisible(true);
                    FirstChat11.setVisible(false);
                    avt.setVisible(false);
                    crc.setVisible(false);
                    firstChatName.setVisible(false);
                    FirstChat111.setVisible(false);
                    avt1.setVisible(false);
                    crc1.setVisible(false);
                    firstChatName1.setVisible(false);
                    FirstChat11111.setVisible(false);
                    avt111.setVisible(false);
                    crc111.setVisible(false);
                    firstChatName111.setVisible(false);
                    FirstChat111111.setVisible(false);
                    avt1111.setVisible(false);
                    crc1111.setVisible(false);
                    firstChatName1111.setVisible(false);
                }
                else if(input1.equalsIgnoreCase(firstChatName111.getText()))
                {
                    FirstChat11111.setVisible(true);
                    avt111.setVisible(true);
                    crc111.setVisible(true);
                    firstChatName.setVisible(true);
                    FirstChat1111.setVisible(false);
                    avt11.setVisible(false);
                    crc11.setVisible(false);
                    firstChatName11.setVisible(false);
                    FirstChat11.setVisible(false);
                    avt.setVisible(false);
                    crc.setVisible(false);
                    firstChatName.setVisible(false);
                    FirstChat111.setVisible(false);
                    avt1.setVisible(false);
                    crc1.setVisible(false);
                    firstChatName1.setVisible(false);
                    FirstChat111111.setVisible(false);
                    avt1111.setVisible(false);
                    crc1111.setVisible(false);
                    firstChatName1111.setVisible(false);
                }
                else if(input1.equalsIgnoreCase(firstChatName1111.getText()))
                {
                    FirstChat11111.setVisible(false);
                    firstChatName111.setVisible(false);
                    avt111.setVisible(false);
                    crc111.setVisible(false);
                    FirstChat1111.setVisible(false);
                    firstChatName11.setVisible(false);
                    avt11.setVisible(false);
                    crc11.setVisible(false);
                    FirstChat11.setVisible(false);
                    firstChatName1.setVisible(false);
                    avt.setVisible(false);
                    crc.setVisible(false);
                    FirstChat111.setVisible(false);
                    firstChatName.setVisible(false);
                    avt1.setVisible(false);
                    crc1.setVisible(false);
                    FirstChat111111.setVisible(true);
                    firstChatName1111.setVisible(true);
                    avt1111.setVisible(true);
                    crc1111.setVisible(true);
                }
                else
                {
                    FirstChat11111.setVisible(true);
                    avt111.setVisible(true);
                    crc111.setVisible(true);
                    firstChatName111.setVisible(true);
                    FirstChat1111.setVisible(true);
                    avt11.setVisible(true);
                    crc11.setVisible(true);
                    firstChatName11.setVisible(true);
                    FirstChat11.setVisible(true);
                    avt.setVisible(true);
                    crc.setVisible(true);
                    firstChatName.setVisible(true);
                    FirstChat111.setVisible(true);
                    avt1.setVisible(true);
                    crc1.setVisible(true);
                    firstChatName1.setVisible(true);
                    FirstChat111111.setVisible(true);
                    avt1111.setVisible(true);
                    crc1111.setVisible(true);
                    firstChatName1111.setVisible(true);
                }
            }
        });

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {

    }
}
