package com.mongodbapi.repository;

import com.mongodbapi.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

//crud interface by spring data
public interface StudentRepository extends MongoRepository<Student, String> {
    //student repository has three methods. First two methods find the student
    // by its student number or email. The last method sorts students according their GPA

    Student findByStudentNumber(long studentNumber);
    Student findByEmail(String email);
    List<Student> findAllByOrderByGpaDesc();

}
