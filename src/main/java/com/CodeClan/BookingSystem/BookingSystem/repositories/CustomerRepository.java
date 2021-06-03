package com.CodeClan.BookingSystem.BookingSystem.repositories;

import com.CodeClan.BookingSystem.BookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> getByBookingsCourseId(Long id);
}
