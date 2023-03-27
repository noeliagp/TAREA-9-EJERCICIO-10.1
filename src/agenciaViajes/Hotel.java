package agenciaViajes;

public class Hotel {
    private int codigoHotel;
    private String nombreHotel;
    private String direccionHotel;
    private String ciudad;
    private String telefono;
    private int plazasDisponibles;

    public Hotel(int codigoHotel, String nombreHotel, String direccionHotel, String ciudad, String telefono, int plazasDisponibles) {
        this.codigoHotel = codigoHotel;
        this.nombreHotel = nombreHotel;
        this.direccionHotel = direccionHotel;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.plazasDisponibles = plazasDisponibles;
    }

    @Override
    public String toString() {
        return "\nHotel{" +
                "codigoHotel=" + codigoHotel +
                ", nombreHotel='" + nombreHotel + '\'' +
                ", direccionHotel='" + direccionHotel + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", telefono='" + telefono + '\'' +
                ", plazasDisponibles=" + plazasDisponibles +
                "}\n";
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setPlazasDisponibles(int plazasDisponibles) {
        this.plazasDisponibles = plazasDisponibles;
    }
}
