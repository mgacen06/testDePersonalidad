package com.example.testdepersonalidad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BD {
    public static PreguntaInicial montarPreguntaInicial(int id){
        Connection conexion = null;
        Statement sentenciaSQL = null;
        ResultSet rs;
        PreguntaInicial miPreguntaInicial=new PreguntaInicial();

        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/testpersonalidad", "root", "");
            sentenciaSQL = conexion.createStatement();
            rs= sentenciaSQL.executeQuery("select * from preguntaInicial where id="+id);
            rs.next();
            miPreguntaInicial.setIdPreguntaInicial(id);
            miPreguntaInicial.setTextoPreguntaInicial(rs.getString("pregunta"));
            rs = sentenciaSQL.executeQuery("select * from respuestaInicial where idpreguntaInicial="+id);
            while (rs.next()) {
                miPreguntaInicial.getRespuestasIniciales().add(new RespuestaInicial(rs.getString("respuesta"),rs.getString("atributo"),rs.getInt("id")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return miPreguntaInicial;
    }
    public static Pregunta montarPreguntaNormal(int id,String atributo){
        Connection conexion = null;
        Statement sentenciaSQL = null;
        ResultSet rs;
        Pregunta miPreguntaNormal=new Pregunta();
        Respuesta miRespuestaNormal=new Respuesta();

        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/testpersonalidad", "root", "");
            sentenciaSQL = conexion.createStatement();
            System.out.println("select * from preguntaNormal where id='"+id+"' and atributo='"+ atributo +"'");
            rs= sentenciaSQL.executeQuery("select * from preguntaNormal where id='"+id+"' and atributo='"+ atributo +"'");
            rs.next();
            miPreguntaNormal.setIdPregunta(id);
            miPreguntaNormal.setTextoPregunta(rs.getString("pregunta"));
            rs = sentenciaSQL.executeQuery("select * from respuestaNormal where idpreguntaNormal="+id);
            while (rs.next()) {
                miRespuestaNormal.setIdRespuesta(rs.getInt("id"));
                miRespuestaNormal.setTextoRespuesta(rs.getString("respuesta"));
                miRespuestaNormal.setPuntuacion(rs.getInt("puntuacion"));

                miPreguntaNormal.getRespuestas().add(miRespuestaNormal);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return miPreguntaNormal;
    }
    public static Personaje montarPersonaje(int puntuacion, Atributo categoria){
        Connection conexion = null;
        Statement sentenciaSQL = null;
        ResultSet rs;
        Personaje miPersonaje= new Personaje();

        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/testpersonalidad", "root", "");
            sentenciaSQL = conexion.createStatement();
            rs= sentenciaSQL.executeQuery("select * from personaje where valor="+puntuacion+"and atributo="+categoria+" order by valor desc limit 1");
            rs.next();
            miPersonaje.setNombre(rs.getString("nombre"));
            miPersonaje.setAtributo(categoria);
            miPersonaje.setValor(rs.getInt("valor"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return miPersonaje;
    }
}