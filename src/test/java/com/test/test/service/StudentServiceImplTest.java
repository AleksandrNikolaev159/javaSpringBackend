package com.test.test.service;

import com.test.test.model.Student;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

class StudentServiceImplTest {


    @BeforeAll
    static void setup() {
        Student testStudent = new Student();
        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.port = 8081;
    }

    @Test
    public void saveStudent(){
        with().body(new Student())
                .when()
                .request("POST","/student")
                .then()
                .statusCode(200);
    }

    @Test
    public void getAllStudents(){
        when().request("GET","/student").then().statusCode(200);
    }

}