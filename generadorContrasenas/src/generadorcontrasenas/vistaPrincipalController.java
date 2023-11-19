
package generadorcontrasenas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import recuadroRojo.RecuadroRojoController;

/**
 * FXML Controller class
 * Generador de contraseñas 
 * @author Victoria Porras Ortiz
 */
public class vistaPrincipalController implements Initializable {
    
    // Importo el objeto cuadroRojo
    @FXML
    private RecuadroRojoController recuadroRojoController;
    
    @FXML
    private Button botonGenerarContraseña;
    @FXML
    private Button botonNuevosDatos;
    @FXML
    private Label contraseñaGenerada;
    @FXML
    private Button botonSalir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    /**
     * Genera la contraseña
     * El botón "Generar contraseña", generá una contraseña compuesta por 
     * el primer carácter del nombre, 
     * los tres primeros caracteres de los apellidos y 
     * los cuatro últimos caracteres del dni, 
     * y la mostrarrá en el campo de texto bajo la etiqueta "Contraseña generada". 
     * Los caracteres que sean letras de esa contraseña deberán estar en mayúcula tal y como se observa en la Interfaz propuesta.
     */
    @FXML
    private void generarContraseña() {
        
        String nombre = recuadroRojoController.obtenNombre(); // primer caracter
        String apellido = recuadroRojoController.obtenApellido (); // los tres primeros caracteres de los apellidos
        String dni = recuadroRojoController.obtenDni(); // los cuatro últimos caracteres del dni

        String primerCaracterNombre = nombre.substring(0, 1);
        String tresPrimerosCaracteresApellido = apellido.substring(0, 3);
        String cuatroUltimosCaracteresDni = dni.substring(dni.length() - 4);

        String password = primerCaracterNombre+tresPrimerosCaracteresApellido+cuatroUltimosCaracteresDni;

        password = password.toUpperCase();
       
       
        
        contraseñaGenerada.setText(password);
    }

    /**
     * Limpia los valores escritos en nombre, apellidos y dni
     */
    @FXML
    private void nuevosDatos() {
       recuadroRojoController.borrarDatos();
    }

    /**
     * Cierra el programa
     */
    @FXML
    private void salir() {
        System.exit(0);
    }
    
}
