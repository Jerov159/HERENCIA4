package Exercise5;

import java.util.Date;

public class Flight {
    private int number;
    private String rute;
    private Date date;
    private String departureTime;
    private String arriveTime;
    private Airplane airplane;

    public Flight(int number, String rute, Date date, String departureTime, String arriveTime, Airplane airplane) {
        this.number = number;
        this.rute = rute;
        this.date = date;
        this.departureTime = departureTime;
        this.arriveTime = arriveTime;
        this.airplane = airplane;
    }

    public int getNumber() {
        return number;
    }

    public String getRute() {
        return rute;
    }

    public Date getDate() {
        return date;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArriveTime() {
        return arriveTime;
    }

    public Airplane getAirplane() {
        return airplane;
    }
}
