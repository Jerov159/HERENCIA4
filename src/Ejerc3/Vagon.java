package Ejerc3;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
public class Vagon {
        private Tvagon tipo;
        private int capacidad;
        private List<Asiento> listaAsientos;

        public Vagon(Tvagon tipo, int capacidad) {
            this.tipo = tipo;
            this.capacidad = capacidad;
            this.listaAsientos = new ArrayList<Asiento>();
        }

        public Tvagon obtenerTipo() {
            return this.tipo;
        }

        public int obtenerCapacidad() {
            return this.capacidad;
        }

        public Asiento obtenerAsiento(int numero) {
            for (Asiento asiento : listaAsientos) {
                if (asiento.obtenerNumero() == numero) {
                    return asiento;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            StringJoiner joiner = new StringJoiner("\n");
            joiner.add(String.format("%-30s: %s", "tipo", tipo));
            joiner.add(String.format("%-30s: %s", "capacidad", capacidad));
            joiner.add("Asientos:");
            for (Asiento a : listaAsientos) {
                joiner.add(a.toString());
            }
            return joiner.toString();
        }
    }
