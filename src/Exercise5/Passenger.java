package Exercise5;

import java.util.List;

public class Passenger extends Person{
    private List<Reservation> historialReservas;

    public List<Reservation> getHistorialReservas() {
        return historialReservas;
    }

    public void setHistorialReservas(String historialReservas) {
        historialReservas = historialReservas;
    }

    public Passenger(String name, String id, String contact, String historialReservas) {
        super(name, id, contact);
        historialReservas = historialReservas;
    }
}
