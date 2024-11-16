package Proyecto;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
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
   Lista Usuario;

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
   
    
     
    @FXML
    public void eventButtonInicioS (ActionEvent event){
        cambiarVentana (event, "Login.fxml");
    }
    @FXML
   public void eventButtonGuardarC(ActionEvent event) {
        // Crear un nuevo usuario con los datos del formulario
        Usuario nuevoUsuario = new Usuario(
            FXNombre_C.getText(),
            FXCorreo_E.getText(),
            FXContraseña.getText()
        );
        Usuario.getCrearUsuario(FXNombre_C, FXCorreo_E, FXContraseña);
        Usuario.setAddNodoF(FXNombre_C, FXCorreo_E, FXContraseña);
      
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
