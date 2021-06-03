package com.CodeClan.BookingSystem.BookingSystem.repositories;

import com.CodeClan.BookingSystem.BookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> getByRating(int rating);
}
