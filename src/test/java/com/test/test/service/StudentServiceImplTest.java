package com.test.test.service;

import com.test.test.model.Student;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static io.restassured.RestAssured.*;

class StudentServiceImplTest {

    static final Student TEST_STUDENT = getTestStudent();

    @BeforeAll
    static void setup() {

        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.port = 8081;
    }

    static Student getTestStudent(){
        Student testStudent = new Student();
        testStudent.setName("testStudent");
        testStudent.setAddress("testStudent City");
        return testStudent;
    }


    @Test
    public void addStudent(){
//        with().body(getTestStudent())
//                .when()
//                .request("POST","/student/add")
//                .then()
//                .statusCode(200);

                //ДАНО
        given().param("name",getTestStudent().getName()).
                param("address",getTestStudent().getAddress()).
                //КОГДА http post НА /student/add
                when().post("/student/add")
                //В Результате
                .then().b;



    }

    @Test
    public void getAllStudents(){

        when()
                .request("GET","/student/getAll")
                .then()
                .statusCode(200);
    }

}