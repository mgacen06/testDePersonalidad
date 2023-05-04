module com.example.testdepersonalidad {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testdepersonalidad to javafx.fxml;
    exports com.example.testdepersonalidad;
}