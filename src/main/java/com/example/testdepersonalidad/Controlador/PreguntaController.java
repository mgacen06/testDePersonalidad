package com.example.testdepersonalidad.Controlador;

import com.example.testdepersonalidad.Modelo.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PreguntaController {

    @FXML
    private RadioButton OP1;

    @FXML
    private RadioButton OP2;

    @FXML
    private RadioButton OP3;

    @FXML
    private Text PREGUNTA;

    @FXML
    private Button SIGUIENTE;

    @FXML
    private Text contador;
    private String atributo;
    private int contadorNumero = 1;
    private int contadorId = 0;//contador de preguntas contestadas 0 a 6

    private int contadorLuz = 0;
    private int contadorOscuridad = 0;
    private int contadorNeutro = 0;
    PreguntaInicial preguntaInicial = new PreguntaInicial();
    Pregunta preguntaNormal = new Pregunta();

    public void siguientePregunta() {

        ArrayList<Integer> idsLuz = new ArrayList<>();//1-7
        ArrayList<Integer> idsOscuridad = new ArrayList<>();//8-14
        ArrayList<Integer> idsNeutro = new ArrayList<>();//15-21

        idsLuz.add(1);
        idsLuz.add(2);
        idsLuz.add(3);
        idsLuz.add(4);
        idsLuz.add(5);
        idsLuz.add(6);
        idsLuz.add(7);
        idsOscuridad.add(8);
        idsOscuridad.add(9);
        idsOscuridad.add(10);
        idsOscuridad.add(11);
        idsOscuridad.add(12);
        idsOscuridad.add(13);
        idsOscuridad.add(14);
        idsNeutro.add(15);
        idsNeutro.add(16);
        idsNeutro.add(17);
        idsNeutro.add(18);
        idsNeutro.add(19);
        idsNeutro.add(20);
        idsNeutro.add(21);
        contador.setTextContent(String.valueOf(contadorNumero));
        switch (atributo) {
            case "Luz":
                Collections.shuffle(idsLuz);
                preguntaNormal = BD.montarPreguntaNormal(idsLuz.get(contadorId), atributo);
                contadorId++;
                contadorLuz++;
                PREGUNTA.setTextContent(preguntaNormal.getTextoPregunta());

                OP1.setText(String.valueOf(preguntaNormal.getRespuestas().get(0)));
                OP2.setText(String.valueOf(preguntaNormal.getRespuestas().get(1)));
                OP3.setText(String.valueOf(preguntaNormal.getRespuestas().get(2)));
                break;
            case "Osuridad":
                Collections.shuffle(idsOscuridad);
                preguntaNormal = BD.montarPreguntaNormal(idsOscuridad.get(contadorId), atributo);
                contadorId++;
                contadorOscuridad++;
                PREGUNTA.setTextContent(preguntaNormal.getTextoPregunta());
                OP1.setText(String.valueOf(preguntaNormal.getRespuestas().get(0)));
                OP2.setText(String.valueOf(preguntaNormal.getRespuestas().get(1)));
                OP3.setText(String.valueOf(preguntaNormal.getRespuestas().get(2)));
                break;
            case "Neutral":
                Collections.shuffle(idsNeutro);
                preguntaNormal = BD.montarPreguntaNormal(idsNeutro.get(contadorId), atributo);
                contadorId++;
                contadorNeutro++;
                PREGUNTA.setTextContent(preguntaNormal.getTextoPregunta());
                OP1.setText(String.valueOf(preguntaNormal.getRespuestas().get(0)));
                OP2.setText(String.valueOf(preguntaNormal.getRespuestas().get(1)));
                OP3.setText(String.valueOf(preguntaNormal.getRespuestas().get(2)));
                break;
            default:
                preguntaInicial = BD.montarPreguntaInicial(contadorNumero);
                contadorNumero++;
                PREGUNTA.setTextContent(preguntaInicial.getTextoPreguntaInicial());
                OP1.setText(String.valueOf(preguntaInicial.getRespuestasIniciales().get(0)));
                OP2.setText(String.valueOf(preguntaInicial.getRespuestasIniciales().get(1)));
                OP3.setText(String.valueOf(preguntaInicial.getRespuestasIniciales().get(2)));
                break;
        }
        //llamar a comprobar cuando pulse siguiente

    }

    public void comprobar() {//metodo para comprobar los puntos de la respuesta seleccionada (hay que cambiar cosas)
        if (contadorId >= 4 && contadorId > 8) {
            contadorLuz = contadorLuz + preguntaNormal.getRespuestas().get(0).getPuntuacion();
        }
        if (contadorId >= 8 && contadorId < 14) {
            contadorOscuridad = contadorOscuridad + preguntaNormal.getRespuestas().get(0).getPuntuacion();
        }
        if (contadorId >= 14) {
            contadorNeutro = contadorNeutro + preguntaNormal.getRespuestas().get(0).getPuntuacion();
        }

    }

}
