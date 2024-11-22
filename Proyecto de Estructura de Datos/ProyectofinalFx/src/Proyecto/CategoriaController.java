
package Proyecto;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;


public class CategoriaController implements Initializable {
    Pila Producto;
    Lista Usuario;
    Cola producto;
    
    @FXML
    private Button B_Categoria1, B_Categoria2, B_Categoria3, B_Categoria4, B_Categoria5, FXcerrar;
    
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
    private TableColumn<Producto, String> FXidpro, FXNombre_P, FXTipoP;
    
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
   

    
    
    
    @FXML
    private void Perfil(ActionEvent event) {
       
    }
    
    @FXML
    private void cerrar (ActionEvent event) {
        System.exit(0);
    }
    @FXML
    private void agregarAlCarrito1(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar1) {
          producto.setAddCola("001", "Tenis adidas 4DFWD Pulse negro", "Zapato", 850000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito2(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar2) {
          producto.setAddCola("002", "Tenis adidas Forum Mid", "Zapato", 460000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito3(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar3) {
          producto.setAddCola("003", "Tenis adidas Supernova+", "Zapato", 640000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito4(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar4) {
          producto.setAddCola("004", "Tenis adidas 4DFWD Pulse blanco", "Zapato", 85000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito5(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar5) {
          producto.setAddCola("005", "Tenis adidas Ultra 4D", "Zapato", 1050000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito6(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar6) {
          producto.setAddCola("006", "Tenis adidas 4DFWD Pulse naranjado", "Zapato", 85000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito7(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar7) {
          producto.setAddCola("007", "SHEIN EZwear Jeans", "Jeans", 128500);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito8 (ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar8) {
          producto.setAddCola("008", "Pantalon Cargo Trabajo", "Jeans", 80000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito9(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar9) {
          producto.setAddCola("009", "Jean mujer tiro alto", "Jeans", 190000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito10(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar10) {
          producto.setAddCola("010", "Vaqueros holgados para mujero", "Jeans", 170000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito11(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar11) {
          producto.setAddCola("011", "Manfinity EMRG Jeans rasgados", "Jeans", 157000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito12(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar12) {
          producto.setAddCola("012", "Jean Masculino Cargo", "Jeans", 90000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito13(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar13) {
          producto.setAddCola("013", "Blusa corta de manga larga para mujer", "Camisa", 54000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito14(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar14) {
          producto.setAddCola("014", "Camisa para mujer oversize", "Camisa", 120000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito15(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar15) {
          producto.setAddCola("015", "Blusa elegante a rayas", "Camisa", 102000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito16(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar16) {
          producto.setAddCola("016", "Camisa manga corta para hombre", "Camisa", 90000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito17(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar17) {
          producto.setAddCola("017", "Camisas de Hombre de Vestir Informales", "Camisa", 107500);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito18(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar18) {
          producto.setAddCola("018", "Hombre camisa de lino", "Camisa", 100000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito19(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar19) {
          producto.setAddCola("019", "Celular Motorola Moto G42", "Celular", 850000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito20(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar20) {
          producto.setAddCola("020", "Celular Samsung Galaxy A55 5G", "Celular", 1450000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito21(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar21) {
          producto.setAddCola("021", "Celular Iphone 14 Pro", "Celular", 6900000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito22(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar22) {
          producto.setAddCola("022", "Celular Xiaomi Redmi A3", "Celular", 390000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito23(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar23) {
          producto.setAddCola("023", "Samsung Galaxy Z Fold 4 5g", "Celular", 3950000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito24(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar24) {
          producto.setAddCola("024", "Huawei Mate XT Ultimate Design", "Celular", 11880000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito25(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar25) {
          producto.setAddCola("025", "Portatil Lenovo LOQ 15IAX9", "Portatil", 37900000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito26(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar26) {
          producto.setAddCola("026", "HP Portátil A6HX4LA#ABM 14-DQ0533LA", "Portatil", 1300000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito27(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar27) {
          producto.setAddCola("027", "Portátil Lenovo V14 G4 IAH", "Portatil", 1920000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito28(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar28) {
          producto.setAddCola("028", "Notebook Lenovo Legion Slim 7 15ach6 - 82k80083us", "Portatil", 7600000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito29(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar29) {
          producto.setAddCola("029", "Macbook Pro 15 Touchbar2018 Mod A1990", "Portatil", 2800000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAlCarrito30(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXComprar30) {
          producto.setAddCola("030", "Portátil SAMSUNG Galaxy Book 2 Pro", "Portatil", 2170000);
          producto.llenarTablaCola(Carrito_compra);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos1(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos1) {
          Producto.setPush("001", "Tenis adidas 4DFWD Pulse negro", "Zapato", 850000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos2(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos2) {
          Producto.setPush("002", "Tenis adidas Forum Mid", "Zapato", 460000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos3(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos3) {
          Producto.setPush("003", "Tenis adidas Supernova+", "Zapato", 640000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos4(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos4) {
          Producto.setPush("004", "Tenis adidas 4DFWD Pulse blanco", "Zapato", 85000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos5(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos5) {
          Producto.setPush("005", "Tenis adidas Ultra 4D", "Zapato", 1050000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos6(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos6) {
          Producto.setPush("006", "Tenis adidas 4DFWD Pulse naranjado", "Zapato", 85000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos7(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos7) {
          Producto.setPush("007", "SHEIN EZwear Jeans", "Jeans", 128500);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos8 (ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos8) {
          Producto.setPush("008", "Pantalon Cargo Trabajo", "Jeans", 80000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos9(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos9) {
          Producto.setPush("009", "Jean mujer tiro alto", "Jeans", 190000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos10(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos10) {
          Producto.setPush("010", "Vaqueros holgados para mujero", "Jeans", 170000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos11(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos11) {
          Producto.setPush("011", "Manfinity EMRG Jeans rasgados", "Jeans", 157000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos12(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos12) {
          Producto.setPush("012", "Jean Masculino Cargo", "Jeans", 90000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos13(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos13) {
          Producto.setPush("013", "Blusa corta de manga larga para mujer", "Camisa", 54000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos14(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos14) {
          Producto.setPush("014", "Camisa para mujer oversize", "Camisa", 120000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos15(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos15) {
          Producto.setPush("015", "Blusa elegante a rayas", "Camisa", 102000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos16(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos16) {
          Producto.setPush("016", "Camisa manga corta para hombre", "Camisa", 90000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos17(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos17) {
          Producto.setPush("017", "Camisas de Hombre de Vestir Informales", "Camisa", 107500);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos18(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos18) {
          Producto.setPush("018", "Hombre camisa de lino", "Camisa", 100000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos19(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos19) {
          Producto.setPush("019", "Celular Motorola Moto G42", "Celular", 850000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos20(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos20) {
          Producto.setPush("020", "Celular Samsung Galaxy A55 5G", "Celular", 1450000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos21(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos21) {
          Producto.setPush("021", "Celular Iphone 14 Pro", "Celular", 6900000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos22(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos22) {
          Producto.setPush("022", "Celular Xiaomi Redmi A3", "Celular", 390000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos23(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos23) {
          Producto.setPush("023", "Samsung Galaxy Z Fold 4 5g", "Celular", 3950000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos24(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos24) {
          Producto.setPush("024", "Huawei Mate XT Ultimate Design", "Celular", 11880000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos25(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos25) {
          Producto.setPush("025", "Portatil Lenovo LOQ 15IAX9", "Portatil", 37900000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos26(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos26) {
          Producto.setPush("026", "HP Portátil A6HX4LA#ABM 14-DQ0533LA", "Portatil", 1300000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos27(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos27) {
          Producto.setPush("027", "Portátil Lenovo V14 G4 IAH", "Portatil", 1920000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos28(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos28) {
          Producto.setPush("028", "Notebook Lenovo Legion Slim 7 15ach6 - 82k80083us", "Portatil", 7600000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos29(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos29) {
          Producto.setPush("029", "Macbook Pro 15 Touchbar2018 Mod A1990", "Portatil", 2800000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
        }
    }
    
    @FXML
    private void agregarAFavoritos30(ActionEvent event) {
        Button botonPresionado = (Button) event.getSource();
        if (botonPresionado == FXFavoritos30) {
          Producto.setPush("030", "Portátil SAMSUNG Galaxy Book 2 Pro", "Portatil", 2170000);
          Producto.setRegistrarFilaTable(Favorito);
          Producto.setllenarTable(Favorito);
          JOptionPane.showMessageDialog(null, "Producto Encontrado y agregado.");
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
       
       
        if (Producto == null) {
        Producto = new Pila();
        producto = new Cola();
        
        
        
    }
       
    
       
    }      
   
}

