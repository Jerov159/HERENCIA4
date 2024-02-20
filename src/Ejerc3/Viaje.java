package Ejerc3;
import java.time.*;
import java.util.StringJoiner;
public class Viaje {
        private LocalDate fecha;
        private LocalDateTime horaSalida;
        private LocalDateTime horaLlegada;
        private Tren tren;

        public Viaje(LocalDate fecha, LocalDateTime horaSalida, LocalDateTime horaLlegada, Tren tren) {
            this.fecha = fecha;
            this.horaSalida = horaSalida;
            this.horaLlegada = horaLlegada;
            this.tren = tren;
        }

        public LocalDate obtenerFecha() {
            return this.fecha;
        }

        public LocalDateTime obtenerHoraSalida() {
            return this.horaSalida;
        }

        public LocalDateTime obtenerHoraLlegada() {
            return this.horaLlegada;
        }

        public Tren obtenerTren() {
            return this.tren;
        }

        @Override
        public String toString() {
            StringJoiner joiner = new StringJoiner("\n");
            joiner.add(String.format("%-30s: %s", "fecha", fecha));
            joiner.add(String.format("%-30s: %s", "horaSalida", horaSalida));
            joiner.add(String.format("%-30s: %s", "horaLlegada", horaLlegada));
            joiner.add(String.format("%-30s: %s", "tren", tren));
            return joiner.toString();
        }
    }
