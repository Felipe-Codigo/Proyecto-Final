package Proyecto;

import java.text.DecimalFormat;
import java.util.HashMap;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Cola {
    Nodo3<Producto> inicio;
    HashMap<String, Nodo3<Producto>> indiceProducto;  // Tabla hash para buscar nodos por número de cuenta

    Cola() {
        inicio = null;
        indiceProducto = new HashMap<>();  // Inicializa la tabla hash
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

    public Nodo3<Producto> getBuscarId_P(String Id) {
        if (getEsColaVacia()) {
            return null;
        } else {
            Nodo3<Producto> p = inicio;
            do {
                if (p.dato.Nombre_P.equals(Id)) {
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
                    "El idTique ya existe, intente nuevamente!");
                return null;
            } else {
                info = new Producto(Id_P, Nombre_P, Tipo_P, Precio_P);   
                
                return info;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Error: " + e + "\n"
                    + "La cuenta no fue creada!");
            return null;
        }
    }

    public void setAddCola(String Id_P, String Nombre_P, String Tipo_P, int Precio_P) {
        try {
            // Verificar si ya existe una cuenta con ese número en la Cola
            if (getBuscarId_P(Id_P)!=null) {
                JOptionPane.showMessageDialog(null, 
                    "El idTique ya existe, intente nuevamente!");
                return;
            }

            // Crear una nueva cuenta
            Producto miProducto = new Producto(Id_P, Nombre_P, Tipo_P, Precio_P);
                    

            if (miProducto != null) {
                Nodo3<Producto> info = new Nodo3<>(miProducto);
                if (getEsColaVacia()) {
                    inicio = info;
                    inicio.sig = inicio.ant = inicio;  // Conexión circular
                } else {
                    info.ant = inicio.ant;
                    info.sig = inicio;
                    inicio.ant.sig = info;
                    inicio.ant = info;
                }
                // Agrega el nodo a la tabla hash para que sea fácil de buscar
                indiceProducto.put(miProducto.Nombre_P, info);
                JOptionPane.showMessageDialog(null, "Elemento registrado correctamente.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
        }
    }

    // Mejorado: Método para agregar un nodo a la cola y actualizar la tabla hash
    public void setAddColaH(String Id_P, String Nombre_P, String Tipo_P, int Precio_P) {
        try {
            // Verificar si ya existe una cuenta con ese número en la tabla hash
            if (indiceProducto.containsKey(Id_P)) {
                JOptionPane.showMessageDialog(null,
                        "Error: Ya existe una cuenta con ese número. Ingrese un número de cuenta diferente.");
           
                return;  // Salir sin agregar la cuenta
            }

            // Crear una nueva cuenta
            Producto miProducto = new Producto(Id_P, Nombre_P, Tipo_P, Precio_P);

            if (miProducto != null) {
                Nodo3<Producto> info = new Nodo3<>(miProducto);
                if (getEsColaVacia()) {
                    inicio = info;
                    inicio.sig = inicio.ant = inicio;  // Conexión circular
                } else {
                    info.ant = inicio.ant;
                    info.sig = inicio;
                    inicio.ant.sig = info;
                    inicio.ant = info;
                }
                // Agrega el nodo a la tabla hash para que sea fácil de buscar
                indiceProducto.put(miProducto.Nombre_P, info);
                JOptionPane.showMessageDialog(null, "Elemento registrado correctamente.");
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
            // Eliminamos el nodo de la tabla hash
            indiceProducto.remove(id_p);
            JOptionPane.showMessageDialog(null,
                    "Nodo atendido!");
        }
    }

    // Método para eliminar un nodo específico por número de cuenta
    public void seteliminarNodo(String Id_P) {
        if (getEsColaVacia()) {
            JOptionPane.showMessageDialog(null, "La cola está vacía, no se puede eliminar nada.");
            return;
        }

        Nodo3<Producto> nodoAEliminar = getBuscarId_P(Id_P);  // Buscamos el nodo a eliminar
        if (nodoAEliminar == null) {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna cuenta con ese número.");
            return;
        }

        if (nodoAEliminar == inicio && inicio.sig == inicio) {
            // Si solo hay un nodo, vaciamos la cola
            inicio = null;
        } else {
            // Actualizamos los punteros de los nodos adyacentes
            nodoAEliminar.ant.sig = nodoAEliminar.sig;
            nodoAEliminar.sig.ant = nodoAEliminar.ant;
            if (nodoAEliminar == inicio) {
                inicio = nodoAEliminar.sig;
            }
            nodoAEliminar.sig=nodoAEliminar.ant=null;
            nodoAEliminar=null;
        }

        // Eliminamos el nodo de la tabla hash
        indiceProducto.remove(Id_P);
        JOptionPane.showMessageDialog(null, "Nodo eliminado con éxito.");
    }


    // Método para invertir el orden de los nodos en la cola circular doblemente enlazada
    public void setinvertirCola() {
        if (getEsColaVacia() || inicio.sig == inicio) {
            // Si la cola está vacía o tiene un solo nodo, no es necesario hacer nada
            return;
        }

        Nodo3<Producto> actual = inicio;
        Nodo3<Producto> temp = null;
        Nodo3<Producto> ultimo = inicio.ant; // Referencia al último nodo de la cola antes de invertir

        do {
            // Intercambiamos los punteros 'sig' y 'ant' de cada nodo
            temp = actual.sig;       // Guardamos el siguiente nodo antes de modificar los punteros
            actual.sig = actual.ant;  // Invertimos el puntero 'sig', ahora apunta hacia atrás
            actual.ant = temp;        // Invertimos el puntero 'ant', ahora apunta hacia adelante

            actual = temp;  // Avanzamos al siguiente nodo en la secuencia original
        } while (actual != inicio);  // Continuamos hasta volver al nodo inicial

        // Después de invertir los punteros, actualizamos el nodo 'inicio' para que apunte al que era el último nodo
        inicio = ultimo;  // El último nodo ahora es el nuevo inicio
    }

    // Método para encontrar el nodo con el saldo más alto
    public Nodo3<Producto> getNodoConMayorSaldo() {
        if (getEsColaVacia()) {
            JOptionPane.showMessageDialog(null, "La cola está vacía, no hay saldos que comparar.");
            return null;
        }

        Nodo3<Producto> mayorSaldoNodo = inicio;  // Empezamos con el primer nodo
        Nodo3<Producto> actual = inicio.sig;      // Empezamos desde el segundo nodo

        // Recorremos toda la cola
        do {
            if (actual.dato.Precio_P > mayorSaldoNodo.dato.Precio_P) {
                mayorSaldoNodo = actual;  // Actualizamos si encontramos un saldo mayor
            }
            actual = actual.sig;
        } while (actual != inicio);

        JOptionPane.showMessageDialog(null, "El saldo más alto es de la cuenta: " + mayorSaldoNodo.dato.Nombre_P);
        return mayorSaldoNodo;
    }

    // Método para fusionar dos colas
    public void setfusionarColas(Cola otraCola) {
        if (getEsColaVacia()) {
            // Si la cola actual está vacía, simplemente tomamos la otra cola
            inicio = otraCola.inicio;
        } else if (!otraCola.getEsColaVacia()) {
            // Si ambas colas tienen elementos, hacemos la fusión

            // Nodo final de la cola actual
            Nodo3<Producto> finalActual = inicio.ant;
            // Nodo final de la otra cola
            Nodo3<Producto> finalOtra = otraCola.inicio.ant;

            // Conectamos el último nodo de la cola actual con el primero de la otra cola
            finalActual.sig = otraCola.inicio;
            otraCola.inicio.ant = finalActual;

            // Conectamos el último nodo de la otra cola con el primero de la cola actual
            finalOtra.sig = inicio;
            inicio.ant = finalOtra;
        }

        // Fusionamos los índices de las dos colas en la tabla hash
        indiceProducto.putAll(otraCola.indiceProducto);
        JOptionPane.showMessageDialog(null, "Colas fusionadas con éxito.");
    }
    
    // Este método registra los datos de un nodo de la cola en una fila de JTable
    public void setRegistrarFilaJTable(DefaultTableModel miModelo, int pFila, Nodo3<Producto> p) {
        // Colocamos los valores de la cuenta en las celdas de la tabla
        miModelo.setValueAt(p.dato.Nombre_P, pFila, 0);  // Número de cuenta
        miModelo.setValueAt(p.dato.Tipo_P, pFila, 1);  // Nombre del cliente
        DecimalFormat df = new DecimalFormat(".00");
        miModelo.setValueAt(df.format(p.dato.Precio_P), pFila, 2);  // Saldo formateado
    }

    // Este método actualiza el contenido del JTable a partir de los datos de la cola
    public void setLlenarJTable(JTable tab) {
        // Reiniciamos el modelo de la tabla para limpiarla antes de llenarla
        DefaultTableModel miModelo = new DefaultTableModel();
        
        // Añadimos las columnas al modelo de la tabla
        miModelo.addColumn("Número de Cuenta");
        miModelo.addColumn("Nombre del Cliente");
        miModelo.addColumn("Saldo");
        miModelo.addColumn("Estado");

        // Si la cola está vacía, mostramos la tabla vacía
        if (getEsColaVacia()) {
            tab.setModel(miModelo);  // Si la cola está vacía, la tabla se limpia y no se agregan filas
            return;
        }

        Nodo3<Producto> p = inicio;  // Nodo que recorrerá la cola
        int posFilaT = 0;  // Este índice recorre los elementos de las filas de la tabla

        // Recorremos la cola y agregamos los datos al modelo de la tabla
        do {
            // Añadimos una nueva fila vacía al modelo
            miModelo.addRow(new Object[]{"", "", "", ""});
            // Registramos los valores de la cuenta en la fila de la tabla
            setRegistrarFilaJTable(miModelo, posFilaT, p);
            // Avanzamos al siguiente nodo
            p = p.sig;
            posFilaT++;  // Aumentamos el contador de filas
        } while (p != inicio);  // Continuamos hasta volver al inicio (cola circular)

        // Actualizamos el modelo de la tabla
        tab.setModel(miModelo);
    }


    // Método mergeSort: Divide la lista en dos mitades y luego las ordena
    private Nodo3<Producto> mergeSort(Nodo3<Producto> head) {
        // Si la lista está vacía o tiene un solo nodo, no necesita ordenarse
        if (head == null || head.sig == head) {
            return head;  // Retorna tal cual si la lista es vacía o de un solo nodo
        }

        // Encuentra el nodo del medio de la lista
        Nodo3<Producto> middle = getMiddle(head);
        Nodo3<Producto> nextOfMiddle = middle.sig;  // Nodo que sigue al medio

        // Separa la lista en dos mitades cortando el enlace
        middle.sig = null;

        // Llama recursivamente a mergeSort para ordenar cada mitad
        Nodo3<Producto> left = mergeSort(head);  // Mitad izquierda
        Nodo3<Producto> right = mergeSort(nextOfMiddle);  // Mitad derecha

        // Fusiona las dos mitades ordenadas
        return sortedMerge(left, right);
    }

    // Método sortedMerge: Fusiona dos listas ordenadas en una sola lista ordenada
    private Nodo3<Producto> sortedMerge(Nodo3<Producto> left, Nodo3<Producto> right) {
        // Si una de las listas está vacía, retorna la otra
        if (left == null) {
            return right;  // Si la izquierda está vacía, retorna la derecha
        }
        if (right == null) {
            return left;  // Si la derecha está vacía, retorna la izquierda
        }

        Nodo3<Producto> result;  // Nodo que guardará el resultado de la fusión

        // Compara los saldos de las dos listas y elige el menor
        if (left.dato.Precio_P <= right.dato.Precio_P) {  // Si el saldo de la izquierda es menor o igual
            result = left;  // El nodo izquierdo se pone primero
            result.sig = sortedMerge(left.sig, right);  // Sigue fusionando con el siguiente de la izquierda
            result.sig.ant = result;  // Ajusta el puntero anterior para mantener la lista doblemente enlazada
        } else {
            result = right;  // El nodo derecho se pone primero
            result.sig = sortedMerge(left, right.sig);  // Sigue fusionando con el siguiente de la derecha
            result.sig.ant = result;  // Ajusta el puntero anterior para mantener la lista doblemente enlazada
        }
        return result;  // Retorna el nodo con el menor saldo
    }

    // Método getMiddle: Encuentra el nodo del medio de la lista
    private Nodo3<Producto> getMiddle(Nodo3<Producto> head) {
        // Si la lista está vacía, no hay "medio"
        if (head == null) {
            return null;
        }

        // Usa dos punteros, uno lento (slow) y otro rápido (fast)
        Nodo3<Producto> slow = head;  // Avanza de uno en uno
        Nodo3<Producto> fast = head.sig;  // Avanza de dos en dos

        // Recorre la lista hasta que fast llegue al final o al penúltimo nodo
        while (fast != null && fast.sig != null && fast != head && fast.sig != head) {
            slow = slow.sig;  // El puntero lento avanza de uno en uno
            fast = fast.sig.sig;  // El puntero rápido avanza de dos en dos
        }

        return slow;  // El puntero lento estará en el nodo del medio
    }
}
