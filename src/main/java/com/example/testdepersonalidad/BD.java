package com.example.testdepersonalidad;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
public class BD {
    public static PreguntaInicial montarPreguntaInicial(int id){
        Connection conexion = null;
        Statement sentenciaSQL = null;
        ResultSet rs;
        int resultado=0;
        PreguntaInicial miPreguntaInicial=new PreguntaInicial();

        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/testpersonalidad", "root", "");
            sentenciaSQL = conexion.createStatement();
            rs= sentenciaSQL.executeQuery("select * from preguntaInicial where id="+id);

            miPreguntaInicial.setIdPreguntaInicial(id);
            miPreguntaInicial.setTextoPreguntaInicial(rs.getString("pregunta"));
            resultado=rs.getInt(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return miPreguntaInicial;
    }
}
