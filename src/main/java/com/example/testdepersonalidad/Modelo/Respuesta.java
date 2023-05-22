package com.example.testdepersonalidad.Modelo;

public class Respuesta {
    private String textoRespuesta;
    private int puntuacion;
    private int idRespuesta;

    public Respuesta(String textoRespuesta, int puntuacion, int idRespuesta) {
        this.textoRespuesta = textoRespuesta;
        this.puntuacion = puntuacion;
        this.idRespuesta = idRespuesta;
    }

    public Respuesta() {
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getTextoRespuesta() {
        return textoRespuesta;
    }

    public void setTextoRespuesta(String textoRespuesta) {
        this.textoRespuesta = textoRespuesta;
    }

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    @Override
    public String toString() {
        return "Respuesta{" +
                "textoRespuesta='" + textoRespuesta + '\'' +
                ", idRespuesta=" + idRespuesta +
                '}';
    }
}
