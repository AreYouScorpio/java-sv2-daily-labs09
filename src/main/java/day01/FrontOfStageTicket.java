package day01;

import java.time.LocalDateTime;

public class FrontOfStageTicket extends Ticket {

    private int code;

    public FrontOfStageTicket(String band, LocalDateTime startTime, int price, int code) {
        super(band, startTime, price);
        this.code = code;
    }
}
