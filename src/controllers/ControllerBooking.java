package src.controllers;

import src.models.Booking;

import java.io.IOException;
import java.util.Set;

import static src.controllers.FurumaController.bookingService;
import static src.controllers.Menu.scanner;

public class ControllerBooking {
    public static void findAll(){
        Set<Booking> bookingSet = bookingService.findAll();
        for(Booking booking : bookingSet){
            System.out.println(booking);
        }
    }
    public static void Add() throws IOException {
        String customerId;
        do{
            System.out.print("Enter customer id:");
            customerId =scanner.nextLine();
        }while (!ControllerCustomer.checkId(customerId));

//        Booking booking = new Booking(bookingCode,startDay,endDay,customerId,"1",typeCustomer);
//        bookingService.addBooking(booking);
    }
}
