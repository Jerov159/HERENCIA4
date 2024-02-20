package Ejerc3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.StringJoiner;
public class Tren {
        private int numero;
        private String ruta;
        private Collection<Vagon> vagones;

        public Tren(int numero, String ruta) {
            this.numero = numero;
            this.ruta = ruta;
            this.vagones = new ArrayList<Vagon>();
        }

        public int obtenerNumero() {
            return this.numero;
        }

        public String obtenerRuta() {
            return this.ruta;
        }

        public Vagon obtenerVagon(Tvagon tipoVagon) {
            Vagon vagon = null;
            for (Vagon v : vagones) {
                if (v.obtenerTipo().equals(tipoVagon)) {
                    vagon = v;
                    break;
                }
            }
            return vagon;
        }

        public void agregarVagon(Vagon vagon){
            this.vagones.add(vagon);
        }

        @Override
        public String toString() {
            StringJoiner joiner = new StringJoiner("\n");
            joiner.add(String.format("%-30s: %s", "numero", numero));
            joiner.add(String.format("%-30s: %s", "ruta", ruta));
            joiner.add("Vagones:");
            for (Vagon v : vagones) {
                joiner.add(v.toString());
            }
            return joiner.toString();
        }
    }
