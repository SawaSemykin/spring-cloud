package com.frankmoley.lil.reservationservices;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author Aleksandr Semykin
 */
@Entity
@Table(name="RESERVATION")
public class Reservation {

    @Id
    @Column(name="RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="ROOM_ID")
    private long roomId;

    @Column(name="GUEST_ID")
    private long guetId;

    @Column(name="RES_DATE")
    private LocalDate date;

    public long getId() {
        return id;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getGuetId() {
        return guetId;
    }

    public void setGuetId(long guetId) {
        this.guetId = guetId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
