package Proyecto;

public class Producto {
    
    String Nombre_P;
    String Tipo_P;
    int Precio_P;

    public Producto(String Nombre_P, String Tipo_P, int Precio_P) {
        this.Nombre_P = Nombre_P;
        this.Tipo_P = Tipo_P;
        this.Precio_P = Precio_P;
    }

    public String getNombre_P() {
        return Nombre_P;
    }

    public String getTipo_P() {
        return Tipo_P;
    }

    public int getPrecio_P() {
        return Precio_P;
    }

    public void setNombre_P(String Nombre_P) {
        this.Nombre_P = Nombre_P;
    }

    public void setTipo_P(String Tipo_P) {
        this.Tipo_P = Tipo_P;
    }

    public void setPrecio_P(int Precio_P) {
        this.Precio_P = Precio_P;
    }
    
    
}
