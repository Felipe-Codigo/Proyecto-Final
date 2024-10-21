package controller;

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


public class LoginController implements Initializable {
    
    @FXML
    private TextField T_CorreoE;
    
    @FXML
    private PasswordField T_Contrasena;
    
    @FXML
    private Button B_Entrar;
    
    @FXML
    private Button B_CrearC;
    
    @FXML
    public void eventButtonCrearC (ActionEvent event){
        cambiarVentana (event, "/view/Crear_Cuenta.fxml");
    }
    @FXML
    public void eventButtonEntrar (ActionEvent event){
        cambiarVentana (event, "/view/Categoria.fxml");
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
