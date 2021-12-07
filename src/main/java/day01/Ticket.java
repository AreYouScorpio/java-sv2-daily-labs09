package day01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {
    private String band;
    private LocalDateTime startTime;
    private int price;

    /*
    public Ticket(){
        super();
    }

   automatikus Object-re
    */


    public Ticket(String band, LocalDateTime startTime, int price) {
        // super(); - ez automatikusan az Object-re megtörténik, nem kell leírni
        this.band = band;
        this.startTime = startTime;
        this.price = price;
    }

    public LocalTime entryTime(){
        return startTime.toLocalTime().minusHours(1);
    }

    public String getBand() {
        return band;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getPrice() {
        return price;
    }
}

