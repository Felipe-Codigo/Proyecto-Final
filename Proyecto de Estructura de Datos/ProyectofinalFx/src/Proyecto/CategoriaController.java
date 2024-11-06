package Proyecto;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;


public class CategoriaController implements Initializable {

    @FXML
    private Button B_Categoria1;
    
    @FXML
    private Button B_Categoria2;
    
    @FXML
    private Button B_Categoria3;
    
    @FXML
    private Button B_Categoria4;
    
    @FXML
    private Button B_Categoria5;
    
    @FXML
    private AnchorPane From_Categoria1;
    
    @FXML
    private AnchorPane From_Categoria2;
    
    @FXML
    private AnchorPane From_Categoria3;
    
    @FXML
    private AnchorPane From_Categoria4;
    
    @FXML
    private AnchorPane From_Categoria5;
    
    public void cambiarFrom(ActionEvent event){
       
        if (event.getSource()== B_Categoria1) {
        From_Categoria1.setVisible(true); 
        From_Categoria2.setVisible(false);
        From_Categoria3.setVisible(false);
        From_Categoria4.setVisible(false);
        From_Categoria5.setVisible(false);
        }else if (event.getSource()== B_Categoria2){
        From_Categoria1.setVisible(false); 
        From_Categoria2.setVisible(true);
        From_Categoria3.setVisible(false);
        From_Categoria4.setVisible(false);
        From_Categoria5.setVisible(false);
        }else if (event.getSource()== B_Categoria3) { 
        From_Categoria1.setVisible(false); 
        From_Categoria2.setVisible(false);
        From_Categoria3.setVisible(true);
        From_Categoria4.setVisible(false);
        From_Categoria5.setVisible(false);
        }else if (event.getSource()== B_Categoria4) { 
        From_Categoria1.setVisible(false); 
        From_Categoria2.setVisible(false);
        From_Categoria3.setVisible(false);
        From_Categoria4.setVisible(true);
        From_Categoria5.setVisible(false);
        }else if (event.getSource()== B_Categoria5) { 
        From_Categoria1.setVisible(false); 
        From_Categoria2.setVisible(false);
        From_Categoria3.setVisible(false);
        From_Categoria4.setVisible(false);
        From_Categoria5.setVisible(true);
      }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
