package com.example.testdepersonalidad;

public class RespuestaInicial {

    private String textoRespuesta;
    private String categoria;
    private int idRespuesta;

    public RespuestaInicial(String textoRespuesta, String categoria, int idRespuesta) {
        this.textoRespuesta = textoRespuesta;
        this.categoria = categoria;
        this.idRespuesta = idRespuesta;
    }

    public RespuestaInicial() {
    }

    public String getTextoRespuesta() {
        return textoRespuesta;
    }

    public void setTextoRespuesta(String textoRespuesta) {
        this.textoRespuesta = textoRespuesta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    @Override
    public String toString() {
        return "RespuestaInicial{" +
                "textoRespuesta='" + textoRespuesta + '\'' +
                ", categoria='" + categoria + '\'' +
                ", idRespuesta=" + idRespuesta +
                '}';
    }
}
