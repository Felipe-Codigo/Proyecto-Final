package Proyecto;

import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import javafx.scene.control.TableColumn;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.swing.table.DefaultTableModel;

public class Lista {
     Nodo1<Usuario> cab;
    
    public Lista(){
        cab=null;
    }
    
    public int getLongLista(){
        if(cab==null)
            return 0;
        else{
            Nodo1<Usuario> p=cab;
            int cont=0;
            while(p!=null){
                cont++;
                p=p.sig;
            }
            return cont;
        }
    }
    
    public boolean getEsVacia(){ return cab==null?true:false; }
    
    public Nodo1<Usuario> getBuscarCorreo_E(String Correo_e){
        if(getEsVacia())
            return null;
        else{
            Nodo1<Usuario> b=cab;
            while(b!=null){
                if(b.dato.Correo_E.equals(Correo_e))
                    return b;
                else
                    b=b.sig;
            }
            return null;
        }
    }
    
    public Usuario getCrearUsuario(
            TextField FXNombre_C,
            TextField FXCorreo_E,
            TextField FXContraseña
    ){
        Usuario info; 
        Nodo1<Usuario> b;
        try{
            b=getBuscarCorreo_E(FXCorreo_E.getText());
            if(b!=null){
                JOptionPane.showMessageDialog(null,
                    "El Correo electronico ya existe, intente "
                    + "nuevamente.");
                FXCorreo_E.setText("");
                FXCorreo_E.requestFocus();
                return null;
            }else{
                info = new Usuario(FXCorreo_E.getText(),
                FXNombre_C.getText(), 
                FXContraseña.getText());
                return info;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,
                "Error: "+e+"\nEl nodo no fue creado, intente"
                + "nuevamente.");
            FXNombre_C.setText("");
            FXCorreo_E.setText("");
            FXContraseña.setText("");
            FXCorreo_E.requestFocus();
            return null;
        }
    }
    
    public Nodo1<Usuario> getUltimo(){
        if(getEsVacia()) return null;
        else{
            Nodo1<Usuario> p=cab;
            while(p.sig!=null)
                p=p.sig;
            return p;
        }
    }
  
    public void setAddNodoF(
            TextField FXNombre_C,
            TextField FXCorreo_E,
            TextField FXContraseña
    ){
        Usuario info=getCrearUsuario(FXNombre_C, FXCorreo_E, FXContraseña);
        Nodo1 q;
        if(info!=null){
            q = new Nodo1(info);
            if(getEsVacia()){
                cab=q;
            }else{
                Nodo1<Usuario> p=getUltimo();
                p.sig=q;
            }
        }
    }
    
    public Nodo1<Usuario> getAnterior(Nodo1 p){
        if(cab==null)
            return null;
        else{
            Nodo1<Usuario> q=cab;
            while(q.sig!=p)
                q=q.sig;
            return q;
        }
    }
    
    public void setDelCorreo_E(String Correo_e){
        Nodo1<Usuario> p=getBuscarCorreo_E(Correo_e), d;
        if(p==null)
            JOptionPane.showMessageDialog(null,
                "El Correo electronico a  eliminar no esta registrado!");
        else{
            if((p==cab)&&(cab.sig==null))
                cab=null;
            else if((p==cab)&&(cab.sig!=null)){
                cab=cab.sig;
                p.sig=null;
                p=null;
            }
            else if(p.sig==null){
                d=getAnterior(p);
                d.sig=null;
                p=null;
            }else{
                d=getAnterior(p);
                d.sig=p.sig;
                p.sig=null;
                p=null;
            }
            JOptionPane.showMessageDialog(null, 
                "Nodo con Correo electronico "+Correo_e+" eliminado!");
        }
    }
     // Usar un ArrayList para almacenar los datos de Usuario
     private List<Usuario> usuariosList = new ArrayList<>();

     public void setRegistrarFilaTable(DefaultTableModel miModelo, int pFila, Nodo1<Usuario> p){
     // Registra el usuario en el ArrayList
     usuariosList.add(p.dato);  // Aquí puedes agregar el dato a una lista interna si deseas trabajar con los datos
    
     // Si deseas seguir utilizando DefaultTableModel en lugar de ObservableList:
     miModelo.setValueAt(p.dato.Nombre_C, pFila, 0);
     miModelo.setValueAt(p.dato.Correo_E, pFila, 1);
     miModelo.setValueAt(p.dato.Contraseña, pFila, 2); 
    
     public void setllenarTable(TableView<Usuario> tab) {
        // Crear la lista observable de usuarios
        ObservableList<Usuario> usuariosList = FXCollections.observableArrayList(
            new Usuario("Juan Pérez", "juan.perez@email.com", "12345"));
        
        // Establecer los elementos en la tabla
        tab.setItems(usuariosList);

        // Definir las columnas y asignarles la propiedad correspondiente
        TableColumn<Usuario, String> colNombre = new TableColumn<>("Nombre Completo");
        colNombre.setCellValueFactory(new PropertyValueFactory<>("Nombre_C"));
        
        TableColumn<Usuario, String> colCorreo = new TableColumn<>("Correo Electronico");
        colCorreo.setCellValueFactory(new PropertyValueFactory<>("Correo_E"));
        
        TableColumn<Usuario, String> colContraseña = new TableColumn<>("Contraseña");
        colContraseña.setCellValueFactory(new PropertyValueFactory<>("Contraseña"));
        
        // Agregar las columnas a la tabla
        tab.getColumns().addAll(colNombre, colCorreo, colContraseña);
    }
  }
}

