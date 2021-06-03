package com.CodeClan.BookingSystem.BookingSystem.controllers;

import com.CodeClan.BookingSystem.BookingSystem.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.GeneratedValue;

@RestController
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/bookings")
    public ResponseEntity getBookings(
            @RequestParam(name = "date", required = false) String date
    ){
        if(date != null){
            return new ResponseEntity(bookingRepository.getByBookingDate(date), HttpStatus.OK);
        }
        return new ResponseEntity(bookingRepository.findAll(), HttpStatus.OK);
    }

}
