package Ejerc3;

public class Compra {
    public void reservarBoletos(Cliente cliente, Viaje viaje, Asiento asiento){
        Boleto boleto = new Boleto(cliente, viaje, asiento);
        asiento.reservar();
        System.out.println("Boleto reservado para el viaje " + viaje);
    }

    public void comprarBoletos(Cliente cliente, Viaje viaje, Asiento asiento) {
        Boleto boleto = new Boleto(cliente, viaje, asiento);
        asiento.ocupar();
        System.out.println("Boleto comprado para el viaje " + viaje);
    }
}
