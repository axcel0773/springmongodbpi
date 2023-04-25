package com.mongodbapi.service;



import com.mongodbapi.model.Student;
import com.mongodbapi.repository.StudentRepository;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceTest {
    @Autowired
    private StudentService studentService;

    @MockBean
    private StudentRepository studentRepository;

    private Student ragcrix;
    private Student yigit;

    private final Long ragcrixStudentNumber = 23L;
    private final Long yigitStudentNumber = 91L;
    private final String ragcrixEmail = "ragcrix@arg.com";
    private final String yigitEmail = "yigit@ygt.com";
    private final List<Student> students = new ArrayList<>();

    @Before
    public void setup() {
        ragcrix = new Student();
        ragcrix.setId("aBc123");
        ragcrix.setName("ragcrix");
        ragcrix.setEmail(ragcrixEmail);
        ragcrix.setStudentNumber(ragcrixStudentNumber);
        ragcrix.setCourseList(Arrays.asList("Math", "Science"));
        ragcrix.setGpa(3.37f);

        yigit = new Student();
        yigit.setId("dEf345");
        yigit.setName("yigit");
        yigit.setEmail(yigitEmail);
        yigit.setStudentNumber(yigitStudentNumber);
        yigit.setCourseList(Arrays.asList("Turkish", "German"));
        yigit.setGpa(3.58f);

        students.add(ragcrix);
        students.add(yigit);

    }

    Mockito.when(studentRepository.findAll()).thenReturn(students);






}
