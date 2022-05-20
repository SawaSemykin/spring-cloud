package com.frankmoley.lil.roomservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aleksandr Semykin
 */
@RestController
@RequestMapping("/rooms")
public class RoomWebService {

    private final RoomRepository repository;

    public RoomWebService(RoomRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Room> getAllRooms() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Room getRoomById(@PathVariable("id") long id) {
        return repository.findById(id).get();
    }
}
