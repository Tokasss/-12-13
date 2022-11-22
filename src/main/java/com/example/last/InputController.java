package com.example.last;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class InputController {
    @FXML
    TextField aText;
    @FXML
    TextField bText;
    @FXML
    TextField cText;
    @FXML
    CheckBox sFlag;

    @FXML
    CheckBox pFlag;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    boolean ssFlag = false;
    boolean ppFlag = false;
    @FXML
    void initialize() {

    }

    @FXML
    void okButton(ActionEvent event) throws IOException {
        String a = aText.getText();
        String b = bText.getText();
        String c = cText.getText();

        if(sFlag.isSelected()) ssFlag = true;
        else ssFlag = false;
        if(pFlag.isSelected()) ppFlag = true;
        else ppFlag = false;
        data d = new data();
        d.a = Integer.parseInt(a);
        d.b = Integer.parseInt(b);
        d.c = Integer.parseInt(c);
        d.s = ssFlag;
        d.p = ppFlag;
        HelloController h = new HelloController();
        h.getData(d);

    }
}

