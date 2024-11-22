
package Proyecto;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.swing.JOptionPane;

public class Cola {
    Nodo3<Producto> inicio;
    
    Cola() {
        inicio = null;
    }

    public boolean getEsColaVacia() {
        return inicio == null ? true : false;
    }

    public int getLongCola() {
        if (getEsColaVacia()) {
            return 0;
        } else {
            int cont = 0;
            Nodo3<Producto> p = inicio;
            do {
                cont++;
                p = p.sig;
            } while (p != inicio);
            return cont;
        }
    }

    public Nodo3<Producto> getBuscarId_P(String Id_P) {
        if (getEsColaVacia()) {
            return null;
        } else {
            Nodo3<Producto> p = inicio;
            do {
                if (p.dato.Id_P.equals(Id_P)) {
                    return p;
                } else {
                    p = p.sig;
                }
            } while (p != inicio);
            return null;
        }
    }

    public Producto getCrearProducto(String Id_P, String Nombre_P, String Tipo_P, int Precio_P) {
        Producto info = null;
        Nodo3<Producto> buscar = null;
        try {
            buscar = getBuscarId_P(Id_P);
            if (buscar != null) {
                JOptionPane.showMessageDialog(null, 
                    "El Producto ya existe, intente nuevamente!");
                return null;
            } else {
                info = new Producto(Id_P, Nombre_P, Tipo_P, Precio_P);   
                
                return info;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Error: " + e + "\n"
                    + "El producto no fue creada!");
            return null;
        }
    }

    public void setAddCola(String Id_P, String Nombre_P, String Tipo_P, int Precio_P) {
        try {
            if (getBuscarId_P(Id_P)!=null) {
                JOptionPane.showMessageDialog(null, 
                    "El Producto ya existe, intente nuevamente!");
                return;
            }
            
            Producto miProducto = new Producto(Id_P, Nombre_P, Tipo_P, Precio_P);
                    
            if (miProducto != null) {
                Nodo3<Producto> info = new Nodo3<>(miProducto);
                if (getEsColaVacia()) {
                    inicio = info;
                    inicio.sig = inicio.ant = inicio;
                } else {
                    info.ant = inicio.ant;
                    info.sig = inicio;
                    inicio.ant.sig = info;
                    inicio.ant = info;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
        }
    }

    public void setAtender() {
        if (getEsColaVacia()) {
            JOptionPane.showMessageDialog(null,
                    "La cola esta vacía, sin nada que atender!");
        } else {
            Nodo3<Producto> p = inicio;
            String id_p = p.dato.Id_P;
            if (inicio.sig == inicio) {
                inicio = null;
            } else {
                inicio = inicio.sig;
                inicio.ant = p.ant;
                inicio.ant.sig = inicio;
                p.sig = p.ant = null;
                p = null;
            }
            JOptionPane.showMessageDialog(null,
                    "Nodo atendido!");
        }
    }
    
    public void seteliminarNodo(String Id_P) {
        if (getEsColaVacia()) {
            JOptionPane.showMessageDialog(null, "La cola está vacía, no se puede eliminar nada.");
            return;
        }

        Nodo3<Producto> nodoAEliminar = getBuscarId_P(Id_P);
        if (nodoAEliminar == null) {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna Producto con ese número.");
            return;
        }

        if (nodoAEliminar == inicio && inicio.sig == inicio) {
            
            inicio = null;
        } else {
            
            nodoAEliminar.ant.sig = nodoAEliminar.sig;
            nodoAEliminar.sig.ant = nodoAEliminar.ant;
            if (nodoAEliminar == inicio) {
                inicio = nodoAEliminar.sig;
            }
            nodoAEliminar.sig=nodoAEliminar.ant=null;
            nodoAEliminar=null;
        }
    }
    
    public void setinvertirCola() {
        if (getEsColaVacia() || inicio.sig == inicio) {
            return;
        }

        Nodo3<Producto> actual = inicio;
        Nodo3<Producto> temp = null;
        Nodo3<Producto> ultimo = inicio.ant; 
        
        do {
            temp = actual.sig; 
            actual.sig = actual.ant;
            actual.ant = temp;

            actual = temp;
        } while (actual != inicio);
        
        inicio = ultimo;
    }
    
    public void setfusionarColas(Cola otraCola) {
        if (getEsColaVacia()) {
            inicio = otraCola.inicio;
        } else if (!otraCola.getEsColaVacia()) {
            
            Nodo3<Producto> finalActual = inicio.ant;
            
            Nodo3<Producto> finalOtra = otraCola.inicio.ant;
            
            finalActual.sig = otraCola.inicio;
            otraCola.inicio.ant = finalActual;
            
            finalOtra.sig = inicio;
            inicio.ant = finalOtra;
        }

        JOptionPane.showMessageDialog(null, "Colas fusionadas con éxito.");
    }
    
    private Nodo3<Producto> mergeSort(Nodo3<Producto> head) {
        
        if (head == null || head.sig == head) {
            return head;
        }
        
        Nodo3<Producto> middle = getMiddle(head);
        Nodo3<Producto> nextOfMiddle = middle.sig;
        
        middle.sig = null;
        
        Nodo3<Producto> left = mergeSort(head);
        Nodo3<Producto> right = mergeSort(nextOfMiddle);
        
        return sortedMerge(left, right);
    }
    
    private Nodo3<Producto> sortedMerge(Nodo3<Producto> left, Nodo3<Producto> right) {
        
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        Nodo3<Producto> result;
        
            result = right;
            result.sig = sortedMerge(left, right.sig);
            result.sig.ant = result; 
        return result;
    }
    
    private Nodo3<Producto> getMiddle(Nodo3<Producto> head) {

        if (head == null) {
            return null;
        }
        
        Nodo3<Producto> slow = head;  
        Nodo3<Producto> fast = head.sig; 
        
        while (fast != null && fast.sig != null && fast != head && fast.sig != head) {
            slow = slow.sig;
            fast = fast.sig.sig;
        }

        return slow;
    }
    
    public void llenarTablaCola(TableView<Producto> table) {
    ObservableList<Producto> listaProductos = FXCollections.observableArrayList();
    
    if (!getEsColaVacia()) {
        Nodo3<Producto> p = inicio;
        do {
            listaProductos.add(p.dato);
            p = p.sig;
        } while (p != inicio);
    }
    table.getItems().clear();
    table.setItems(listaProductos);
    
    TableColumn<Producto, String> FXidpro = new TableColumn<>("Producto");
    FXidpro.setCellValueFactory(new PropertyValueFactory<>("Id_P"));

    TableColumn<Producto, String> FXNombre_P = new TableColumn<>("Nombre");
    FXNombre_P.setCellValueFactory(new PropertyValueFactory<>("Nombre_P"));

    TableColumn<Producto, String> FXTipoP = new TableColumn<>("Tipo");
    FXTipoP.setCellValueFactory(new PropertyValueFactory<>("Tipo_P"));

    TableColumn<Producto, Integer> FXPrecio = new TableColumn<>("Precio");
    FXPrecio.setCellValueFactory(new PropertyValueFactory<>("Precio_P"));

    if (table.getColumns().isEmpty()) {
        table.getColumns().addAll(FXidpro, FXNombre_P, FXTipoP, FXPrecio);
        JOptionPane.showMessageDialog(null, " SE AGREGO");
    }else{
        table.getColumns().addAll(FXidpro, FXNombre_P, FXTipoP, FXPrecio);
        
      }
    }
    
    
    
}
