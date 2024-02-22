package Ejerc3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.StringJoiner;
public class Tren {
        private int numero;
        private String ruta;
        Vagon vagon;

        public Tren(int numero, String ruta) {
            this.numero = numero;
            this.ruta = ruta;
            this.vagon = vagon;
        }

        public int obtenerNumero() {
            return this.numero;
        }

        public String obtenerRuta() {
            return this.ruta;
        }

    public void setVagon(Vagon vagon) {
        this.vagon = vagon;
    }

    @Override
    public String toString() {
        return "Tren{" +
                "numero=" + numero +
                ", ruta='" + ruta + '\'' +
                ", vagon=" + vagon +
                '}';
    }
}
