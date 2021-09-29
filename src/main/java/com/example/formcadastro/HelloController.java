package com.example.formcadastro;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    String[] siglas = {"AC", "BA", "CE", "DF", "PR", "RS", "SC", "SP", "TO" };
    @FXML
   ComboBox<String> comboUF = new ComboBox();
    @FXML
    DatePicker dataNasc;
    @FXML
    CheckBox checkMasculino, checkFeminino;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comboUF.getItems().addAll(siglas);
    }
    //Açaõ do botão salvar dados
    public void save(){
        String select = comboUF.getSelectionModel().getSelectedItem();
        System.out.println("UF selecionada: " + select);
        LocalDate date = dataNasc.getValue();
        System.out.println("Data Selecionada: " + date);
        System.out.println(checkMasculino.isSelected());
        System.out.println(checkFeminino.isSelected());
    }




}