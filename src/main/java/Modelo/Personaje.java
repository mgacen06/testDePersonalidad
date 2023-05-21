package Modelo;

public class Personaje {
    private String nombre;
    private int valor;
    private int idPersonaje;

    public Personaje(String nombre, int valor, int id, int idPersonaje) {
        this.nombre = nombre;
        this.valor = valor;
        this.idPersonaje = idPersonaje;

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

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", valor=" + valor +
                ", id=" + idPersonaje +
                '}';
    }
}
