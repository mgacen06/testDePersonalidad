package com.example.testdepersonalidad;

import java.util.ArrayList;

public class Pregunta {
    private String textoPregunta;
    private int idPregunta;
    private ArrayList<Respuesta> respuestas=new ArrayList<Respuesta>();

    public Pregunta(String textoPregunta, int idPregunta, ArrayList<Respuesta> respuestas) {
        this.textoPregunta = textoPregunta;
        this.idPregunta = idPregunta;
        this.respuestas = respuestas;
    }

    public Pregunta() {
    }

    public String getTextoPregunta() {
        return textoPregunta;
    }

    public void setTextoPregunta(String textoPregunta) {
        this.textoPregunta = textoPregunta;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public ArrayList<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

    @Override
    public String toString() {
        return "Pregunta{" +
                "textoPregunta='" + textoPregunta + '\'' +
                ", idPregunta=" + idPregunta +
                ", respuestas=" + respuestas +
                '}';
    }
}
