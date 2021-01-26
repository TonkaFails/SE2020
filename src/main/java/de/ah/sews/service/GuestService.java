package de.ah.sews.service;

import de.ah.sews.entity.Guest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

@Service
public class GuestService {

    public List<Guest> getGuest() {

        // hier wäre die Datenbankanbindung
        return List.of(
                new Guest(
                        "Anton",
                        "Hofmeier",
                        new HashMap<>() {{
                            put(getDate(0), getDate(10));
                            put(getDate(20), getDate(40));
                        }},
                        21
                ),
                new Guest(
                        "Kilian",
                        "Osenstätter",
                        new HashMap<>() {{
                            put(getDate(23), getDate(40));
                            put(getDate(56), getDate(70));
                        }},
                        21
                )
        );

    }

    private LocalDate getDate(int days) {
        LocalDate date = LocalDate.now();

        date = date.plusDays(days);

        return date;

    }
}
