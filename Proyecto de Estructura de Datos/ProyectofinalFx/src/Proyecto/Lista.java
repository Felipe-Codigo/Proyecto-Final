package Proyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;


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
     
    public List<Usuario> getUsuariosArrayList() {
        List<Usuario> usuarios = new ArrayList<>();
        Nodo1<Usuario> p = cab;
        while (p != null) {
            usuarios.add(p.dato);
            p = p.sig;
        }
        return usuarios;
    }
    
    public void guardarUsuariosEnArchivo() {
        List<Usuario> usuarios = getUsuariosArrayList();

    for (Usuario usuario : usuarios) {
        String correo = usuario.getCorreo_E();

        String nombreArchivo = correo+".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            
            writer.write(usuario.getCorreo_E() + "," + usuario.getNombre_C() + "," + usuario.getContraseña());
            writer.newLine();  

            JOptionPane.showMessageDialog(null, "Usuario " + correo + " guardado correctamente en el archivo " + nombreArchivo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el usuario " + correo + " en el archivo: " + e.getMessage());
        }
     }
    }
    
      public Usuario cargarUsuariosDesdeArchivo(String correo) {
      String nombreArchivo = correo+ ".txt"; 
      try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(",");
            if (datos.length == 3) {
                
                return new Usuario(datos[0], datos[1], datos[2]); 
            }
        }
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al cargar usuario desde el archivo: " + e.getMessage());
      }
      return null; 
    }
      
}