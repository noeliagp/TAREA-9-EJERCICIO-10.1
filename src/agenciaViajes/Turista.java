package agenciaViajes;

public class Turista {
    int codigoTurista;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;

    public Turista(int codigoTurista, String nombre, String apellidos, String direccion, String telefono) {
        this.codigoTurista = codigoTurista;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "\nTurista{" +
                "codigoTurista=" + codigoTurista +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                "}\n";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
