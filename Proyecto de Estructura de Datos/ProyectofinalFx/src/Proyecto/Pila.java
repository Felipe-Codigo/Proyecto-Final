package Proyecto;

import java.text.DecimalFormat;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
    
    public Nodo2<Producto> getBuscarNombre_P(String Pro){
        if(getEsPilaVacia())
            return null;
        else{
            Nodo2<Producto> p=tope;
            do{
                if(p.dato.Nombre_P.equals(Pro))
                    return p;
                else
                    p=p.sig;
            }while(p!=tope);
            return null;
        }
    }
    
    public Producto getCrearProducto(){
        Button
        Producto Pro=null;
        Nodo2<Producto> buscar=null;
        try{
            buscar=getBuscarNombre_P(jtfIdtiq.getText());
            if(buscar!=null){
                JOptionPane.showMessageDialog(null, 
                    "El idTique ya existe, intente nuevamente!");
                return null;
            }
            else{
                Pro=new Producto(
                    jtfIdtiq.getText(),
                    jtfDestino.getText(),
                    Float.parseFloat(jtfCosto.getText())    
                );
                return tiq;
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
    
    public void setPush(){
        Producto Pro=getCrearProducto();
        if(Pro!=null){
            Nodo2<Producto> info=new Nodo2(Pro);
            if(tope==null){
                tope=info;
                tope.sig=tope;
            }else{
                Nodo2<Producto> base=getBase();
                info.sig=tope;
                tope=info;
                base.sig=tope;
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
    
    //Este método registra un dato al JTable
    public void setRegistrarFilaTable(DefaultTableModel miModelo,
        int pFila, Nodo2<Producto> p){
        
        miModelo.setValueAt(p.dato.Nombre_P, pFila, 0);
        miModelo.setValueAt(p.dato.Tipo_P, pFila, 1);
        DecimalFormat df = new DecimalFormat(".00");
        miModelo.setValueAt(df.format (p.dato.Precio_P), pFila, 2);
        
    }    
    
    //Este método actualiza el contenido de la fila
    //de un Table a partir de su modelo de datos 
    //(TableModel)
    public void setLlenarTable(TableView tab) {
        int posFilaU = 0; //Este índice recorre los elementos de la Pila Tabla
        Nodo2<Producto> p = tope;  //Este nodo me mueve posición x posición en la fista
        DefaultTableModel miModelo = new DefaultTableModel();

        miModelo.addColumn("IdTiquete");
        miModelo.addColumn("Destino");
        miModelo.addColumn("Valor tiquete");

        if (tope == null) {
            tab.setModel(miModelo);
        } else {
            do {
                miModelo.addRow(new Object[]{"", "", ""});
                setRegistrarFilaTable(miModelo, posFilaU, p);
                p = p.sig;
                posFilaU++;
            } while (p != tope);
            tab.setModel(miModelo);
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
