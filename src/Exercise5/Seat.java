package Exercise5;

public class Seat {
    private int number;
    private String clase;
    private String status;

    public Seat(int number, String clase, String status) {
        this.number = number;
        this.clase = clase;
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public String getClase() {
        return clase;
    }

    public String getStatus() {
        return status;
    }
    public void reservar() {
        status = "reservado";
    }

    public void ocupar() {
        status = "ocupado";
    }
}
