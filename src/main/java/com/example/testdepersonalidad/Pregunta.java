package com.example.testdepersonalidad;

public class Pregunta {
private String textoPregunta;
private int idPregunta;

    public Pregunta(String textoPregunta, int idPregunta) {
        this.textoPregunta = textoPregunta;
        this.idPregunta = idPregunta;
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

    @Override
    public String toString() {
        return "Pregunta{" +
                "textoPregunta='" + textoPregunta + '\'' +
                ", idPregunta=" + idPregunta +
                '}';
    }
}
