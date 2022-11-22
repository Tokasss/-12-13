package com.example.last;

import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class HelloController {

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private Button calc;
    @FXML
    private Button exot;
    @FXML
    private Button input;
    public static data d;

    public int a,b,c;
    public boolean s,p;

    @FXML
    void calcButton(ActionEvent event) {
        try{
            FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("calc.fxml"));
            Parent root1 = (Parent) fxmlloader.load();



            double pp = d.a+d.b+d.c;
            double ppp = pp * 0.5;
            double ss = Math.sqrt(ppp*(ppp-d.a)*(ppp-d.b)*(ppp-d.c));
            if(!d.s) ss = 0;
            if(!d.p) pp = 0;


            Stage stage = new Stage();
            stage.setTitle("Calc window");
            stage.setScene(new Scene(root1));

            Calc calc = fxmlloader.getController();
            calc.displayResults(ss,pp);
            stage.show();
        }
        catch(Exception e) {
            System.out.println("Can`t load calc window");
        }
    }

    public void getData(data d) {
        this.d = d;
    }

    @FXML
    void exitButton(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void inputButton(ActionEvent event) {
        try{
            FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("inputData.fxml"));
            Parent root1 = (Parent) fxmlloader.load();
            Stage stage = new Stage();
            stage.setTitle("Input window");
            stage.setScene(new Scene(root1));
            stage.show();
        }
        catch(Exception e) {
            System.out.println("Can`t load input window");
        }
    }

    @FXML
    void initialize() {
        d = new data();
    }

}
