package com.frankmoley.lil.roomreservationservice;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Aleksandr Semykin
 */
@RestController
@RequestMapping("/room-reservations")
public class RoomReservationService {

//    private final RestTemplate rest;

    private final RoomClient roomClient;
//
//    public RoomReservationService(RestTemplate rest) {
//        this.rest = rest;
//    }

    public RoomReservationService(RoomClient roomClient) {
        this.roomClient = roomClient;
    }

    @GetMapping
    public List<RoomReservation> getAllRoomReservations() {
//        return getAllRooms().stream()
        return this.roomClient.getAllRooms().stream()
                .map(r -> {
                    RoomReservation rr = new RoomReservation();
                    rr.setRoomId(r.getId());
                    rr.setRoomName(r.getName());
                    rr.setRoomNumber(r.getRoomNumber());
                    return rr;})
                .collect(Collectors.toList());
    }

//    private List<Room> getAllRooms() {
//        ResponseEntity<List<Room>> roomResponse = rest.exchange("http://ROOM-SERVICES/rooms", HttpMethod.GET, null,
//                new ParameterizedTypeReference<List<Room>>() {});
//        return roomResponse.getBody();
//    }
}
