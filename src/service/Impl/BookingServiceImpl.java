package src.service.Impl;

import src.models.Booking;
import src.repository.BookingRepository;
import src.repository.Impl.BookingRepositoryImpl;
import src.service.BookingService;

import java.util.Set;

public class BookingServiceImpl implements BookingService {
    BookingRepository repository = new BookingRepositoryImpl();
    @Override
    public void addBooking(Booking o) {
       repository.addBooking(o);
    }

    @Override
    public Set<Booking> findAdd() {
        return repository.findAdd();
    }
}
