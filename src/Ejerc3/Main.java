package Ejerc3;
import java.time.*;
import java.util.ArrayList;
public class Main {


    // Main.java usage of classes
        public static void main(String[] args) {
            Tren tren = new Tren(1, "Ruta 1");

            Vagon v1, v2, v3;
            v1 = new Vagon("1","Vagon Lujo", 150);
            v2 = new Vagon("2", "Vagon Ejecutivo", 5);
            v3 = new Vagon("3", "Vagon Turista", 20);

            Cliente cliente = new Cliente("John Doe", 1234567890, "123 Main St", new ArrayList<String>());
            Viaje viaje = new Viaje(LocalDate.now(), LocalDateTime.now(), LocalDateTime.now(), tren);

            Asiento asiento = new Asiento(1);
            asiento.reservar();
            asiento.ocupar();
            Boleto boleto = new Boleto(cliente, viaje, asiento);
            Compra compraBoletos = new Compra();
            compraBoletos.reservarBoletos(cliente, viaje, asiento);
            compraBoletos.comprarBoletos(cliente, viaje, asiento);
        }
    }
