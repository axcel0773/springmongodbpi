package com.mongodbapi.controller;

import com.mongodbapi.model.Student;
import com.mongodbapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // GET /students
    @GetMapping
    public List<Student> findAll() {
        return studentService.findAll();
    }

    // GET /students/{studentNumber}
    @GetMapping("/{studentNumber}")
    public Student findByStudentNumber(@PathVariable long studentNumber) {
        return studentService.findByStudentNumber(studentNumber);
    }

    // GET /students/email/{email}
    @GetMapping("/email/{email}")
    public Student findByEmail(@PathVariable String email) {
        return studentService.findByEmail(email);
    }

    // GET /students/sorted
    @GetMapping("/orderByGpa")
    public List<Student> findAllByOrderByGpaDesc() {
        return studentService.findAllByOrderByGpaDesc();
    }

    // POST /students
    @PostMapping
    public Student saveOrUpdateStudent(@RequestBody Student student) {
        return studentService.saveOrUpdateStudent(student);
    }

    // DELETE /students/{id}
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable String id) {
        studentService.deleteStudentById(id);
    }
}
