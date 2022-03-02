package com.iviberberi.coursemicroservice.repository;

import com.iviberberi.coursemicroservice.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}