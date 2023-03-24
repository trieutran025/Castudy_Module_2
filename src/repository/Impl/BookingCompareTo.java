package src.repository.Impl;

import src.models.Booking;

import java.util.Comparator;

public class BookingCompareTo implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        int dateBooking = o2.getStartDay().compareTo(o1.getStartDay());
        if(dateBooking !=0){
            return dateBooking;
        }else {
            return o2.getEndDay().compareTo(o1.getEndDay());
        }
    }
}
