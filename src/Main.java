import agenciaViajes.*;

public class Main {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel(1,"Hotel1","direccion1","ciudad1","1",100);
        Hotel hotel2 = new Hotel(2,"Hotel2","direccion2","ciudad2","2",200);
        Hotel hotel3 = new Hotel(3,"Hotel3","direccion3","ciudad3","3",300);

        Vuelo vuelo1 = new Vuelo(1,"fecha1","origen1","destino1",100,50);
        Vuelo vuelo2 = new Vuelo(2,"fecha2","origen2","destino2",200,100);
        Vuelo vuelo3 = new Vuelo(3,"fecha3","origen3","destino3",300,250);

        Turista turista1 = new Turista(1,"nombre1","apellidos1","direccion4","4");
        Turista turista2 = new Turista(2,"nombre2","apellidos2","direccion5","5");
        Turista turista3 = new Turista(3,"nombre3","apellidos3","direccion6","6");

        Viaje viaje1 = new Viaje(turista1,vuelo1,hotel1, Viaje.ObtenerClaseVuelo("primera"),Viaje.ObtenerRegimenHospedaje("pension completa"),"fecha4","fecha5");
        Viaje viaje2 = new Viaje(turista2,vuelo2,hotel2, Viaje.ObtenerClaseVuelo("turista"),Viaje.ObtenerRegimenHospedaje("pension completa"),"fecha5","fecha7");
        Viaje viaje3 = new Viaje(turista3,vuelo3,hotel3, Viaje.ObtenerClaseVuelo("primera"),Viaje.ObtenerRegimenHospedaje("media pension"),"fecha8","fecha9");

        Sucursal sucursal = new Sucursal(1,"direccion10","7");

        sucursal.AgregarViaje(viaje1);
        sucursal.AgregarViaje(viaje2);
        sucursal.AgregarViaje(viaje3);
        System.out.println(sucursal);
    }
}
