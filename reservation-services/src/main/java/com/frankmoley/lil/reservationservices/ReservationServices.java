package com.frankmoley.lil.reservationservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aleksandr Semykin
 */
@RestController
@RequestMapping("/reservations")
public class ReservationServices {

    private final ReservationRepository repository;

    public ReservationServices(ReservationRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Reservation> getAllReservations() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Reservation getById(@PathVariable("id") long id) {
        return repository.findById(id).get();
    }
}
