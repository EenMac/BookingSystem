package com.CodeClan.BookingSystem.BookingSystem.components;

import com.CodeClan.BookingSystem.BookingSystem.models.Booking;
import com.CodeClan.BookingSystem.BookingSystem.models.Course;
import com.CodeClan.BookingSystem.BookingSystem.models.Customer;
import com.CodeClan.BookingSystem.BookingSystem.repositories.BookingRepository;
import com.CodeClan.BookingSystem.BookingSystem.repositories.CourseRepository;
import com.CodeClan.BookingSystem.BookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        Customer customer1 = new Customer("John", "Devon");
        customerRepository.save(customer1);

        Course course1 = new Course("Software development", "Edinburgh", 5);
        courseRepository.save(course1);

        Booking booking1 = new Booking("18/03/2021", course1, customer1);
        bookingRepository.save(booking1);


    }

}
