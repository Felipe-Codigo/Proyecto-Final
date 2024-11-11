package Proyecto;

import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
    
    //Este método registra un dato al Table
    public void setRegistrarFilaTable(DefaultTableModel miModelo,
        int pFila, Nodo1<Usuario> p){
        
        miModelo.setValueAt(p.dato.Nombre_C, pFila, 0);
        miModelo.setValueAt(p.dato.Correo_E, pFila, 1);
        miModelo.setValueAt(p.dato.Contraseña, pFila, 2);
        
    }    
    
    //Este método actualiza el contenido de la fila
    //de un Table a partir de su modelo de datos 
    //(TableModel)
    public void setLlenarJTable(JTable tab){
        int posFilaU=0; //Este índice recorre los elementos de la fila Tabla
        Nodo1<Usuario> p=cab;  //Este nodo me mueve posición x posición en la lista
        DefaultTableModel miModelo=new DefaultTableModel();

        miModelo.addColumn("IdTiquete");
        miModelo.addColumn("Destino");
        miModelo.addColumn("Valor tiquete");  
        
        while(p!=null){                        
            miModelo.addRow(new Object[]{"", "", ""});              
            setRegistrarFilaTable(miModelo,posFilaU,p);            
            p=p.sig;
            posFilaU++;
        }
        tab.setModel(miModelo);
    } 
}

