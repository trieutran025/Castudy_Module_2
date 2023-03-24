package src.service;

import src.models.Booking;

import java.util.Set;

public interface BookingService extends Service{
    void addBooking(Booking o);
    Set<Booking> findAdd();
}
