package Modelo;
import Modelo.PreguntaInicial;

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
        RespuestaInicial miRespuestaInicial=new RespuestaInicial();

        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/testpersonalidad", "root", "");
            sentenciaSQL = conexion.createStatement();
            rs= sentenciaSQL.executeQuery("select * from preguntaInicial where id="+id);
            rs.next();
            miPreguntaInicial.setIdPreguntaInicial(id);
            miPreguntaInicial.setTextoPreguntaInicial(rs.getString("pregunta"));
            rs = sentenciaSQL.executeQuery("select * from respuestaInicial where idpreguntaInicial="+id);
            while (rs.next()) {
                miRespuestaInicial.setIdRespuesta(rs.getInt("id"));
                miRespuestaInicial.setTextoRespuesta(rs.getString("respuesta"));
                miRespuestaInicial.setCategoria(rs.getString("atributo"));

                miPreguntaInicial.getRespuestasIniciales().add(miRespuestaInicial);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return miPreguntaInicial;
    }
    public static Pregunta montarPreguntaNormal(int id){
        Connection conexion = null;
        Statement sentenciaSQL = null;
        ResultSet rs;
        Pregunta miPreguntaNormal=new Pregunta();
        Respuesta miRespuestaNormal=new Respuesta();

        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/testpersonalidad", "root", "");
            sentenciaSQL = conexion.createStatement();
            rs= sentenciaSQL.executeQuery("select * from preguntaNormal where id="+id);
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
}
