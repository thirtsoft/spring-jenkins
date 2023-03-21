package com.jenkins.service;

import com.jenkins.dao.StudentRepository;
import com.jenkins.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student findById(Long studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    public List<Student> findAllStudent() {
        return studentRepository.findAll();
    }
}
