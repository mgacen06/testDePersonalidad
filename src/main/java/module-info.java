module com.example.testdepersonalidad {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.testdepersonalidad to javafx.fxml;
    exports com.example.testdepersonalidad;
    exports com.example.testdepersonalidad.Modelo;
    opens com.example.testdepersonalidad.Modelo to javafx.fxml;
    exports com.example.testdepersonalidad.Vista;
    opens com.example.testdepersonalidad.Vista to javafx.fxml;
    exports com.example.testdepersonalidad.Controlador;
    opens com.example.testdepersonalidad.Controlador to javafx.fxml;
}