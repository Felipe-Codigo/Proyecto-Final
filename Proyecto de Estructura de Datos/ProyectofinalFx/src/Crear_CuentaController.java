/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */


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

/**
 * FXML Controller class
 *
 * @author FELIPE QUINTERO
 */
public class Crear_CuentaController implements Initializable {

    @FXML
    private TextField T_NomCom;
    
    @FXML
    private TextField T_CorEl;
    
    @FXML
    private TextField T_Contras;
    
    @FXML
    private Button B_InicioS;
    
    @FXML
    private Button B_GuardarC;
    
    @FXML
    public void eventButtonInicioS (ActionEvent event){
        cambiarVentana (event, "/view/Login.fxml");
    }
    
    public void eventButtonGuardarC (ActionEvent event){
        
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
