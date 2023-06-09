package com.example.testdepersonalidad;

import java.util.ArrayList;

public class PreguntaInicial {
    private String textoPreguntaInicial;
    private int idPreguntaInicial;
    private ArrayList<RespuestaInicial> respuestasIniciales=new ArrayList<RespuestaInicial>();

    public PreguntaInicial(String textoPreguntaInicial, int idPreguntaInicial, ArrayList<RespuestaInicial> respuestasIniciales) {
        this.textoPreguntaInicial = textoPreguntaInicial;
        this.idPreguntaInicial = idPreguntaInicial;
        this.respuestasIniciales = respuestasIniciales;
    }

    public PreguntaInicial() {
    }

    public String getTextoPreguntaInicial() {
        return textoPreguntaInicial;
    }

    public void setTextoPreguntaInicial(String textoPreguntaInicial) {
        this.textoPreguntaInicial = textoPreguntaInicial;
    }

    public int getIdPreguntaInicial() {
        return idPreguntaInicial;
    }

    public void setIdPreguntaInicial(int idPreguntaInicial) {
        this.idPreguntaInicial = idPreguntaInicial;
    }

    public ArrayList<RespuestaInicial> getRespuestasIniciales() {
        return respuestasIniciales;
    }

    public void setRespuestasIniciales(ArrayList<RespuestaInicial> respuestasIniciales) {
        this.respuestasIniciales = respuestasIniciales;
    }

    @Override
    public String toString() {
        return "PreguntaInicial{" +
                "textoPreguntaInicial='" + textoPreguntaInicial + '\'' +
                ", idPreguntaInicial=" + idPreguntaInicial +
                ", respuestasIniciales=" + respuestasIniciales +
                '}';
    }
}