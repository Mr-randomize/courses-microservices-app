package com.iviberberi.coursemicroservice.service;

import com.iviberberi.coursemicroservice.model.Course;
import com.iviberberi.coursemicroservice.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course saveCourse(Course course) {

        course.setCreateTime(LocalDateTime.now());

        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long courseId) {
        courseRepository.deleteById(courseId);
    }

    @Override
    public List<Course> findAllCourses() {
        return courseRepository.findAll();
    }
}
