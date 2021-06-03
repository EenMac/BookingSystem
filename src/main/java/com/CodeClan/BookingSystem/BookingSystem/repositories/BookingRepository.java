package com.CodeClan.BookingSystem.BookingSystem.repositories;

import com.CodeClan.BookingSystem.BookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> getByBookingDate(String date);

}
