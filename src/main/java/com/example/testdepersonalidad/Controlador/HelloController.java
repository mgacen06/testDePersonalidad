package com.example.testdepersonalidad.Controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class  HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("HOLA JORGE Y MIGUEL");
    }
}