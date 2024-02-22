package Ejerc3;
import java.util.StringJoiner;
public class Boleto {


        private Cliente cliente;
        private Viaje viaje;
        private Asiento asiento;

        public Boleto(Cliente cliente, Viaje viaje, Asiento asiento) {
            this.cliente = cliente;
            this.viaje = viaje;
            this.asiento = asiento;
        }

        public Cliente obtenerCliente() {
            return this.cliente;
        }

        public Viaje obtenerViaje() {
            return this.viaje;
        }

        public Asiento obtenerAsiento() {
            return this.asiento;
        }

    @Override
    public String toString() {
        return "Boleto{" +
                "cliente=" + cliente +
                ", viaje=" + viaje +
                ", asiento=" + asiento +
                '}';
    }
}
