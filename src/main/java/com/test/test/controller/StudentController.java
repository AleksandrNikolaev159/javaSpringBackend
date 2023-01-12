package com.test.test.controller;

import com.test.test.model.Student;
import com.test.test.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;

    @PostMapping
    public String add(@RequestBody Student student){

        studentService.saveStudent(student);

        return "New Student is added";

    }




}
