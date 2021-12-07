package day01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {

    private List<Person> people = new ArrayList<>();

    public void addPerson(Person person, LocalTime actualTime){
        if (actualTime.isBefore(person.getTicket().entryTime())) {
            throw new IllegalArgumentException("Cant get in") ;} else {
                people.add(person);
        }
    }

}
