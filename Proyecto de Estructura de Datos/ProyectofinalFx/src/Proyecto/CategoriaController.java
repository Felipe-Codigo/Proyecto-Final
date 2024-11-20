
package Proyecto;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;

public class CategoriaController implements Initializable {
    Pila Producto;
    Lista Usuario;
    Cola producto;
    
    @FXML
    private Button B_Categoria1, B_Categoria2, B_Categoria3, B_Categoria4, B_Categoria5;
    
    @FXML
    private Button FXComprar1, FXComprar2, FXComprar3, FXComprar4, FXComprar5, FXComprar6;
    
    @FXML
    private Button FXComprar7, FXComprar8, FXComprar9, FXComprar10, FXComprar11, FXComprar12;
    
    @FXML
    private Button FXComprar13, FXComprar14, FXComprar15, FXComprar16, FXComprar17, FXComprar18;
    
    @FXML
    private Button FXComprar19, FXComprar20, FXComprar21, FXComprar22, FXComprar23, FXComprar24;
    
    @FXML
    private Button FXComprar25, FXComprar26, FXComprar27, FXComprar28, FXComprar29, FXComprar30;
    
    @FXML
    private AnchorPane From_Categoria1, From_Categoria2, From_Categoria3, From_Categoria4, From_Categoria5;
    
    @FXML
    private TableView<Producto> Carrito_compra, Favorito, Historial;
    
    @FXML
    private TableColumn<Producto, String> FXidpro, FXNombre_P, FXTipoP, FXFecha;
    
    @FXML
    private TableColumn<Producto, Integer> FXPrecio;
    
    @FXML
    private TableColumn<?, ?> Fxop_Eliminar;
    
    @FXML
    private TableColumn<?, ?> FXop_Comprar;
    
    @FXML
    private Button FXFavoritos1, FXFavoritos2, FXFavoritos3, FXFavoritos4, FXFavoritos5, FXFavoritos6;
    
    @FXML
    private Button FXFavoritos7, FXFavoritos8, FXFavoritos9, FXFavoritos10, FXFavoritos11, FXFavoritos12;
    
    @FXML
    private Button FXFavoritos13, FXFavoritos14, FXFavoritos15, FXFavoritos16, FXFavoritos17, FXFavoritos18;
    
    @FXML
    private Button FXFavoritos19, FXFavoritos20, FXFavoritos21, FXFavoritos22, FXFavoritos23, FXFavoritos24;
    
    @FXML
    private Button FXFavoritos25, FXFavoritos26, FXFavoritos27, FXFavoritos28, FXFavoritos29, FXFavoritos30;
    
    @FXML
    private TextField FXcantidad, FXNombre_C, FXCorreo_E, FXContrasena;
    
    
    private void inicializarProductos() {
     
    Producto.setPush("001", "Tenis adidas 4DFWD Pulse negro", "Zapato", 850000);
    Producto.setPush("002", "Tenis adidas Forum Mid", "Zapato", 460000);
    Producto.setPush("003", "Tenis adidas Supernova+", "Zapato", 640000);
    Producto.setPush("004", "Tenis adidas 4DFWD Pulse blanco", "Zapato", 85000);
    Producto.setPush("005", "Tenis adidas Ultra 4D", "Zapato", 1050000);
    Producto.setPush("006", "Tenis adidas 4DFWD Pulse naranjado", "Zapato", 85000);
    Producto.setPush("007", "SHEIN EZwear Jeans", "Jeans", 128500);
    Producto.setPush("008", "Pantalon Cargo Trabajo", "Jeans", 80000);
    Producto.setPush("009", "Jean mujer tiro alto", "Jeans", 190000);
    Producto.setPush("010", "Vaqueros holgados para mujero", "Jeans", 170000);
    Producto.setPush("011", "Manfinity EMRG Jeans rasgados", "Jeans", 157000);
    Producto.setPush("012", "Jean Masculino Cargo", "Jeans", 90000);
    Producto.setPush("013", "Blusa corta de manga larga para mujer", "Camisa", 54000);
    Producto.setPush("014", "Camisa para mujer oversize", "Camisa", 120000);
    Producto.setPush("015", "Blusa elegante a rayas", "Camisa", 102000);
    Producto.setPush("016", "Camisa manga corta para hombre", "Camisa", 90000);
    Producto.setPush("017", "Camisas de Hombre de Vestir Informales", "Camisa", 107500);
    Producto.setPush("018", "Hombre camisa de lino", "Camisa", 100000);
    Producto.setPush("019", "Celular Motorola Moto G42", "Celular", 850000);
    Producto.setPush("020", "Celular Samsung Galaxy A55 5G", "Celular", 1450000);
    Producto.setPush("021", "Celular Iphone 14 Pro", "Celular", 6900000);
    Producto.setPush("022", "Celular Xiaomi Redmi A3", "Celular", 390000);
    Producto.setPush("023", "Samsung Galaxy Z Fold 4 5g", "Celular", 3950000);
    Producto.setPush("024", "Huawei Mate XT Ultimate Design", "Celular", 11880000);
    Producto.setPush("025", "Portatil Lenovo LOQ 15IAX9", "Portatil", 37900000);
    Producto.setPush("026", "HP Portátil A6HX4LA#ABM 14-DQ0533LA", "Portatil", 1300000);
    Producto.setPush("027", "Portátil Lenovo V14 G4 IAH", "Portatil", 1920000);
    Producto.setPush("028", "Notebook Lenovo Legion Slim 7 15ach6 - 82k80083us", "Portatil", 7600000);
    Producto.setPush("029", "Macbook Pro 15 Touchbar2018 Mod A1990", "Portatil", 2800000);
    Producto.setPush("030", "Portátil SAMSUNG Galaxy Book 2 Pro", "Portatil", 2170000);
    
    producto.setAddCola("001", "Tenis adidas 4DFWD Pulse negro", "Zapato", 850000);
    producto.setAddCola("002", "Tenis adidas Forum Mid", "Zapato", 460000);
    producto.setAddCola("003", "Tenis adidas Supernova+", "Zapato", 640000);
    producto.setAddCola("004", "Tenis adidas 4DFWD Pulse blanco", "Zapato", 85000);
    producto.setAddCola("005", "Tenis adidas Ultra 4D", "Zapato", 1050000);
    producto.setAddCola("006", "Tenis adidas 4DFWD Pulse naranjado", "Zapato", 85000);
    producto.setAddCola("007", "SHEIN EZwear Jeans", "Jeans", 128500);
    producto.setAddCola("008", "Pantalon Cargo Trabajo", "Jeans", 80000);
    producto.setAddCola("009", "Jean mujer tiro alto", "Jeans", 190000);
    producto.setAddCola("010", "Vaqueros holgados para mujero", "Jeans", 170000);
    producto.setAddCola("011", "Manfinity EMRG Jeans rasgados", "Jeans", 157000);
    producto.setAddCola("012", "Jean Masculino Cargo", "Jeans", 90000);
    producto.setAddCola("013", "Blusa corta de manga larga para mujer", "Camisa", 54000);
    producto.setAddCola("014", "Camisa para mujer oversize", "Camisa", 120000);
    producto.setAddCola("015", "Blusa elegante a rayas", "Camisa", 102000);
    producto.setAddCola("016", "Camisa manga corta para hombre", "Camisa", 90000);
    producto.setAddCola("017", "Camisas de Hombre de Vestir Informales", "Camisa", 107500);
    producto.setAddCola("018", "Hombre camisa de lino", "Camisa", 100000);
    producto.setAddCola("019", "Celular Motorola Moto G42", "Celular", 850000);
    producto.setAddCola("020", "Celular Samsung Galaxy A55 5G", "Celular", 1450000);
    producto.setAddCola("021", "Celular Iphone 14 Pro", "Celular", 6900000);
    producto.setAddCola("022", "Celular Xiaomi Redmi A3", "Celular", 390000);
    producto.setAddCola("023", "Samsung Galaxy Z Fold 4 5g", "Celular", 3950000);
    producto.setAddCola("024", "Huawei Mate XT Ultimate Design", "Celular", 11880000);
    producto.setAddCola("025", "Portatil Lenovo LOQ 15IAX9", "Portatil", 37900000);
    producto.setAddCola("026", "HP Portátil A6HX4LA#ABM 14-DQ0533LA", "Portatil", 1300000);
    producto.setAddCola("027", "Portátil Lenovo V14 G4 IAH", "Portatil", 1920000);
    producto.setAddCola("028", "Notebook Lenovo Legion Slim 7 15ach6 - 82k80083us", "Portatil", 7600000);
    producto.setAddCola("029", "Macbook Pro 15 Touchbar2018 Mod A1990", "Portatil", 2800000);
    producto.setAddCola("030", "Portátil SAMSUNG Galaxy Book 2 Pro", "Portatil", 2170000);

 
    }
  
    @FXML
    private void Perfil(ActionEvent event) {
       
    }
    
    @FXML
    private void agregarAlCarrito(ActionEvent event) {
        if (Producto == null) {
        JOptionPane.showMessageDialog(null, "Error: La pila de productos no está inicializada.");
        
        return;
        }
        Button botonPresionado = (Button) event.getSource();
        String Id_P = "";
        
        if (botonPresionado == FXComprar1) {
           Id_P = "001"; 
        } else if (botonPresionado == FXComprar2) {
           Id_P = "002";
        } else if (botonPresionado == FXComprar3) {
           Id_P = "003";
        } else if (botonPresionado == FXComprar4) {
           Id_P = "004";
        } else if (botonPresionado == FXComprar5) {
           Id_P = "005";
        } else if (botonPresionado == FXComprar6) {
           Id_P = "006";
        } else if (botonPresionado == FXComprar7) {
           Id_P = "007";
        } else if (botonPresionado == FXComprar8) {
           Id_P = "008";
        } else if (botonPresionado == FXComprar9) {
           Id_P = "009";
        } else if (botonPresionado == FXComprar10) {
           Id_P = "010";
        } else if (botonPresionado == FXComprar11) {
           Id_P = "011";
        } else if (botonPresionado == FXComprar12) {
           Id_P = "012";
        } else if (botonPresionado == FXComprar13) {
           Id_P = "013";
        } else if (botonPresionado == FXComprar14) {
           Id_P = "014";
        } else if (botonPresionado == FXComprar15) {
           Id_P = "015";
        } else if (botonPresionado == FXComprar16) {
           Id_P = "016";
        } else if (botonPresionado == FXComprar17) {
           Id_P = "017";
        } else if (botonPresionado == FXComprar18) {
           Id_P = "018";
        } else if (botonPresionado == FXComprar19) {
           Id_P = "019";
        } else if (botonPresionado == FXComprar20) {
           Id_P = "020";
        } else if (botonPresionado == FXComprar21) {
           Id_P = "021";
        }else if (botonPresionado == FXComprar22) {
           Id_P = "022";
        } else if (botonPresionado == FXComprar23) {
           Id_P = "023";
        } else if (botonPresionado == FXComprar24) {
           Id_P = "024";
        } else if (botonPresionado == FXComprar25) {
           Id_P = "025";
        } else if (botonPresionado == FXComprar26) {
           Id_P = "026";
        } else if (botonPresionado == FXComprar27) {
           Id_P = "027";
        } else if (botonPresionado == FXComprar28) {
           Id_P = "028";
        } else if (botonPresionado == FXComprar29) {
           Id_P = "029";
        } else if (botonPresionado == FXComprar30) {
           Id_P = "030";
        }
        
        Nodo3<Producto> productoEncontrado = producto.getBuscarId_P(Id_P);
    
    if (productoEncontrado != null) {
        
        producto.llenarTablaCola(Carrito_compra);
        JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
    } else {
        JOptionPane.showMessageDialog(null, "Producto no encontrado.");
    }
    
    System.out.println("Producto buscado con ID: " + Id_P);
    
    if (productoEncontrado != null) {
    System.out.println("Producto encontrado: " + productoEncontrado.dato.toString());
   } else {
    System.out.println("Producto no encontrado");
    }
        
    }
    
    @FXML
    private void agregarAFavoritos(ActionEvent event) {
        
        if (Producto == null) {
        JOptionPane.showMessageDialog(null, "Error: La pila de productos no está inicializada.");
            return;
        }
        
        Button botonPresionado = (Button) event.getSource();
       
        String Id_P = "";
        
        if (botonPresionado == FXFavoritos1) {
            Id_P = "001";   
        } else if (botonPresionado == FXFavoritos2) {
            Id_P = "002";
        } else if (botonPresionado == FXFavoritos3) {
            Id_P = "003";
        }else if (botonPresionado == FXFavoritos4) {
            Id_P = "004";
        } else if (botonPresionado == FXFavoritos5) {
            Id_P = "005";
        }else if (botonPresionado == FXFavoritos6) {
            Id_P = "006";
        } else if (botonPresionado == FXFavoritos7) {
            Id_P = "007";
        }else if (botonPresionado == FXFavoritos8) {
            Id_P = "008";
        } else if (botonPresionado == FXFavoritos9) {
            Id_P = "009";
        }else if (botonPresionado == FXFavoritos10) {
            Id_P = "010";
        } else if (botonPresionado == FXFavoritos11) {
            Id_P = "011";
        }else if (botonPresionado == FXFavoritos12) {
            Id_P = "012";
        } else if (botonPresionado == FXFavoritos13) {
            Id_P = "013";
        }else if (botonPresionado == FXFavoritos14) {
            Id_P = "014";
        } else if (botonPresionado == FXFavoritos15) {
            Id_P = "015";
        }else if (botonPresionado == FXFavoritos16) {
            Id_P = "016";
        } else if (botonPresionado == FXFavoritos17) {
            Id_P = "017";
        }else if (botonPresionado == FXFavoritos18) {
            Id_P = "018";
        } else if (botonPresionado == FXFavoritos19) {
            Id_P = "019";
        }else if (botonPresionado == FXFavoritos20) {
            Id_P = "020";
        } else if (botonPresionado == FXFavoritos21) {
            Id_P = "021";
        }else if (botonPresionado == FXFavoritos22) {
            Id_P = "022";
        } else if (botonPresionado == FXFavoritos23) {
            Id_P = "023";
        }else if (botonPresionado == FXFavoritos24) {
            Id_P = "024";
        } else if (botonPresionado == FXFavoritos25) {
            Id_P = "025";
        }else if (botonPresionado == FXFavoritos26) {
            Id_P = "026";
        } else if (botonPresionado == FXFavoritos27) {
            Id_P = "027";
        }else if (botonPresionado == FXFavoritos28) {
            Id_P = "028";
        } else if (botonPresionado == FXFavoritos29) {
            Id_P = "029";
        }else if (botonPresionado == FXFavoritos30) {
            Id_P = "030";
        } 
        
        Nodo2<Producto> productoEncontrado = Producto.getBuscarId_P(Id_P);
    
    if (productoEncontrado != null) {
        // Si el producto fue encontrado, lo agregamos al Favorito
        Producto.setRegistrarFilaTable(Favorito);
        Producto.setllenarTable(Favorito);
        JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
    } else {
        // Si no se encuentra el producto, muestra un mensaje de error
        JOptionPane.showMessageDialog(null, "Producto no encontrado.");
    }
    System.out.println("Producto buscado con ID: " + Id_P);
    
    if (productoEncontrado != null) {
    System.out.println("Producto encontrado: " + productoEncontrado.dato.toString());
   } else {
    System.out.println("Producto no encontrado");
    }
        
    }
    @FXML
    public void Cantidad(ActionEvent event){
        Producto.getSumaPro();
    }
    
    @FXML
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
    
    /**
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO  
    FXidpro.setCellValueFactory(new PropertyValueFactory<>("Id_P"));
    FXNombre_P.setCellValueFactory(new PropertyValueFactory<>("Nombre_P"));
    FXTipoP.setCellValueFactory(new PropertyValueFactory<>("Tipo_P"));
    FXPrecio.setCellValueFactory(new PropertyValueFactory<>("Precio_P"));
    
    if (Producto == null) {
        Producto = new Pila();
        producto = new Cola();
        inicializarProductos();
    }   
    }      
   
}

