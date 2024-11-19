package Proyecto;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author FELIPE QUINTERO
 */
public class Crear_CuentaController implements Initializable {
    
   private Lista Usuario;

    @FXML
    private TextField FXNombre_C;
    
    @FXML
    private TextField FXCorreo_E;
    
    @FXML
    private TextField FXContraseña;
    
    @FXML
    private Button B_InicioS;
    
    @FXML
    private Button B_GuardarC;
   
    // Constructor para inicializar la lista de usuarios
    public Crear_CuentaController() {
        this.Usuario = new Lista();  // Crear una nueva instancia de Lista
    }
     
    @FXML
    public void eventButtonInicioS (ActionEvent event){
        cambiarVentana (event, "Login.fxml");
    }
    @FXML
   public void eventButtonGuardarC(ActionEvent event) {
        Usuario nuevoUsuario = Usuario.getCrearUsuario(FXNombre_C, FXCorreo_E, FXContraseña);
        
        // Si el usuario no es nulo (es decir, no hubo errores en la creación)
        if (nuevoUsuario != null) {
            // Añadir el usuario a la lista de usuarios
            Usuario.setAddNodoF(FXNombre_C, FXCorreo_E, FXContraseña);
            // También podrías guardar los usuarios en un archivo si lo deseas
            Usuario.guardarUsuariosEnArchivo();
            
            JOptionPane.showMessageDialog(null, "Cuenta creada con éxito.");
            
        } else {
            // Si el usuario es nulo, significa que hubo un error al crear la cuenta
            JOptionPane.showMessageDialog(null, "No se pudo crear la cuenta. Intente nuevamente.");
        }
    }
    
    public void cambiarVentana(ActionEvent event, String fxmlFile) {
        
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.close();
        
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root = loader.load();
            
            Scene scene = new Scene(root);
            
            Stage newStage = new Stage();
            newStage.setScene(scene);
            newStage.show();
        }catch (IOException e){
            e.printStackTrace();
        }   
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
