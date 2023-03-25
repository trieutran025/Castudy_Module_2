package src.repository.Impl;

import src.models.Booking;
import src.repository.BookingRepository;

import java.util.Set;
import java.util.TreeSet;

public class BookingRepositoryImpl implements BookingRepository {
    private static Set<Booking> bookingSet = new TreeSet<>(new BookingCompareTo());
    static {
        bookingSet.add(new Booking("B-1022","22/03/2020","22/07/2021","C-0001","House","Diamond"));
    }
    @Override
    public void addBooking(Booking o) {
        bookingSet.add(o);
    }

    @Override
    public Set<Booking> findAll() {
        return bookingSet;
    }
}
