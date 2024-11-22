
package Proyecto;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventType;
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
                if(p.dato.getId_P().equals(Id_P))
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
            while (p.sig != tope) {
                p = p.sig;
            }
            return p;
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
    
   public void setRegistrarFilaTable(TableView<Producto> Favorito) {  
    ObservableList<Producto> Table = FXCollections.observableArrayList();
    
    if (!getEsPilaVacia()) {
        Nodo2<Producto> nodo = tope;
        do {
            Table.add(nodo.dato);  
            nodo = nodo.sig;  
        } while (nodo != tope);
    }
  

    Favorito.setItems(Table); 
    Favorito.refresh();

    if (Favorito.getColumns().isEmpty()) {
        TableColumn<Producto, String> FXidpro1 = new TableColumn<>("Producto");
        FXidpro1.setCellValueFactory(new PropertyValueFactory<>("Id_P"));

        TableColumn<Producto, String> FXNombre_P1 = new TableColumn<>("Nombre");
        FXNombre_P1.setCellValueFactory(new PropertyValueFactory<>("Nombre_P"));

        TableColumn<Producto, String> FXTipoP1 = new TableColumn<>("Tipo");
        FXTipoP1.setCellValueFactory(new PropertyValueFactory<>("Tipo_P"));

        TableColumn<Producto, Integer> FXPrecio1 = new TableColumn<>("Precio");
        FXPrecio1.setCellValueFactory(new PropertyValueFactory<>("Precio_P"));
        

        Favorito.getColumns().addAll(FXidpro1, FXNombre_P1, FXTipoP1, FXPrecio1);  
        
      }
    }
     
     public void setllenarTable(TableView<Producto> Favorito) {
    ObservableList<Producto> Table = FXCollections.observableArrayList();
    

    
    if (!getEsPilaVacia()) {
        Nodo2<Producto> nodo = tope;
        do {
            Table.add(nodo.dato);  
            nodo = nodo.sig;  
        } while (nodo != tope);  
    }
    
    Favorito.getItems().clear();
    Favorito.setItems(Table);
    
    TableColumn<Producto, String> FXidpro1 = new TableColumn<>("Producto");
    FXidpro1.setCellValueFactory(new PropertyValueFactory<>("Id_P"));

    TableColumn<Producto, String> FXNombre_P1 = new TableColumn<>("Nombre");
    FXNombre_P1.setCellValueFactory(new PropertyValueFactory<>("Nombre_P"));

    TableColumn<Producto, String> FXTipoP1 = new TableColumn<>("Tipo");
    FXTipoP1.setCellValueFactory(new PropertyValueFactory<>("Tipo_P"));

    TableColumn<Producto, Integer> FXPrecio1 = new TableColumn<>("Precio");
    FXPrecio1.setCellValueFactory(new PropertyValueFactory<>("Precio_P"));
    
    

    if (Favorito.getColumns().isEmpty()) {
        Favorito.getColumns().addAll(FXidpro1, FXNombre_P1, FXTipoP1, FXPrecio1);
        JOptionPane.showMessageDialog(null, " SE AGREGO");
    }else{
        Favorito.getColumns().addAll(FXidpro1, FXNombre_P1, FXTipoP1, FXPrecio1);
        
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
