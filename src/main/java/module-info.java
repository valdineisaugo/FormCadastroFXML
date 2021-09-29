module com.example.formcadastro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.formcadastro to javafx.fxml;
    exports com.example.formcadastro;
}