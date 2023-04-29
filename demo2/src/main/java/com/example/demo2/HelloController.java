package com.example.demo2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.control.ChoiceBox;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;



public class HelloController implements Initializable {

    @FXML
    private AnchorPane Frame;

    @FXML
    private Button allButton;

    @FXML
    private Text allText;

    @FXML
    private ImageView avatarImage;

    @FXML
    private AnchorPane buttonBracket;

    @FXML
    public Button chatsButton;

    @FXML
    private ChoiceBox<String> choiceBox1;

    @FXML
    private ChoiceBox<String> choiceBox11;

    @FXML
    private ChoiceBox<String> choiceBox111;

    @FXML
    private ChoiceBox<String> choiceBox12;

    @FXML
    private Button newButton1;

    @FXML
    private Text newText;

    @FXML
    private Button newTicket;

    @FXML
    private Button searchButton;

    @FXML
    private TextField searchTicketR;

    @FXML
    private Button ticketButton;

    @FXML
    private Text ticketDate;

    @FXML
    private AnchorPane ticketField;

    @FXML
    private Text ticketStatus;

    @FXML
    private Text ticketTheme;

    @FXML
    private Text ticketUser;

    @FXML
    private AnchorPane upperBracket1;

    @FXML
    public AnchorPane ticketField1;

    @FXML
    public Text ticketDate1;

    @FXML
    public Text ticketStatus1;

    @FXML
    public Text ticketTheme1;

    @FXML
    public Text ticketUser1;

    @FXML
    public AnchorPane ticketField11;

    @FXML
    public Text ticketDate11;

    @FXML
    public Text ticketStatus11;

    @FXML
    public Text ticketTheme11;

    @FXML
    public Text ticketUser11;

    @FXML
    public AnchorPane ticketField111;

    @FXML
    public Text ticketDate111;

    @FXML
    public Text ticketStatus111;

    @FXML
    public Text ticketTheme111;

    @FXML
    public Text ticketUser111;

    @FXML
    public AnchorPane ticketField1111;

    @FXML
    public Text ticketDate1111;

    @FXML
    public Text ticketStatus1111;

    @FXML
    public Text ticketTheme1111;

    @FXML
    public Text ticketUser1111;

    @FXML
    public Text ticketPrior;
    @FXML
    public Text ticketPrior1;
    @FXML
    public Text ticketPrior11;
    @FXML
    public Text ticketPrior111;
    @FXML
    public Text ticketPrior1111;

    @FXML
    public Text ticketTags;
    @FXML
    public Text ticketTags1;
    @FXML
    public Text ticketTags11;
    @FXML
    public Text ticketTags111;
    @FXML
    public Text ticketTags1111;

    @FXML
    private Button clientBtn;

    public static String name;
    public static String theme;
    public static String date;
    public static String tags;
    public static String prior;

    @FXML
    private Button makeButton;

    @FXML
    private Button makeButton1;

    @FXML
    private ChoiceBox<String> makeChoicePrior;

    @FXML
    private ChoiceBox<String> makeChoicePrior1;

    @FXML
    private ChoiceBox<String> makeChoicePrior11;

    @FXML
    private TextField makeDate;

    @FXML
    private TextField makeDate1;

    @FXML
    private TextField makeName;

    @FXML
    private TextField makeName1;

    @FXML
    private TextField makeTags;

    @FXML
    private TextField makeTags1;

    @FXML
    private TextField makeTheme;

    @FXML
    private TextField makeTheme1;

    @FXML
    private AnchorPane clientPnl;

    @FXML
    public void makingTicket() {
        prior = String.valueOf(makeChoicePrior1.getValue());
        if(ticketUser1.getText()=="")
        {
            name = makeName.getText().trim();
            theme = makeTheme.getText().trim();
            date = makeDate.getText().trim();
            tags = makeTags.getText().trim();

            if(name.equalsIgnoreCase("") || theme.equalsIgnoreCase("") || date.equalsIgnoreCase("") || tags.equalsIgnoreCase("") || prior.equalsIgnoreCase("-") || prior.equalsIgnoreCase(""))
            {
            }
            else
            {
                ticketTheme1.setText(theme);
                ticketDate1.setText(date);
                ticketStatus1.setText("Открыто");
                ticketUser1.setText(name);
                ticketTags1.setText(tags);
                ticketPrior1.setText(prior);
                if(name.equalsIgnoreCase(ticketUser.getText()))
                {
                }
                else
                {
                    choiceBox111.getItems().add(ticketUser1.getText());
                }
                if(tags.equalsIgnoreCase(ticketTags.getText()))
                {
                }
                else
                {
                    choiceBox12.getItems().add(ticketTags1.getText());
                }
                if(date.equalsIgnoreCase(ticketDate.getText()))
                {
                }
                else
                {
                    choiceBox1.getItems().add(ticketDate1.getText());
                }
                ticketField1.setVisible(true);
                ticketUser1.setVisible(true);
                ticketTheme1.setVisible(true);
                ticketDate1.setVisible(true);
                ticketStatus1.setVisible(true);

                String allTxt = allText.getText();
                int a = Integer.valueOf(allTxt);
                allText.setText(String.valueOf(a + 1));
                String newTxt = newText.getText();
                int b = Integer.valueOf(newTxt);
                newText.setText(String.valueOf(b + 1));
                makeDate.setText("");
                makeName.setText("");
                makeTheme.setText("");
                makeTags.setText("");
                makeChoicePrior1.setValue("-");
            }
        }
        else if(ticketUser11.getText()=="") {
            name = makeName.getText().trim();
            theme = makeTheme.getText().trim();
            date = makeDate.getText().trim();
            tags = makeTags.getText().trim();

            if(name.equalsIgnoreCase("") || theme.equalsIgnoreCase("") || date.equalsIgnoreCase("") || tags.equalsIgnoreCase("") || prior.equalsIgnoreCase("-") || prior.equalsIgnoreCase(""))
            {
            }
            else
            {
                ticketTheme11.setText(theme);
                ticketDate11.setText(date);
                ticketStatus11.setText("Открыто");
                ticketUser11.setText(name);
                ticketTags11.setText(tags);
                ticketPrior11.setText(prior);
                if(name.equalsIgnoreCase(ticketUser.getText()) || name.equalsIgnoreCase(ticketUser1.getText()))
                {
                }
                else
                {
                    choiceBox111.getItems().add(ticketUser11.getText());
                }
                if(tags.equalsIgnoreCase(ticketTags.getText()) || tags.equalsIgnoreCase(ticketTags1.getText()))
                {
                }
                else
                {
                    choiceBox12.getItems().add(ticketTags11.getText());
                }
                if(date.equalsIgnoreCase(ticketDate.getText()) || date.equalsIgnoreCase(ticketDate1.getText()))
                {
                }
                else
                {
                    choiceBox1.getItems().add(ticketDate11.getText());
                }
                ticketField11.setVisible(true);
                ticketUser11.setVisible(true);
                ticketTheme11.setVisible(true);
                ticketDate11.setVisible(true);
                ticketStatus11.setVisible(true);

                String allTxt = allText.getText();
                int a = Integer.valueOf(allTxt);
                allText.setText(String.valueOf(a + 1));
                String newTxt = newText.getText();
                int b = Integer.valueOf(newTxt);
                newText.setText(String.valueOf(b + 1));
                makeDate.setText("");
                makeName.setText("");
                makeTheme.setText("");
                makeTags.setText("");
                makeChoicePrior1.setValue("-");
            }
        }
        else if(ticketUser111.getText()=="") {
            name = makeName.getText().trim();
            theme = makeTheme.getText().trim();
            date = makeDate.getText().trim();
            tags = makeTags.getText().trim();

            if(name.equalsIgnoreCase("") || theme.equalsIgnoreCase("") || date.equalsIgnoreCase("") || tags.equalsIgnoreCase("") || prior.equalsIgnoreCase("-") || prior.equalsIgnoreCase(""))
            {
            }
            else
            {
                ticketTheme111.setText(theme);
                ticketDate111.setText(date);
                ticketStatus111.setText("Открыто");
                ticketUser111.setText(name);
                ticketTags111.setText(tags);
                ticketPrior111.setText(prior);
                if(name.equalsIgnoreCase(ticketUser.getText()) || name.equalsIgnoreCase(ticketUser1.getText()) || name.equalsIgnoreCase(ticketUser11.getText()))
                {
                }
                else
                {
                    choiceBox111.getItems().add(ticketUser111.getText());
                }
                if(tags.equalsIgnoreCase(ticketTags.getText()) || tags.equalsIgnoreCase(ticketTags1.getText()) || tags.equalsIgnoreCase(ticketTags11.getText()))
                {
                }
                else
                {
                    choiceBox12.getItems().add(ticketTags111.getText());
                }
                if(date.equalsIgnoreCase(ticketDate.getText()) || date.equalsIgnoreCase(ticketDate1.getText()) || date.equalsIgnoreCase(ticketDate11.getText()))
                {
                }
                else
                {
                    choiceBox1.getItems().add(ticketDate111.getText());
                }
                ticketField111.setVisible(true);
                ticketUser111.setVisible(true);
                ticketTheme111.setVisible(true);
                ticketDate111.setVisible(true);
                ticketStatus111.setVisible(true);

                String allTxt = allText.getText();
                int a = Integer.valueOf(allTxt);
                allText.setText(String.valueOf(a + 1));
                String newTxt = newText.getText();
                int b = Integer.valueOf(newTxt);
                newText.setText(String.valueOf(b + 1));
                makeDate.setText("");
                makeName.setText("");
                makeTheme.setText("");
                makeTags.setText("");
                makeChoicePrior1.setValue("-");
            }
        }
        else if(ticketUser1111.getText()=="") {
            name = makeName.getText().trim();
            theme = makeTheme.getText().trim();
            date = makeDate.getText().trim();
            tags = makeTags.getText().trim();

            if(name.equalsIgnoreCase("") || theme.equalsIgnoreCase("") || date.equalsIgnoreCase("") || tags.equalsIgnoreCase("") || prior.equalsIgnoreCase("-") || prior.equalsIgnoreCase(""))
            {
            }
            else
            {
                ticketTheme1111.setText(theme);
                ticketDate1111.setText(date);
                ticketStatus1111.setText("Открыто");
                ticketUser1111.setText(name);
                ticketTags1111.setText(tags);
                ticketPrior1111.setText(prior);
                if(name.equalsIgnoreCase(ticketUser.getText()) || name.equalsIgnoreCase(ticketUser1.getText()) || name.equalsIgnoreCase(ticketUser11.getText()) || name.equalsIgnoreCase(ticketUser111.getText()))
                {
                }
                else
                {
                    choiceBox111.getItems().add(ticketUser1111.getText());
                }
                if(tags.equalsIgnoreCase(ticketTags.getText()) || tags.equalsIgnoreCase(ticketTags1.getText()) || tags.equalsIgnoreCase(ticketTags11.getText()) || tags.equalsIgnoreCase(ticketTags111.getText()))
                {
                }
                else
                {
                    choiceBox12.getItems().add(ticketTags1111.getText());
                }
                if(date.equalsIgnoreCase(ticketDate.getText()) || date.equalsIgnoreCase(ticketDate1.getText()) || date.equalsIgnoreCase(ticketDate11.getText()) || date.equalsIgnoreCase(ticketDate111.getText()))
                {
                }
                else
                {
                    choiceBox1.getItems().add(ticketDate1111.getText());
                }
                ticketField1111.setVisible(true);
                ticketUser1111.setVisible(true);
                ticketTheme1111.setVisible(true);
                ticketDate1111.setVisible(true);
                ticketStatus1111.setVisible(true);

                String allTxt = allText.getText();
                int a = Integer.valueOf(allTxt);
                allText.setText(String.valueOf(a + 1));
                String newTxt = newText.getText();
                int b = Integer.valueOf(newTxt);
                newText.setText(String.valueOf(b + 1));
                makeDate.setText("");
                makeName.setText("");
                makeTheme.setText("");
                makeTags.setText("");
                makeChoicePrior1.setValue("-");
            }
        }
        else {

        }

    }

    @FXML
    public void makingTicketClient() {
        prior = String.valueOf(makeChoicePrior11.getValue());
        if(ticketUser1.getText()=="")
        {
            name = makeName1.getText().trim();
            theme = makeTheme1.getText().trim();
            date = makeDate1.getText().trim();
            tags = makeTags1.getText().trim();

            if(name.equalsIgnoreCase("") || theme.equalsIgnoreCase("") || date.equalsIgnoreCase("") || tags.equalsIgnoreCase("") || prior.equalsIgnoreCase("-") || prior.equalsIgnoreCase(""))
            {
            }
            else
            {
                ticketTheme1.setText(theme);
                ticketDate1.setText(date);
                ticketStatus1.setText("Открыто");
                ticketUser1.setText(name);
                ticketTags1.setText(tags);
                ticketPrior1.setText(prior);
                if(name.equalsIgnoreCase(ticketUser.getText()))
                {
                }
                else
                {
                    choiceBox111.getItems().add(ticketUser1.getText());
                }
                if(tags.equalsIgnoreCase(ticketTags.getText()))
                {
                }
                else
                {
                    choiceBox12.getItems().add(ticketTags1.getText());
                }
                if(date.equalsIgnoreCase(ticketDate.getText()))
                {
                }
                else
                {
                    choiceBox1.getItems().add(ticketDate1.getText());
                }
                ticketField1.setVisible(true);
                ticketUser1.setVisible(true);
                ticketTheme1.setVisible(true);
                ticketDate1.setVisible(true);
                ticketStatus1.setVisible(true);

                String allTxt = allText.getText();
                int a = Integer.valueOf(allTxt);
                allText.setText(String.valueOf(a + 1));
                String newTxt = newText.getText();
                int b = Integer.valueOf(newTxt);
                newText.setText(String.valueOf(b + 1));
                makeDate.setText("");
                makeName.setText("");
                makeTheme.setText("");
                makeTags.setText("");
                makeChoicePrior1.setValue("-");
            }
        }
        else if(ticketUser11.getText()=="") {
            name = makeName.getText().trim();
            theme = makeTheme.getText().trim();
            date = makeDate.getText().trim();
            tags = makeTags.getText().trim();

            if(name.equalsIgnoreCase("") || theme.equalsIgnoreCase("") || date.equalsIgnoreCase("") || tags.equalsIgnoreCase("") || prior.equalsIgnoreCase("-") || prior.equalsIgnoreCase(""))
            {
            }
            else
            {
                ticketTheme11.setText(theme);
                ticketDate11.setText(date);
                ticketStatus11.setText("Открыто");
                ticketUser11.setText(name);
                ticketTags11.setText(tags);
                ticketPrior11.setText(prior);
                if(name.equalsIgnoreCase(ticketUser.getText()) || name.equalsIgnoreCase(ticketUser1.getText()))
                {
                }
                else
                {
                    choiceBox111.getItems().add(ticketUser11.getText());
                }
                if(tags.equalsIgnoreCase(ticketTags.getText()) || tags.equalsIgnoreCase(ticketTags1.getText()))
                {
                }
                else
                {
                    choiceBox12.getItems().add(ticketTags11.getText());
                }
                if(date.equalsIgnoreCase(ticketDate.getText()) || date.equalsIgnoreCase(ticketDate1.getText()))
                {
                }
                else
                {
                    choiceBox1.getItems().add(ticketDate11.getText());
                }
                ticketField11.setVisible(true);
                ticketUser11.setVisible(true);
                ticketTheme11.setVisible(true);
                ticketDate11.setVisible(true);
                ticketStatus11.setVisible(true);

                String allTxt = allText.getText();
                int a = Integer.valueOf(allTxt);
                allText.setText(String.valueOf(a + 1));
                String newTxt = newText.getText();
                int b = Integer.valueOf(newTxt);
                newText.setText(String.valueOf(b + 1));
                makeDate.setText("");
                makeName.setText("");
                makeTheme.setText("");
                makeTags.setText("");
                makeChoicePrior1.setValue("-");
            }
        }
        else if(ticketUser111.getText()=="") {
            name = makeName.getText().trim();
            theme = makeTheme.getText().trim();
            date = makeDate.getText().trim();
            tags = makeTags.getText().trim();

            if(name.equalsIgnoreCase("") || theme.equalsIgnoreCase("") || date.equalsIgnoreCase("") || tags.equalsIgnoreCase("") || prior.equalsIgnoreCase("-") || prior.equalsIgnoreCase(""))
            {
            }
            else
            {
                ticketTheme111.setText(theme);
                ticketDate111.setText(date);
                ticketStatus111.setText("Открыто");
                ticketUser111.setText(name);
                ticketTags111.setText(tags);
                ticketPrior111.setText(prior);
                if(name.equalsIgnoreCase(ticketUser.getText()) || name.equalsIgnoreCase(ticketUser1.getText()) || name.equalsIgnoreCase(ticketUser11.getText()))
                {
                }
                else
                {
                    choiceBox111.getItems().add(ticketUser111.getText());
                }
                if(tags.equalsIgnoreCase(ticketTags.getText()) || tags.equalsIgnoreCase(ticketTags1.getText()) || tags.equalsIgnoreCase(ticketTags11.getText()))
                {
                }
                else
                {
                    choiceBox12.getItems().add(ticketTags111.getText());
                }
                if(date.equalsIgnoreCase(ticketDate.getText()) || date.equalsIgnoreCase(ticketDate1.getText()) || date.equalsIgnoreCase(ticketDate11.getText()))
                {
                }
                else
                {
                    choiceBox1.getItems().add(ticketDate111.getText());
                }
                ticketField111.setVisible(true);
                ticketUser111.setVisible(true);
                ticketTheme111.setVisible(true);
                ticketDate111.setVisible(true);
                ticketStatus111.setVisible(true);

                String allTxt = allText.getText();
                int a = Integer.valueOf(allTxt);
                allText.setText(String.valueOf(a + 1));
                String newTxt = newText.getText();
                int b = Integer.valueOf(newTxt);
                newText.setText(String.valueOf(b + 1));
                makeDate.setText("");
                makeName.setText("");
                makeTheme.setText("");
                makeTags.setText("");
                makeChoicePrior1.setValue("-");
            }
        }
        else if(ticketUser1111.getText()=="") {
            name = makeName.getText().trim();
            theme = makeTheme.getText().trim();
            date = makeDate.getText().trim();
            tags = makeTags.getText().trim();

            if(name.equalsIgnoreCase("") || theme.equalsIgnoreCase("") || date.equalsIgnoreCase("") || tags.equalsIgnoreCase("") || prior.equalsIgnoreCase("-") || prior.equalsIgnoreCase(""))
            {
            }
            else
            {
                ticketTheme1111.setText(theme);
                ticketDate1111.setText(date);
                ticketStatus1111.setText("Открыто");
                ticketUser1111.setText(name);
                ticketTags1111.setText(tags);
                ticketPrior1111.setText(prior);
                if(name.equalsIgnoreCase(ticketUser.getText()) || name.equalsIgnoreCase(ticketUser1.getText()) || name.equalsIgnoreCase(ticketUser11.getText()) || name.equalsIgnoreCase(ticketUser111.getText()))
                {
                }
                else
                {
                    choiceBox111.getItems().add(ticketUser1111.getText());
                }
                if(tags.equalsIgnoreCase(ticketTags.getText()) || tags.equalsIgnoreCase(ticketTags1.getText()) || tags.equalsIgnoreCase(ticketTags11.getText()) || tags.equalsIgnoreCase(ticketTags111.getText()))
                {
                }
                else
                {
                    choiceBox12.getItems().add(ticketTags1111.getText());
                }
                if(date.equalsIgnoreCase(ticketDate.getText()) || date.equalsIgnoreCase(ticketDate1.getText()) || date.equalsIgnoreCase(ticketDate11.getText()) || date.equalsIgnoreCase(ticketDate111.getText()))
                {
                }
                else
                {
                    choiceBox1.getItems().add(ticketDate1111.getText());
                }
                ticketField1111.setVisible(true);
                ticketUser1111.setVisible(true);
                ticketTheme1111.setVisible(true);
                ticketDate1111.setVisible(true);
                ticketStatus1111.setVisible(true);

                String allTxt = allText.getText();
                int a = Integer.valueOf(allTxt);
                allText.setText(String.valueOf(a + 1));
                String newTxt = newText.getText();
                int b = Integer.valueOf(newTxt);
                newText.setText(String.valueOf(b + 1));
                makeDate.setText("");
                makeName.setText("");
                makeTheme.setText("");
                makeTags.setText("");
                makeChoicePrior1.setValue("-");
            }
        }
        else {

        }
        clientPnl.setVisible(false);
    }

    @FXML
    public void searchTheme(){
        searchButton.setOnAction(ActionEvent ->
        {
            String input1 = searchTicketR.getText();
            if(input1.equalsIgnoreCase(""))
            {
                ticketField.setVisible(true);
                if(ticketUser1.getText()!="")
                {
                    ticketField1.setVisible(true);
                }
                else
                {
                    ticketField1.setVisible(false);
                }
                if(ticketUser11.getText()!="")
                {
                    ticketField11.setVisible(true);
                }
                else
                {
                    ticketField11.setVisible(false);
                }
                if(ticketUser111.getText()!="")
                {
                    ticketField111.setVisible(true);
                }
                else
                {
                    ticketField111.setVisible(false);
                }
                if(ticketUser1111.getText()!="")
                {
                    ticketField1111.setVisible(true);
                }
                else
                {
                    ticketField1111.setVisible(false);
                }
            }
            else if(input1!="")
            {
                if(input1.equalsIgnoreCase(ticketTheme.getText()))
                {
                    ticketField.setVisible(true);
                    ticketField1.setVisible(false);
                    ticketField11.setVisible(false);
                    ticketField111.setVisible(false);
                    ticketField1111.setVisible(false);
                }
                else if(input1.equalsIgnoreCase(ticketTheme1.getText()))
                {
                    ticketField1.setVisible(true);
                    ticketField.setVisible(false);
                    ticketField11.setVisible(false);
                    ticketField111.setVisible(false);
                    ticketField1111.setVisible(false);
                }
                else if(input1.equalsIgnoreCase(ticketTheme11.getText()))
                {
                    ticketField11.setVisible(true);
                    ticketField1.setVisible(false);
                    ticketField.setVisible(false);
                    ticketField111.setVisible(false);
                    ticketField1111.setVisible(false);
                }
                else if(input1.equalsIgnoreCase(ticketTheme111.getText()))
                {
                    ticketField111.setVisible(true);
                    ticketField1.setVisible(false);
                    ticketField11.setVisible(false);
                    ticketField.setVisible(false);
                    ticketField1111.setVisible(false);
                }
                else if(input1.equalsIgnoreCase(ticketTheme1111.getText()))
                {
                    ticketField1111.setVisible(true);
                    ticketField1.setVisible(false);
                    ticketField11.setVisible(false);
                    ticketField111.setVisible(false);
                    ticketField.setVisible(false);
                }
                else
                {
                    ticketField1111.setVisible(false);
                    ticketField1.setVisible(false);
                    ticketField11.setVisible(false);
                    ticketField111.setVisible(false);
                    ticketField.setVisible(false);
                }
            }
        });

    }

    @FXML
    void pressedClientBtn()
    {
        clientPnl.setVisible(true);
    }

    @FXML
    void pressedTicketsBtn()
    {
        clientPnl.setVisible(false);
    }
    @FXML
    void pressedChatsButton() {
        chatsButton.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("second.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();

    }

    @FXML
    void goToFirstChat()
    {
        chatsButton.getScene().getWindow().hide();
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
    }
    @FXML
    void goToSecondChat()
    {
        chatsButton.getScene().getWindow().hide();
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
    }
    @FXML
    void goToThirdChat()
    {
        chatsButton.getScene().getWindow().hide();
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
    }
    @FXML
    void goToFourthChat()
    {
        chatsButton.getScene().getWindow().hide();
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
    }
    @FXML
    void goToFifthChat()
    {
        chatsButton.getScene().getWindow().hide();
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
    }

    public static String[] nums = {"-","1","2","3","4","5","6","7","8","9","10"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBox1.getItems().addAll("-","20.04.2023");
        choiceBox11.getItems().addAll("-","Открыто","Закрыто");
        choiceBox12.getItems().addAll("-","Система");
        choiceBox111.getItems().addAll("-","Галина");
        makeChoicePrior.getItems().addAll(nums);
        makeChoicePrior1.getItems().addAll(nums);
        makeChoicePrior11.getItems().addAll(nums);


        choiceBox1.setOnAction(actionEvent ->
        {Object selectedItem = choiceBox1.getSelectionModel().getSelectedItem();
            if(ticketUser.getText()!="") {
                if (selectedItem.toString()=="-")
                {
                    ticketField.setVisible(true);

                }
                else if(ticketDate.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField.setVisible(true);
                }
                else
                {
                    ticketField.setVisible(false);
                }
            }
            else if(ticketUser.getText()=="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField.setVisible(false);
                }
                else if(ticketDate.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField.setVisible(false);
                }
                else
                {
                    ticketField.setVisible(false);
                }
            }
            if(ticketUser1.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField1.setVisible(true);
                }
                else if(ticketDate1.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField1.setVisible(true);
                }
                else
                {
                    ticketField1.setVisible(false);
                }
            }
            else if(ticketUser1.getText()=="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField1.setVisible(false);
                }
                else if(ticketDate1.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField1.setVisible(false);
                }
                else
                {
                    ticketField1.setVisible(false);
                }
            }
            if(ticketUser11.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField11.setVisible(true);
                }
                else if(ticketDate11.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField11.setVisible(true);
                }
                else
                {
                    ticketField11.setVisible(false);
                }
            }
            else if(ticketUser11.getText()=="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField11.setVisible(false);
                }
                else if(ticketDate11.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField11.setVisible(false);
                }
                else
                {
                    ticketField11.setVisible(false);
                }
            }
            if(ticketUser111.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField111.setVisible(true);
                }
                else if(ticketDate111.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField111.setVisible(true);
                }
                else
                {
                    ticketField111.setVisible(false);
                }
            }
            else if(ticketUser111.getText()=="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField111.setVisible(false);
                }
                else if(ticketDate111.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField111.setVisible(false);
                }
                else
                {
                    ticketField111.setVisible(false);
                }
            }
            if(ticketUser1111.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField1111.setVisible(true);
                }
                else if(ticketDate1111.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField1111.setVisible(true);
                }
                else
                {
                    ticketField1111.setVisible(false);
                }
            }
            else if(ticketUser1111.getText()=="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField1111.setVisible(false);
                }
                else if(ticketDate1111.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField1111.setVisible(false);
                }
                else
                {
                    ticketField1111.setVisible(false);
                }
            }
        });
        choiceBox11.setOnAction(actionEvent ->
        {Object selectedItem = choiceBox11.getSelectionModel().getSelectedItem();
            if(ticketUser.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField.setVisible(true);
                }
                else if(ticketStatus.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField.setVisible(true);
                }
                else
                {
                    ticketField.setVisible(false);
                }
            }
            else if(ticketUser.getText()=="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField.setVisible(false);
                }
                else if(ticketStatus.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField.setVisible(false);
                }
                else
                {
                    ticketField.setVisible(false);
                }
            }
            if(ticketUser1.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField1.setVisible(true);
                }
                else if(ticketStatus1.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField1.setVisible(true);
                }
                else
                {
                    ticketField1.setVisible(false);
                }
            }
            else if(ticketUser1.getText()=="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField1.setVisible(false);
                }
                else if(ticketStatus1.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField1.setVisible(false);
                }
                else
                {
                    ticketField1.setVisible(false);
                }
            }
            if(ticketUser11.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField11.setVisible(true);
                }
                else if(ticketStatus11.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField11.setVisible(true);
                }
                else
                {
                    ticketField11.setVisible(false);
                }
            }
            else if(ticketUser11.getText()!="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField11.setVisible(false);
                }
                else if(ticketStatus11.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField11.setVisible(false);
                }
                else
                {
                    ticketField11.setVisible(false);
                }
            }
            if(ticketUser111.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField111.setVisible(true);
                }
                else if(ticketStatus111.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField111.setVisible(true);
                }
                else
                {
                    ticketField111.setVisible(false);
                }
            }
            else if(ticketUser111.getText()!="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField111.setVisible(false);
                }
                else if(ticketStatus111.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField111.setVisible(false);
                }
                else
                {
                    ticketField111.setVisible(false);
                }
            }
            if(ticketUser1111.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField1111.setVisible(true);
                }
                else if(ticketStatus1111.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField1111.setVisible(true);
                }
                else
                {
                    ticketField1111.setVisible(false);
                }
            }
            else if(ticketUser1111.getText()!="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField1111.setVisible(false);
                }
                else if(ticketStatus1111.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField1111.setVisible(false);
                }
                else
                {
                    ticketField1111.setVisible(false);
                }
            }
        });
        choiceBox12.setOnAction(actionEvent ->
        {Object selectedItem = choiceBox12.getSelectionModel().getSelectedItem();
            if(ticketUser.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField.setVisible(true);
                }
                else if(ticketTags.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField.setVisible(true);
                }
                else
                {
                    ticketField.setVisible(false);
                }
            }
            else if(ticketUser.getText()=="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField.setVisible(false);
                }
                else if(ticketTags.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField.setVisible(false);
                }
                else
                {
                    ticketField.setVisible(false);
                }
            }
            if(ticketUser1.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField1.setVisible(true);
                }
                else if(ticketTags1.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField1.setVisible(true);
                }
                else
                {
                    ticketField1.setVisible(false);
                }
            }
            else if(ticketUser1.getText()=="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField1.setVisible(false);
                }
                else if(ticketTags1.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField1.setVisible(false);
                }
                else
                {
                    ticketField1.setVisible(false);
                }
            }
            if(ticketUser11.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField11.setVisible(true);
                }
                else if(ticketTags11.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField11.setVisible(true);
                }
                else
                {
                    ticketField11.setVisible(false);
                }
            }
            else if(ticketUser11.getText()=="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField11.setVisible(false);
                }
                else if(ticketTags11.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField11.setVisible(false);
                }
                else
                {
                    ticketField11.setVisible(false);
                }
            }
            if(ticketUser111.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField111.setVisible(true);
                }
                else if(ticketTags111.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField111.setVisible(true);
                }
                else
                {
                    ticketField111.setVisible(false);
                }
            }
            else if(ticketUser111.getText()=="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField111.setVisible(false);
                }
                else if(ticketTags111.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField111.setVisible(false);
                }
                else
                {
                    ticketField111.setVisible(false);
                }
            }
            if(ticketUser1111.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField1111.setVisible(true);
                }
                else if(ticketTags1111.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField1111.setVisible(true);
                }
                else
                {
                    ticketField1111.setVisible(false);
                }
            }
            else if(ticketUser1111.getText()=="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField1111.setVisible(false);
                }
                else if(ticketTags1111.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField1111.setVisible(false);
                }
                else
                {
                    ticketField1111.setVisible(false);
                }
            }
        });
        choiceBox111.setOnAction(actionEvent ->
        {Object selectedItem = choiceBox111.getSelectionModel().getSelectedItem();
            if(ticketUser.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField.setVisible(true);
                }
                else if(ticketUser.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField.setVisible(true);
                }
                else
                {
                    ticketField.setVisible(false);
                }
            }
            else if(ticketUser.getText()=="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField.setVisible(false);
                }
                else if(ticketUser.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField.setVisible(false);
                }
                else
                {
                    ticketField.setVisible(false);
                }
            }
            if(ticketUser1.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField1.setVisible(true);
                }
                else if(ticketUser1.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField1.setVisible(true);
                }
                else
                {
                    ticketField1.setVisible(false);
                }
            }
            else if(ticketUser1.getText()=="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField1.setVisible(false);
                }
                else if(ticketUser1.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField1.setVisible(false);
                }
                else
                {
                    ticketField1.setVisible(false);
                }
            }
            if(ticketUser11.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField11.setVisible(true);
                }
                else if(ticketUser11.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField11.setVisible(true);
                }
                else
                {
                    ticketField11.setVisible(false);
                }
            }
            else if(ticketUser11.getText()=="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField11.setVisible(false);
                }
                else if(ticketUser11.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField11.setVisible(false);
                }
                else
                {
                    ticketField11.setVisible(false);
                }
            }
            if(ticketUser111.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField111.setVisible(true);
                }
                else if(ticketUser111.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField111.setVisible(true);
                }
                else
                {
                    ticketField111.setVisible(false);
                }
            }
            else if(ticketUser111.getText()=="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField111.setVisible(false);
                }
                else if(ticketUser111.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField111.setVisible(false);
                }
                else
                {
                    ticketField111.setVisible(false);
                }
            }
            if(ticketUser1111.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField1111.setVisible(true);
                }
                else if(ticketUser1111.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField1111.setVisible(true);
                }
                else
                {
                    ticketField1111.setVisible(false);
                }
            }
            else if(ticketUser1111.getText()=="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField1111.setVisible(false);
                }
                else if(ticketUser1111.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField1111.setVisible(false);
                }
                else
                {
                    ticketField1111.setVisible(false);
                }
            }
        });
        makeChoicePrior.setOnAction(actionEvent ->
        {Object selectedItem = makeChoicePrior.getSelectionModel().getSelectedItem();
            if(ticketUser.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField.setVisible(true);
                }
                else if(ticketPrior.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField.setVisible(true);
                }
                else
                {
                    ticketField.setVisible(false);
                }
            }
            else if(ticketUser.getText()=="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField.setVisible(false);
                }
                else if(ticketPrior.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField.setVisible(false);
                }
                else
                {
                    ticketField.setVisible(false);
                }
            }
            if(ticketUser1.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField1.setVisible(true);
                }
                else if(ticketPrior1.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField1.setVisible(true);
                }
                else
                {
                    ticketField1.setVisible(false);
                }
            }
            else if(ticketUser1.getText()=="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField1.setVisible(false);
                }
                else if(ticketPrior1.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField1.setVisible(false);
                }
                else
                {
                    ticketField1.setVisible(false);
                }
            }
            if(ticketUser11.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField11.setVisible(true);
                }
                else if(ticketPrior11.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField11.setVisible(true);
                }
                else
                {
                    ticketField11.setVisible(false);
                }
            }
            else if(ticketUser11.getText()=="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField11.setVisible(false);
                }
                else if(ticketPrior11.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField11.setVisible(false);
                }
                else
                {
                    ticketField11.setVisible(false);
                }
            }
            if(ticketUser111.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField111.setVisible(true);
                }
                else if(ticketPrior111.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField111.setVisible(true);
                }
                else
                {
                    ticketField111.setVisible(false);
                }
            }
            else if(ticketUser111.getText()=="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField111.setVisible(false);
                }
                else if(ticketPrior111.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField111.setVisible(false);
                }
                else
                {
                    ticketField111.setVisible(false);
                }
            }
            if(ticketUser1111.getText()!="") {
                if (selectedItem.toString()=="-") {
                    ticketField1111.setVisible(true);
                }
                else if(ticketPrior1111.getText().equalsIgnoreCase(selectedItem.toString()))
                {ticketField1111.setVisible(true);
                }
                else
                {
                    ticketField1111.setVisible(false);
                }
            }
            else if(ticketUser1111.getText()=="")
            {
                if (selectedItem.toString()=="-") {
                    ticketField1111.setVisible(false);
                }
                else if(ticketPrior1111.getText().equalsIgnoreCase(selectedItem.toString()))
                {
                    ticketField1111.setVisible(false);
                }
                else
                {
                    ticketField1111.setVisible(false);
                }
            }
        });
        }
    }


