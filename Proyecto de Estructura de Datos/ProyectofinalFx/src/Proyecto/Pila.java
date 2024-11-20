
package Proyecto;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.swing.JOptionPane;

public class Pila {
    Nodo2<Producto> tope;
    
    Pila(){ tope = null; }
    
    public boolean getEsPilaVacia(){ return tope==null?true:false; }
    
    public int getLongPila(){
        if(getEsPilaVacia())
            return 0;
        else{
            Nodo2<Producto> p=tope;
            int cont=0;
            do{
                cont++;
                p=p.sig;
            }while(p!=tope);
            return cont;
        }
    }
    
    public Nodo2<Producto> getBuscarId_P(String Id_P){
        if(getEsPilaVacia())
            return null;
        else{
            Nodo2<Producto> p=tope;
            do{
                if(p.dato.Id_P.equals(Id_P))
                    return p;
                else
                    p=p.sig;
            }while(p!=tope);
            return null;
        }
    }
    
    public Producto getCrearProducto(String Id_P, String Nombre_P, String Tipo_P, int Precio_P){
        Producto Pro=null;
        Nodo2<Producto> buscar=null;
        try{
            buscar=getBuscarId_P(Id_P);
            if(buscar!=null){
                JOptionPane.showMessageDialog(null, 
                    "El Producto ya existe, intente nuevamente!");
                return null;
            }
            else{
                Pro=new Producto(Id_P, Nombre_P, Tipo_P, Precio_P);    
               
                return Pro;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
            return null;
        }
    }
    
    public Nodo2<Producto> getBase(){
        if(getEsPilaVacia())
            return null;
        else{
            Nodo2<Producto> p = tope;
            // Recorremos hasta encontrar el nodo cuya referencia es al "tope"
            while (p.sig != tope) {
                p = p.sig;
            }
            return p; // Devolver el último nodo, no el tope
        }
    }
    
    public void setPush(String Id_P, String Nombre_P, String Tipo_P, int Precio_P) {
        
    Producto Pro = getCrearProducto(Id_P, Nombre_P, Tipo_P, Precio_P);
    if (Pro != null) {
        Nodo2<Producto> info = new Nodo2(Pro);
        if (tope == null) {
            tope = info;
            tope.sig = tope;
        } else {
            Nodo2<Producto> base = getBase();
            info.sig = tope;
            tope = info;
            base.sig = tope;
        }
      }
    }
    
    public void setPop(){
        if(getEsPilaVacia())
            JOptionPane.showMessageDialog(null,
                "La pila esta vacía!");
        else{
            if(tope.sig==tope)
                tope=null;
            else{
                Nodo2<Producto> base=getBase();
                Nodo2<Producto> e=tope;
                tope=tope.sig;
                base.sig=tope;
                e.sig=null;
                e=null;
                JOptionPane.showMessageDialog(null, 
                    "Elemento atendido de la pila!");
            }
        }
    }
    
   public void setRegistrarFilaTable(TableView<Producto> table) {
       
    ObservableList<Producto> productosList = FXCollections.observableArrayList();

    if (!getEsPilaVacia()) {
        Nodo2<Producto> nodo = tope;
        do {
            productosList.add(nodo.dato);  
            nodo = nodo.sig;  
        } while (nodo != tope);
    }

    table.setItems(productosList); 

    if (table.getColumns().isEmpty()) {
        TableColumn<Producto, String> FXidpro = new TableColumn<>("Producto");
        FXidpro.setCellValueFactory(new PropertyValueFactory<>("Id_P"));

        TableColumn<Producto, String> FXNombre_P = new TableColumn<>("Nombre");
        FXNombre_P.setCellValueFactory(new PropertyValueFactory<>("Nombre_P"));

        TableColumn<Producto, String> FXTipoP = new TableColumn<>("Tipo");
        FXTipoP.setCellValueFactory(new PropertyValueFactory<>("Tipo_P"));

        TableColumn<Producto, Integer> FXPrecio = new TableColumn<>("Precio");
        FXPrecio.setCellValueFactory(new PropertyValueFactory<>("Precio_P"));

        table.getColumns().addAll(FXidpro, FXNombre_P, FXTipoP, FXPrecio);  
        
      }
    }
     
     public void setllenarTable(TableView<Producto> tab) {
    ObservableList<Producto> productosList = FXCollections.observableArrayList();

    
    if (!getEsPilaVacia()) {
        Nodo2<Producto> nodo = tope;
        do {
            productosList.add(nodo.dato);  
            nodo = nodo.sig;  
        } while (nodo != tope);  
    }
    
    tab.getItems().clear();
    tab.setItems(productosList);
    
    TableColumn<Producto, String> FXidpro = new TableColumn<>("Producto");
    FXidpro.setCellValueFactory(new PropertyValueFactory<>("Id_P"));

    TableColumn<Producto, String> FXNombre_P = new TableColumn<>("Nombre");
    FXNombre_P.setCellValueFactory(new PropertyValueFactory<>("Nombre_P"));

    TableColumn<Producto, String> FXTipoP = new TableColumn<>("Tipo");
    FXTipoP.setCellValueFactory(new PropertyValueFactory<>("Tipo_P"));

    TableColumn<Producto, Integer> FXPrecio = new TableColumn<>("Precio");
    FXPrecio.setCellValueFactory(new PropertyValueFactory<>("Precio_P"));

    if (tab.getColumns().isEmpty()) {
        tab.getColumns().addAll(FXidpro, FXNombre_P, FXTipoP, FXPrecio);
        JOptionPane.showMessageDialog(null, " SE AGREGO");
    }else{
        JOptionPane.showMessageDialog(null, "NO SE AGREGO");
      }
    }
    
    public void getSumaPro(){
        float cant, sum=0;
        cant=(float) getLongPila();
        if(cant==0)
            JOptionPane.showMessageDialog(null,
                "La pila esta vacía!");
        else{
            Nodo2<Producto> p=tope;
            do{
                sum=sum+p.dato.Precio_P;
                p=p.sig;
            }while(p!=tope);
        }
    } 
    
}
