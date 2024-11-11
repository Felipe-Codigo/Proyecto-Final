package Proyecto;

public class Nodo1 <U>{
    U dato;
    Nodo1<Usuario> sig;

    public Nodo1(U info) {
        dato = info;
        sig = null;
    }
}
