package Proyecto;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


public class LoginController implements Initializable {
    Lista Usuario;

    @FXML
    private TextField FXCorreoE;
    
    @FXML
    private PasswordField FXContrasena;
    
    @FXML
    private Button B_Entrar;
    
    @FXML
    private Button B_CrearC;
    
    @FXML
    public void eventButtonCrearC (ActionEvent event){
        cambiarVentana (event, "Crear_Cuenta.fxml");
        
    }
    @FXML
    public void eventButtonEntrar (ActionEvent event){
        // Obtener los valores del correo y la contraseña ingresados
        String correo = FXCorreoE.getText();
        String contrasena = FXContrasena.getText();

        // Validar los datos
        if (FXCorreoE.getText().equals(correo)&& FXContrasena.equals(contrasena)) {
            cambiarVentana(event, "Categoria.fxml");
        } else {
            // Mostrar mensaje de error si los datos son incorrectos
            JOptionPane.showMessageDialog(null, "Correo o contraseña incorrecta.");
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
        }catch (Exception e){
            e.printStackTrace();
        }   
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    
}
