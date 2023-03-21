package com.jenkins.controller;

import com.jenkins.model.Student;
import com.jenkins.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        Student studentResult = studentService.saveStudent(student);
        return new ResponseEntity<>(studentResult, HttpStatus.CREATED);
    }

    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> studentList = studentService.findAllStudent();
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }
}
