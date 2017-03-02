/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author admin
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField resultado;
    @FXML
    private Button uno;
    @FXML
    private Button dos;
    @FXML
    private Button cuatro;
    @FXML
    private Button cinco;
    @FXML
    private Button siete;
    @FXML
    private Button ocho;
    @FXML
    private Button nueve;
    @FXML
    private Button multiplicar;
    @FXML
    private Button tres;
    @FXML
    private Button sumar;
    @FXML
    private Button seis;
    @FXML
    private Button restar;
    @FXML
    private Button cero;
    @FXML
    private Button igual;
    @FXML
    private Button limpiar;
    @FXML
    private Button dividir;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void eventoBoton123(ActionEvent event) {
         if(event.getSource()==uno){
            resultado.setText(resultado.getText() + "1");
        }else if(event.getSource()==dos){
            resultado.setText(resultado.getText() + "2");
        }else if(event.getSource()==tres){
            resultado.setText(resultado.getText() + "3");
        }
        
    }

    @FXML
    private void eventoBoton4(ActionEvent event) {
        if(event.getSource()==cuatro){
            resultado.setText(resultado.getText() + "4");
        }
    }

    @FXML
    private void eventoBoton5(ActionEvent event) {
        if(event.getSource()==cinco){
            resultado.setText(resultado.getText() + "5");
        }
    }

    @FXML
    private void eventoBoton7(ActionEvent event) {
        if(event.getSource()==siete){
            resultado.setText(resultado.getText() + "7");
        }
    }

    @FXML
    private void eventoBoton8(ActionEvent event) {
        if(event.getSource()==ocho){
            resultado.setText(resultado.getText() + "8");
        }
    }

    @FXML
    private void eventoBoton9(ActionEvent event) {
        if(event.getSource()==nueve){
            resultado.setText(resultado.getText() + "9");
        }
    }

    @FXML
    private void eventoBoton6(ActionEvent event) {
        if(event.getSource()==seis){
            resultado.setText(resultado.getText() + "6");
        }
    }
    
}
