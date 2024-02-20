package Ejerc3;
import java.util.List;
public class Cliente extends Persona {
        private List<String> historialCompras;

        public Cliente(String nombre, int identificacion, String direccion, List<String> historialCompras) {
            super(nombre, identificacion, direccion);
            this.historialCompras = historialCompras;
        }

        public List<String> obtenerHistorialCompras() {
            return this.historialCompras;
        }
    }
