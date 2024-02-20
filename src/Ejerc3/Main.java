package Ejerc3;
import java.time.*;
import java.util.ArrayList;
public class Main {


    // Main.java usage of classes
        public static void main(String[] args) {
            Tren tren = new Tren(1, "Ruta 1");
            Vagon v1, v2, v3;
            v1 = new Vagon(Tvagon.PRIMERA_CLASE, 30);
            v2 = new Vagon(Tvagon.CLASE_ECONOMICA, 20);
            v3 = new Vagon(Tvagon.ECONOMICA, 10);
            tren.agregarVagon(v1);
            tren.agregarVagon(v2);
            tren.agregarVagon(v3);

            Cliente cliente = new Cliente("John Doe", 1234567890, "123 Main St", new ArrayList<String>());
            Viaje viaje = new Viaje(LocalDate.now(), LocalDateTime.now(), LocalDateTime.now(), tren);

            Asiento asiento = new Asiento(1);
            asiento.reservar();
            asiento.ocupar();
            Boleto boleto = new Boleto(cliente, viaje, asiento);
        }
    }
