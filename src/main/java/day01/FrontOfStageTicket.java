package day01;

import java.time.LocalDate;

public class FrontOfStageTicket extends Ticket {

    private int code;

    public FrontOfStageTicket(String name, LocalDate date, int price, int code) {
        super(name, date, price);
        this.code = code;
    }
}
