package com.example.testdepersonalidad;

public class Personaje {
    private String nombre;
    private int valor;
    private int idPersonaje;
    private Atributo atributo;

    public Personaje(String nombre, int valor, int idPersonaje, Atributo atributo) {
        this.nombre = nombre;
        this.valor = valor;
        this.idPersonaje = idPersonaje;
        this.atributo = atributo;
    }

    public Personaje() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(int idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public Atributo getAtributo() {
        return atributo;
    }

    public void setAtributo(Atributo atributo) {
        this.atributo = atributo;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", valor=" + valor +
                ", idPersonaje=" + idPersonaje +
                ", atributo=" + atributo +
                '}';
    }
}

