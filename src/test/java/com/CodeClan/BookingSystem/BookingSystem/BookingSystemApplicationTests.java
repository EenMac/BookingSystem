package com.CodeClan.BookingSystem.BookingSystem;

import com.CodeClan.BookingSystem.BookingSystem.models.Course;
import com.CodeClan.BookingSystem.BookingSystem.models.Customer;
import com.CodeClan.BookingSystem.BookingSystem.repositories.BookingRepository;
import com.CodeClan.BookingSystem.BookingSystem.repositories.CourseRepository;
import com.CodeClan.BookingSystem.BookingSystem.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BookingSystemApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void getByCourseRatings() {

		List<Course> foundCourseList = courseRepository.getByRating(5);
		assertEquals("Software development", foundCourseList.get(0).getName());
	}

	@Test
	void getAllCustomerByCourse() {

		List<Customer> foundCustomer = customerRepository.getByBookingsCourseId(1L);
		assertEquals("John",foundCustomer.get(0).getName());
	}


}
