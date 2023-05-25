package com.example.testdepersonalidad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
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
    private ImageView imgFinal;

    @FXML
    private Button reiniciar;

    @FXML
    private Text respuesta;

    @FXML
    private Button acabar;

    @FXML
    private Text contador;
    private Atributo atributo=Atributo.Otro;
    private int contadorNumero = 1;
    private int contadorId = 0;//contador de preguntas contestadas 0 a 6

    Alert alerta = new Alert(Alert.AlertType.INFORMATION);
    private int contadorLuz = 0;
    private int contadorOscuridad = 0;
    private int contadorNeutro = 0;
    private int puntuacion=0;
    PreguntaInicial preguntaInicial = new PreguntaInicial();
    Pregunta preguntaNormal = new Pregunta();

    @FXML
    void siguientePregunta(ActionEvent event) {
        contador.setText(String.valueOf(contadorNumero));
        if (contadorNumero != 12) {
            if (multipleSelec() || !OP1.isSelected() && !OP2.isSelected() && !OP3.isSelected()) {
                alerta.setContentText("Solo una opcion.");
                alerta.show();
            } else {
                if (OP1.isSelected() || OP2.isSelected() || OP3.isSelected()) {
                    OP1.setSelected(false);
                    OP2.setSelected(false);
                    OP3.setSelected(false);
                }
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
                if (contadorNumero == 5) {
                    if (contadorLuz > contadorOscuridad && contadorLuz > contadorNeutro) {
                        atributo = Atributo.Luz;
                    } else if (contadorOscuridad > contadorLuz && contadorOscuridad > contadorNeutro) {
                        atributo = Atributo.Oscuridad;
                    } else if (contadorNeutro > contadorLuz && contadorNeutro > contadorOscuridad) {
                        atributo = Atributo.Neutral;
                    } else {
                        atributo = Atributo.Otro;
                    }
                }
                switch (atributo) {
                    case Luz:
                        preguntaNormal = BD.montarPreguntaNormal(idsLuz.get(contadorId), atributo.toString());
                        contadorId++;
                        contadorLuz++;
                        contadorNumero++;
                        PREGUNTA.setText(preguntaNormal.getTextoPregunta());

                        OP1.setText(preguntaNormal.getRespuestas().get(0).getTextoRespuesta());
                        OP2.setText(preguntaNormal.getRespuestas().get(1).getTextoRespuesta());
                        OP3.setText(preguntaNormal.getRespuestas().get(2).getTextoRespuesta());
                        if (OP1.isSelected()) {
                            puntuacion = puntuacion + preguntaNormal.getRespuestas().get(0).getPuntuacion();
                        } else if (OP2.isSelected()) {
                            puntuacion = puntuacion + preguntaNormal.getRespuestas().get(1).getPuntuacion();
                        } else if (OP3.isSelected()) {
                            puntuacion = puntuacion + preguntaNormal.getRespuestas().get(2).getPuntuacion();
                        }
                        break;
                    case Oscuridad:
                        preguntaNormal = BD.montarPreguntaNormal(idsOscuridad.get(contadorId), atributo.toString());
                        contadorId++;
                        contadorOscuridad++;
                        contadorNumero++;
                        PREGUNTA.setText(preguntaNormal.getTextoPregunta());
                        OP1.setText(preguntaNormal.getRespuestas().get(0).getTextoRespuesta());
                        OP2.setText(preguntaNormal.getRespuestas().get(1).getTextoRespuesta());
                        OP3.setText(preguntaNormal.getRespuestas().get(2).getTextoRespuesta());
                        if (OP1.isSelected()) {
                            puntuacion = puntuacion + preguntaNormal.getRespuestas().get(0).getPuntuacion();
                        } else if (OP2.isSelected()) {
                            puntuacion = puntuacion + preguntaNormal.getRespuestas().get(1).getPuntuacion();
                        } else if (OP3.isSelected()) {
                            puntuacion = puntuacion + preguntaNormal.getRespuestas().get(2).getPuntuacion();
                        }
                        break;
                    case Neutral:
                        preguntaNormal = BD.montarPreguntaNormal(idsNeutro.get(contadorId), atributo.toString());
                        contadorId++;
                        contadorNeutro++;
                        contadorNumero++;
                        PREGUNTA.setText(preguntaNormal.getTextoPregunta());
                        OP1.setText(preguntaNormal.getRespuestas().get(0).getTextoRespuesta());
                        OP2.setText(preguntaNormal.getRespuestas().get(1).getTextoRespuesta());
                        OP3.setText(preguntaNormal.getRespuestas().get(2).getTextoRespuesta());
                        if (OP1.isSelected()) {
                            puntuacion = puntuacion + preguntaNormal.getRespuestas().get(0).getPuntuacion();
                        } else if (OP2.isSelected()) {
                            puntuacion = puntuacion + preguntaNormal.getRespuestas().get(1).getPuntuacion();
                        } else if (OP3.isSelected()) {
                            puntuacion = puntuacion + preguntaNormal.getRespuestas().get(2).getPuntuacion();
                        }
                        break;
                    case Otro:
                        if (OP1.isSelected()) {
                            contadorLuz++;
                        } else if (OP2.isSelected()) {
                            contadorOscuridad++;
                        } else if (OP3.isSelected()) {
                            contadorNeutro++;
                        }
                        preguntaInicial = BD.montarPreguntaInicial(contadorNumero);
                        contadorNumero++;
                        PREGUNTA.setText(preguntaInicial.getTextoPreguntaInicial());
                        OP1.setText(preguntaInicial.getRespuestasIniciales().get(0).getTextoRespuesta());
                        OP2.setText(preguntaInicial.getRespuestasIniciales().get(1).getTextoRespuesta());
                        OP3.setText(preguntaInicial.getRespuestasIniciales().get(2).getTextoRespuesta());
                }
            }
        } else {
            contador.setText(String.valueOf(11));
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

    public boolean multipleSelec() {
        int contador = 0;
        if (OP1.isSelected()) {
            contador++;
        }
        if (OP2.isSelected()) {
            contador++;
        }
        if (OP3.isSelected()) {
            contador++;
        }
        return contador > 1;
    }
    @FXML
    void irAFinal(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("final.fxml"));
        Parent root = loader.load();
        PreguntaController controlador= loader.getController();
        controlador.respuesta.setText(elegirPersonaje());
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
    @FXML
    void irAInicio(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("inicio.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
    public String elegirPersonaje(){
        Personaje miPersonaje=new Personaje();
        miPersonaje=BD.montarPersonaje(puntuacion,atributo.toString());
        return miPersonaje.getNombre();
    }

}

