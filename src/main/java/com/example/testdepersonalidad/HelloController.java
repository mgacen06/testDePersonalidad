package com.example.testdepersonalidad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    public static void main(String[] args) {
        PreguntaInicial miPregunta=new PreguntaInicial();
        miPregunta=BD.montarPreguntaInicial(1);
        System.out.println(miPregunta.toString());
        System.out.println(miPregunta.getRespuestasIniciales().get(0).getTextoRespuesta());
        System.out.println(miPregunta.getRespuestasIniciales().get(1).getTextoRespuesta());
        System.out.println(miPregunta.getRespuestasIniciales().get(2).getTextoRespuesta());

    }
}