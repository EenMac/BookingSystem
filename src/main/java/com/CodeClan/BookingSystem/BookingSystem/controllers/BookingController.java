package com.CodeClan.BookingSystem.BookingSystem.controllers;

import com.CodeClan.BookingSystem.BookingSystem.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;


}
