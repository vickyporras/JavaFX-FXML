
package recuadroRojo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 * Componenete grafio que contiene cajas de texto (nombre,apellido y dni)
 * @author Victoria Porras Ortiz
 */
public class RecuadroRojoController implements Initializable {
   
    /**
     * Vertical box que contiene toda la interfaz grafica
     */
    @FXML
    public VBox recuadroRojo;

    /**
     * Cuadro de texto para escribir el nombre
     */
    @FXML
    public TextField nombre;

    /**
     * Cuadro de texto para escribir el apellido
     */
    @FXML
    public TextField apellido;

    /**
     * Cuadro de texto para escribir el dni
     */
    @FXML
    public TextField dni;

    /**
     * Initializes the controller class.
     * @param url 
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    /**
     * borra los datos de todas las cajas de texto 
     */
    public void borrarDatos(){
        nombre.setText("");
        apellido.setText("");
        dni.setText("");
    }
    
    /**
     * Devuelve lo escrito en la caja de texto nombre
     * @return Valor del nombre
     */
    @FXML
    public String obtenNombre() {
       //Guaradamos el texto introducido en el campo de texto y lo guardamos en la varible creada
        String n = nombre.getText();
        return n;
     
    }

     /**
     * Devuelve lo escrito en la caja de texto apellido
     * @return Valor del apellido
     */
    @FXML
    public String obtenApellido () {
        String a = apellido.getText();
        return a;
    }

     /**
     * Devuelve lo escrito en la caja de texto dni
     * @return Valor del dni
     */
    @FXML
    public String obtenDni() {
        String d = dni.getText();
        return d;
    }
    
}
