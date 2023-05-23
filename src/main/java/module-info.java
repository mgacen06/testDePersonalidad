module com.example.testdepersonalidad {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;
    requires java.sql;


    opens com.example.testdepersonalidad to javafx.fxml;
    exports com.example.testdepersonalidad;
}