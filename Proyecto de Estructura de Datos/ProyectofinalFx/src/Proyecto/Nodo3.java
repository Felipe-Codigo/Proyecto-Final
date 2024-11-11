package Proyecto;

public class Nodo3 <P> {
    P dato;
    Nodo3<P> sig;
    Nodo3<P> ant;

    public Nodo3(P dato) {
        this.dato = dato;
        sig=ant=null;
    }
}
