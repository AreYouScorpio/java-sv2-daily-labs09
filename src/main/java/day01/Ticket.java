package day01;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {
    String name;
    LocalDate date;
    int price;

    public Ticket(String name, LocalDate date, int price) {
        this.name = name;
        this.date = date;
        this.price = price;
    }

    public int LocalTime entryTime(LocalDate date){
        LocalTime.of(date.atTime());

    }

}

