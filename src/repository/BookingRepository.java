package src.repository;


import src.models.Booking;

import java.util.Set;

public interface BookingRepository {
    void addBooking(Booking o);
    Set<Booking> findAdd();
}
