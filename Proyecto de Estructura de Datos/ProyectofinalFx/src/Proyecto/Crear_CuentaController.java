package Proyecto;

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
        cambiarVentana (event, "Login.fxml");
    }
    @FXML
   public void eventButtonGuardarC(ActionEvent event) {
        // Crear un nuevo usuario con los datos del formulario
        Usuario nuevoUsuario = new Usuario(
            T_NomCom.getText(),
            T_CorEl.getText(),
            T_Contras.getText()
        );
        
        // Validar que el correo no esté vacío y no exista en la lista
        Nodo1<Usuario> nodoExistente = Usuario.getBuscarCorreo_E(T_CorEl.getText());
        if (nodoExistente != null) {
            JOptionPane.showMessageDialog(null, "El correo ya está registrado.");
            return; // Salir si el correo ya existe
        }
        
        // Si no existe, agregar el nuevo usuario a la lista
        Usuario.setAddNodoF(T_NomCom, T_CorEl, T_Contras); // Agregar nodo a la lista

        // Guardar los usuarios en el archivo
        Usuario.GuardarArchivoBlock((ObservableList<Proyecto.Usuario>) Usuario);// Llamamos al método para guardar
        
        // Limpiar los campos del formulario
        T_NomCom.clear();
        T_CorEl.clear();
        T_Contras.clear();
        
        JOptionPane.showMessageDialog(null, "Usuario guardado correctamente.");
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
