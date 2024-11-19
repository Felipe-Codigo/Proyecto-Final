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
    
    private Lista Usuario;

    @FXML
    private TextField FXCorreo_E;
    
    @FXML
    private PasswordField FXContrasena;
    
    @FXML
    private Button B_Entrar;
    
    @FXML
    private Button B_CrearC;
    
    // Constructor para inicializar la lista de usuarios
    public LoginController() {
        // Inicializar la lista de usuarios en el constructor
        this.Usuario = new Lista();
    }
    
    @FXML
    public void eventButtonCrearC (ActionEvent event){
        cambiarVentana (event, "Crear_Cuenta.fxml");
        
    }
    @FXML
    public void eventButtonEntrar (ActionEvent event){
        // Obtener los datos ingresados por el usuario
        String correo = FXCorreo_E.getText();
        String contrasena = FXContrasena.getText();

        // Validar que los campos no estén vacíos
        if (correo.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese ambos campos.");
            return; // No continuar si falta algún campo
        }

        // Cargar el usuario desde su archivo
        Usuario usuario = Usuario.cargarUsuariosDesdeArchivo(correo);

        // Verificar si el usuario existe y si la contraseña es correcta
        if (usuario != null && usuario.getContraseña().equals(contrasena)) {
        // Si las credenciales son correctas, cambiar a la ventana de categorías
        cambiarVentana(event, "Categoria.fxml");
        } else {
        // Si el usuario no existe o la contraseña es incorrecta, mostrar un error
        JOptionPane.showMessageDialog(null, "Correo electrónico o contraseña incorrectos.");
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
