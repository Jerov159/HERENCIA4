package Ejerc3;

public class Asiento {
        private int numero;
        private String estado;

        public Asiento(int numero) {
            this.numero = numero;
            this.estado = "libre";
        }

        public int obtenerNumero() {
            return this.numero;
        }

        public String obtenerEstado() {
            return this.estado;
        }

        public void reservar() {
            this.estado = "reservado";
        }

        public void ocupar() {
            this.estado = "ocupado";
        }
    }
