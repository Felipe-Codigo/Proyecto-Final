package Proyecto;

public class Usuario {
    
    String Nombre_C;
    String Correo_E;
    String Contraseña;

    public Usuario(String Nombre_C, String Correo_E, String Contraseña) {
        this.Nombre_C = Nombre_C;
        this.Correo_E = Correo_E;
        this.Contraseña = Contraseña;
    }

    public String getNombre_C() {
        return Nombre_C;
    }

    public String getCorreo_E() {
        return Correo_E;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setNombre_C(String Nombre_C) {
        this.Nombre_C = Nombre_C;
    }

    public void setCorreo_E(String Correo_E) {
        this.Correo_E = Correo_E;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
}

