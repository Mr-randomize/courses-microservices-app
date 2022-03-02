package com.iviberberi.coursemicroservice.service;

import com.iviberberi.coursemicroservice.model.Course;

import java.util.List;

public interface CourseService {

    Course saveCourse(Course course);

    void deleteCourse(Long courseId);

    List<Course> findAllCourses();
}
