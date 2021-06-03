package com.CodeClan.BookingSystem.BookingSystem.repositories;

import com.CodeClan.BookingSystem.BookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {

//    List<Booking> get

}
