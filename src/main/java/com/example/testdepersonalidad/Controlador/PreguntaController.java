package com.example.testdepersonalidad.Controlador;
import com.example.testdepersonalidad.Modelo.BD;
import com.example.testdepersonalidad.Modelo.PreguntaInicial;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import org.w3c.dom.Text;

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
}
