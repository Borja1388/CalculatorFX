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
    private double num1;
    private double total;
    private String cadena = "";
    private String simbolo="";
    private int count;
    private boolean operacionApretada = false;
    int operacion = -1;
    @FXML
    private TextField operaciones;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @FXML
    private void eventoBoton123(ActionEvent event) {
        if (operacionApretada) {
            resultado.setText(" ");
        }

        if (event.getSource() == uno) {
            resultado.setText(resultado.getText() + "1");
            operacionApretada = false;

        } else if (event.getSource() == dos) {
            resultado.setText(resultado.getText() + "2");
            operacionApretada = false;

        } else if (event.getSource() == tres) {
            resultado.setText(resultado.getText() + "3");
            operacionApretada = false;

        }

    }

    @FXML
    private void eventoBoton4(ActionEvent event) {
        if (operacionApretada) {
            resultado.setText(" ");
        }
        if (event.getSource() == cuatro) {
            resultado.setText(resultado.getText() + "4");
            operacionApretada = false;
        }
    }

    @FXML
    private void eventoBoton5(ActionEvent event) {
        if (operacionApretada) {
            resultado.setText(" ");
        }
        if (event.getSource() == cinco) {
            resultado.setText(resultado.getText() + "5");
            operacionApretada = false;
        }
    }

    @FXML
    private void eventoBoton7(ActionEvent event) {
        if (operacionApretada) {
            resultado.setText(" ");
        }
        if (event.getSource() == siete) {
            resultado.setText(resultado.getText() + "7");
            operacionApretada = false;
        }
    }

    @FXML
    private void eventoBoton8(ActionEvent event) {
        if (operacionApretada) {
            resultado.setText(" ");
        }
        if (event.getSource() == ocho) {
            resultado.setText(resultado.getText() + "8");
            operacionApretada = false;

        }
    }

    @FXML
    private void eventoBoton9(ActionEvent event) {
        if (operacionApretada) {
            resultado.setText(" ");
        }
        if (event.getSource() == nueve) {
            resultado.setText(resultado.getText() + "9");
            operacionApretada = false;

        }
    }

    @FXML
    private void eventoBoton6(ActionEvent event) {
        if (operacionApretada) {
            resultado.setText(" ");
        }
        if (event.getSource() == seis) {
            resultado.setText(resultado.getText() + "6");
            operacionApretada = false;

        }
    }

    @FXML
    private void eventoBoton0(ActionEvent event) {
        if (operacionApretada) {
            resultado.setText(" ");
        }
        if (event.getSource() == cero) {
            resultado.setText(resultado.getText() + "0");
            operacionApretada = false;

        }
    }

    @FXML
    private void eventomultiplicar(ActionEvent event) {

        num1 = Double.parseDouble(resultado.getText());
        cadena = cadena + resultado.getText() + "*";
        operaciones.setText(cadena);
        simbolo = "*";
        if (simbolo.equalsIgnoreCase("+")) {
            total = total + num1;
        } else if (simbolo.equalsIgnoreCase("-")) {
            total = total - num1;
        } else if (simbolo.equalsIgnoreCase("*")) {
            total = total * num1;
        } else if (simbolo.equalsIgnoreCase("/")) {
            total = total / num1;
        }

        resultado.setText(total + "");
        operacionApretada = true;
        count++;
        

    }

    @FXML
    private void eventoSumar(ActionEvent event) {
        num1 = Double.parseDouble(resultado.getText());
        cadena = cadena + resultado.getText() + "+";
        operaciones.setText(cadena);
        simbolo = "+";
        if (simbolo.equalsIgnoreCase("+")) {
            total = total + num1;
        } else if (simbolo.equalsIgnoreCase("-")) {
            total = total - num1;
        } else if (simbolo.equalsIgnoreCase("*")) {
            total = total * num1;
        } else if (simbolo.equalsIgnoreCase("/")) {
            total = total / num1;
        }

        resultado.setText(total + "");
        operacionApretada = true;
        count++;
        

    }

    @FXML
    private void eventoRestar(ActionEvent event) {
        if (count == 0) {
            num1 = Double.parseDouble(resultado.getText());
            cadena = cadena + resultado.getText() + "-";
            operaciones.setText(cadena);
             simbolo = "-";
            if (simbolo.equalsIgnoreCase("+")) {
                total = total + num1;
            } else if (simbolo.equalsIgnoreCase("-")) {
                total = total - num1;
            } else if (simbolo.equalsIgnoreCase("*")) {
                total = total * num1;
            } else if (simbolo.equalsIgnoreCase("/")) {
                total = total / num1;
            }

            resultado.setText(total + "");
            operacionApretada = true;
        } else {
            num1 = Double.parseDouble(resultado.getText());
            cadena = cadena + resultado.getText() + "-";
            operaciones.setText(cadena);
            if (simbolo.equalsIgnoreCase("+")) {
                total = total + num1;
            } else if (simbolo.equalsIgnoreCase("-")) {
                total = total - num1;
            } else if (simbolo.equalsIgnoreCase("*")) {
                total = total * num1;
            } else if (simbolo.equalsIgnoreCase("/")) {
                total = total / num1;
            }

            resultado.setText(total + "");
            operacionApretada = true;

        }
        count++;
        
    }

    @FXML
    private void eventoDividir(ActionEvent event) {
        num1 = Double.parseDouble(resultado.getText());
        cadena = cadena + resultado.getText() + "/";
        operaciones.setText(cadena);
        simbolo = "/";
        if (simbolo.equalsIgnoreCase("+")) {
            total = total + num1;
        } else if (simbolo.equalsIgnoreCase("-")) {
            total = total - num1;
        } else if (simbolo.equalsIgnoreCase("*")) {
            total = total * num1;
        } else if (simbolo.equalsIgnoreCase("/")) {
            total = total / num1;
        }

        resultado.setText(total + "");
        operacionApretada = true;
        count++;
        

    }

    @FXML
    private void eventoBotonigual(ActionEvent event) {

        switch (operacion) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;

        }
        count = 0;

    }

    @FXML
    private void eventoLimpiar(ActionEvent event) {
        resultado.setText(" ");
        operaciones.setText(" ");
        count = 0;
        simbolo="";
    }

}
