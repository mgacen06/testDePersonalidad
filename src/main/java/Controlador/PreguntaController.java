package Controlador;
import Modelo.BD;
import Modelo.PreguntaInicial;

public class PreguntaController {
    public static void main(String[] args) {
        PreguntaInicial miPreguntaInicial=new PreguntaInicial();
        miPreguntaInicial=BD.montarPreguntaInicial(2);
        System.out.println(miPreguntaInicial.toString());
    }
}
