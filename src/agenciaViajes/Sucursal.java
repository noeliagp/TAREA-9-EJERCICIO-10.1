package agenciaViajes;

import java.util.ArrayList;

public class Sucursal {
    private int codigoSucursal;
    private String direccion;
    private String telefono;
    private ArrayList<Viaje> listaViajes;

    public Sucursal(int codigoSucursal, String direccion, String telefono) {
        this.codigoSucursal = codigoSucursal;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listaViajes = new ArrayList<>();
    }

    public void AgregarViaje(Viaje viajeAgregar){
        listaViajes.add(viajeAgregar);
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "codigoSucursal=" + codigoSucursal +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", listaViajes=" + listaViajes +
                '}';
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
