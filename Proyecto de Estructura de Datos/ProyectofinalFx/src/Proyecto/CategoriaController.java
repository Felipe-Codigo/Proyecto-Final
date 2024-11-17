
package Proyecto;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;


public class CategoriaController implements Initializable {
    Pila Producto;
    
    Cola producto;
    

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
    private AnchorPane From_Categoria1;
    
    @FXML
    private AnchorPane From_Categoria2;
    
    @FXML
    private AnchorPane From_Categoria3;
    
    @FXML
    private AnchorPane From_Categoria4;
    
    @FXML
    private AnchorPane From_Categoria5;
    
    @FXML
    private TableView Carrito_compra, Favorito, Historial;
     
    @FXML
    private TableColumn FXidpro, FXNombre_P, FXTipoP, FXPrecio, FXop_Eliminar, FXop_Comprar, FXFecha;
    
    private void inicializarProductos() {
        Producto = new Pila();
        
        Producto.getCrearProducto("001", "Tenis adidas 4DFWD Pulse negro", "Zapato", 850000);
        Producto.getCrearProducto("002", "Tenis adidas Forum Mid", "Zapato", 460000);
        Producto.getCrearProducto("003", "Tenis adidas Supernova+", "Zapato", 640000);
        Producto.getCrearProducto("004", "Tenis adidas 4DFWD Pulse blanco", "Zapato", 85000);
        Producto.getCrearProducto("005", "Tenis adidas Ultra 4D", "Zapato", 1050000);
        Producto.getCrearProducto("006", "Tenis adidas 4DFWD Pulse naranjado", "Zapato", 85000);
        Producto.getCrearProducto("007", "SHEIN EZwear Jeans", "Jeans", 128500);
        Producto.getCrearProducto("008", "Pantalon Cargo Trabajo", "Jeans", 80000);
        Producto.getCrearProducto("009", "Jean mujer tiro alto", "Jeans", 190000);
        Producto.getCrearProducto("010", "Vaqueros holgados para mujero", "Jeans", 170000);
        Producto.getCrearProducto("011", "Manfinity EMRG Jeans rasgados", "Jeans", 157000);
        Producto.getCrearProducto("012", "Jean Masculino Cargo", "Jeans", 90000);
        Producto.getCrearProducto("013", "Blusa corta de manga larga para mujer", "Camisa", 54000);
        Producto.getCrearProducto("014", "Camisa para mujer oversize", "Camisa", 120000);
        Producto.getCrearProducto("015", "Blusa elegante a rayas", "Camisa", 102000);
        Producto.getCrearProducto("016", "Camisa manga corta para hombre", "Camisa", 90000);
        Producto.getCrearProducto("017", "Camisas de Hombre de Vestir Informales", "Camisa", 107500);
        Producto.getCrearProducto("018", "Hombre camisa de lino", "Camisa", 100000);
        Producto.getCrearProducto("019", "Celular Motorola Moto G42", "Celular", 850000);
        Producto.getCrearProducto("020", "Celular Samsung Galaxy A55 5G", "Celular", 1450000);
        Producto.getCrearProducto("021", "Celular Iphone 14 Pro", "Celular", 6900000);
        Producto.getCrearProducto("022", "Celular Xiaomi Redmi A3", "Celular", 390000);
        Producto.getCrearProducto("023", "Samsung Galaxy Z Fold 4 5g", "Celular", 3950000);
        Producto.getCrearProducto("024", "Huawei Mate XT Ultimate Design", "Celular", 11880000);
        Producto.getCrearProducto("025", "Portatil Lenovo LOQ 15IAX9", "Portatil", 37900000);
        Producto.getCrearProducto("026", "HP Portátil A6HX4LA#ABM 14-DQ0533LA", "Portatil", 1300000);
        Producto.getCrearProducto("027", "Portátil Lenovo V14 G4 IAH", "Portatil", 1920000);
        Producto.getCrearProducto("028", "Notebook Lenovo Legion Slim 7 15ach6 - 82k80083us", "Portatil", 7600000);
        Producto.getCrearProducto("029", "Macbook Pro 15 Touchbar2018 Mod A1990", "Portatil", 2800000);
        Producto.getCrearProducto("030", "Portátil SAMSUNG Galaxy Book 2 Pro", "Portatil", 2170000);
        
    }
    
    @FXML
    private void agregarAlCarrito(ActionEvent event) {
        
        
        // Obtener el botón presionado
        Button botonPresionado = (Button) event.getSource();
        

        // Determinar qué producto se debe agregar en base al botón presionado
        String Id_P = "";

        // Puedes usar un switch o if-else para determinar qué producto corresponde a cada botón
        if (botonPresionado == FXComprar1) {
            Id_P = "001"; // El ID del producto correspondiente
        } else if (botonPresionado == FXComprar2) {
            Id_P = "002";
        } else if (botonPresionado == FXComprar3) {
            Id_P = "003";
        }else if (botonPresionado == FXComprar4) {
            Id_P = "004";
        } else if (botonPresionado == FXComprar5) {
            Id_P = "005";
        }else if (botonPresionado == FXComprar6) {
            Id_P = "006";
        } else if (botonPresionado == FXComprar7) {
            Id_P = "007";
        }else if (botonPresionado == FXComprar8) {
            Id_P = "008";
        } else if (botonPresionado == FXComprar9) {
            Id_P = "009";
        }else if (botonPresionado == FXComprar10) {
            Id_P = "010";
        } else if (botonPresionado == FXComprar11) {
            Id_P = "011";
        }else if (botonPresionado == FXComprar12) {
            Id_P = "012";
        } else if (botonPresionado == FXComprar13) {
            Id_P = "013";
        }else if (botonPresionado == FXComprar14) {
            Id_P = "014";
        } else if (botonPresionado == FXComprar15) {
            Id_P = "015";
        }else if (botonPresionado == FXComprar16) {
            Id_P = "016";
        } else if (botonPresionado == FXComprar17) {
            Id_P = "017";
        }else if (botonPresionado == FXComprar18) {
            Id_P = "018";
        } else if (botonPresionado == FXComprar19) {
            Id_P = "019";
        }else if (botonPresionado == FXComprar20) {
            Id_P = "020";
        } else if (botonPresionado == FXComprar21) {
            Id_P = "021";
        }else if (botonPresionado == FXComprar22) {
            Id_P = "022";
        } else if (botonPresionado == FXComprar23) {
            Id_P = "023";
        }else if (botonPresionado == FXComprar24) {
            Id_P = "024";
        } else if (botonPresionado == FXComprar25) {
            Id_P = "025";
        }else if (botonPresionado == FXComprar26) {
            Id_P = "026";
        } else if (botonPresionado == FXComprar27) {
            Id_P = "027";
        }else if (botonPresionado == FXComprar28) {
            Id_P = "028";
        } else if (botonPresionado == FXComprar29) {
            Id_P = "029";
        }else if (botonPresionado == FXComprar30) {
            Id_P = "030";
        } 
        
        Nodo2<Proyecto.Producto> productoEncontrado = Producto.getBuscarId_P(Id_P);
    
    if (productoEncontrado != null) {
        // Si el producto fue encontrado, lo agregamos al carrito (o a Favorito)
        Producto.setRegistrarFilaTable(Favorito);
        Producto.setllenarTable(Favorito);
    } else {
        // Si no se encuentra el producto, muestra un mensaje de error
        JOptionPane.showMessageDialog(null, "Producto no encontrado.");
    }
    System.out.println("Producto buscado con ID: " + Id_P);
    
    if (productoEncontrado != null) {
    System.out.println("Producto encontrado: " + productoEncontrado);
   } else {
    System.out.println("Producto no encontrado");
    }
        
    }
   
    
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
     // Inicializamos la pila solo una vez, si aún no ha sido inicializada.
    if (Producto == null) {
        inicializarProductos(); // Llama para agregar los productos a la pila
    }
     
            
        
    }   

    
    
}
