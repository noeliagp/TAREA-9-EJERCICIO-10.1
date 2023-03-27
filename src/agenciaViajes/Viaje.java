package agenciaViajes;

public class Viaje {
    private enum ClaseVuelo{
        PRIMERA,
        TURISTA
    }
    private enum RegimenHospedaje{
        MEDIA_PENSION,
        PENSION_COMPLETA
    }

    private Turista turista;
    private Vuelo vuelo;
    private Hotel hotel;

    private ClaseVuelo claseVuelo;
    private RegimenHospedaje regimenHospedaje;
    private String llegadaHotel;
    private String salidaHotel;


    public Viaje(Turista turista, Vuelo vuelo, Hotel hotel, ClaseVuelo claseVuelo, RegimenHospedaje regimenHospedaje, String llegadaHotel, String salidaHotel) {
        this.turista = turista;
        this.vuelo = vuelo;
        this.hotel = hotel;
        this.claseVuelo = claseVuelo;
        this.regimenHospedaje = regimenHospedaje;
        this.llegadaHotel = llegadaHotel;
        this.salidaHotel = salidaHotel;
    }

    public static ClaseVuelo ObtenerClaseVuelo(String claseVuelo){
        switch (claseVuelo){
            case "primera":
                return ClaseVuelo.PRIMERA;
            case "turista":
                return ClaseVuelo.TURISTA;
            default: throw new IllegalArgumentException("No se ha seleccionado una opcion valida");
        }
    }

    public static RegimenHospedaje ObtenerRegimenHospedaje(String regimenHospedaje){
        switch (regimenHospedaje){
            case "media pension":
                return RegimenHospedaje.MEDIA_PENSION;
            case "pension completa":
                return RegimenHospedaje.PENSION_COMPLETA;
            default: throw new IllegalArgumentException("No se ha seleccionado una opcion valida");
        }
    }

    @Override
    public String toString() {
        return "\nViaje{\n" +
                "turista=" + turista +
                ", vuelo=" + vuelo +
                ", hotel=" + hotel +
                ", claseVuelo=" + claseVuelo +
                ", regimenHospedaje=" + regimenHospedaje +
                ", llegadaHotel='" + llegadaHotel + '\'' +
                ", salidaHotel='" + salidaHotel + '\'' +
                "}\n";
    }

    public void setTurista(Turista turista) {
        this.turista = turista;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void setClaseVuelo(ClaseVuelo claseVuelo) {
        this.claseVuelo = claseVuelo;
    }

    public void setRegimenHospedaje(RegimenHospedaje regimenHospedaje) {
        this.regimenHospedaje = regimenHospedaje;
    }

    public void setLlegadaHotel(String llegadaHotel) {
        this.llegadaHotel = llegadaHotel;
    }

    public void setSalidaHotel(String salidaHotel) {
        this.salidaHotel = salidaHotel;
    }
}
