package com.mongodbapi.service;

import com.mongodbapi.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    //we create the student service that the student controller will call
    List<Student> findAll();
    Student findByStudentNumber(long studentNumber);
    Student findByEmail(String email);
    List<Student> findAllByOrderByGpaDesc();
    Student saveOrUpdateStudent(Student student);
    void deleteStudentById(String id);

}
