package de.ah.sews.controller;

import de.ah.sews.entity.Guest;
import de.ah.sews.service.GuestService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(
        method = RequestMethod.GET,
        path = "/guest",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class GuestController {

    private final GuestService guestService;

    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    @GetMapping
    public List<Guest> getPerson() {

        return guestService.getGuest();

    }

}
