package agenciaViajes;

public class Vuelo {
    private int codigoVuelo;
    private String fechaHora;
    private String origen;
    private String destino;
    private int plazasTotales;
    private int getPlazasTurista;

    public Vuelo(int codigoVuelo, String fechaHora, String origen, String destino, int plazasTotales, int getPlazasTurista) {
        this.codigoVuelo = codigoVuelo;
        this.fechaHora = fechaHora;
        this.origen = origen;
        this.destino = destino;
        this.plazasTotales = plazasTotales;
        this.getPlazasTurista = getPlazasTurista;
    }

    @Override
    public String toString() {
        return "\nVuelo{" +
                "codigoVuelo=" + codigoVuelo +
                ", fechaHora='" + fechaHora + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", plazasTotales=" + plazasTotales +
                ", getPlazasTurista=" + getPlazasTurista +
                "}\n";
    }


    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPlazasTotales(int plazasTotales) {
        this.plazasTotales = plazasTotales;
    }

    public void setGetPlazasTurista(int getPlazasTurista) {
        this.getPlazasTurista = getPlazasTurista;
    }
}
