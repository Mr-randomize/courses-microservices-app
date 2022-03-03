package com.iviberberi.apigateway.controller;

import com.iviberberi.apigateway.request.CourseServiceRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("gateway/course")
public class CourseController {

    private CourseServiceRequest courseServiceRequest;

    public CourseController(CourseServiceRequest courseServiceRequest) {
        this.courseServiceRequest = courseServiceRequest;
    }

    @PostMapping
    public ResponseEntity<?> saveCourse(@RequestBody Object course) {
        return new ResponseEntity<>(courseServiceRequest.saveCourse(course), HttpStatus.CREATED);
    }

    @DeleteMapping("{courseId}")
    public ResponseEntity<?> deleteCourse(@PathVariable Long courseId) {
        courseServiceRequest.deleteCourse(courseId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllCourses() {
        return ResponseEntity.ok(courseServiceRequest.getAllCourses());
    }
}
