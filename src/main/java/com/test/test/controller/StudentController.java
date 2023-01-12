package com.test.test.controller;

import com.test.test.model.Student;
import com.test.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){

        studentService.saveStudent(student);

        return "New Student is added";

    }

    @GetMapping("/getAll")
    public List<Student> getAllStudent(){

        return studentService.getAllStudents();

    }

    @GetMapping("/test")
    public void test(){

        studentService.getAllStudents();
        /*
        - создать студента (задать его параметры)
        - отправить HttpType запрос указав путь PATH
        -
         */


    }




}
