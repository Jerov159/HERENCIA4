package Exercise5;

import java.util.List;

public class Airplane {
    private String model;
    private int capacity;
    private List<Seat> seatList;

    public Airplane(String model, int capacity, List<Seat> seatList) {
        this.model = model;
        this.capacity = capacity;
        this.seatList = seatList;
    }

    public Seat obtenerAsiento(int number) {
        return null;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public Seat getSeat(int numero) {
        for (Seat seat : seatList) {
            if (seat.getNumber() == numero) {
                return seat;
            }
        }
        return null;
    }
}
