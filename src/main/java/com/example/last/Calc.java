package com.example.last;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Calc {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label pLabel;

    @FXML
    private Label sLabel;

    @FXML
    void initialize() {
    }

    public void displayResults(double s, double p) {
        sLabel.setText("Площадь треугольника: " + s);
        pLabel.setText("Площадь треугольника: " + p);
    }

}
