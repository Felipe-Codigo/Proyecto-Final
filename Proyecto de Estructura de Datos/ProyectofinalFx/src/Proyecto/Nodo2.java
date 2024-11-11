package Proyecto;

public class Nodo2 <P>{
    P dato;
    Nodo2<P> sig;

    public Nodo2(P dato) {
        this.dato = dato;
        sig=null;
    }
}
