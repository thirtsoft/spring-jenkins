package com.jenkins.controller;

import com.jenkins.model.Student;
import com.jenkins.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(value = "/savestudent")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        Student studentResult = studentService.saveStudent(student);
        return new ResponseEntity<>(studentResult, HttpStatus.CREATED);
    }

    @GetMapping(value = "/searchstudent/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long studentId) {
        Student studentResult = studentService.findById(studentId);
        return new ResponseEntity<>(studentResult, HttpStatus.OK);
    }

    @GetMapping(value = "/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> studentList = studentService.findAllStudent();
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }
}
