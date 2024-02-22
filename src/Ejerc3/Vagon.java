package Ejerc3;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
public class Vagon {
        private Compra tipo;
        private int capacidad;
        private List<Asiento> listaAsientos;

        public Vagon(String id, String nombre, int capacidad) {
            this.tipo = tipo;
            this.capacidad = capacidad;
            this.listaAsientos = new ArrayList<Asiento>();
        }

    public Compra getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public List<Asiento> getListaAsientos() {
        return listaAsientos;
    }
}
