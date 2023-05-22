module com.example.testdepersonalidad {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.testdepersonalidad to javafx.fxml;
    exports com.example.testdepersonalidad;
    exports Modelo;
    opens Modelo to javafx.fxml;
    exports Vista;
    opens Vista to javafx.fxml;
    exports Controlador;
    opens Controlador to javafx.fxml;
}