package com.test.test;

import com.test.test.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.when;
import static io.restassured.RestAssured.with;

@SpringBootTest
class FullstackApplicationTests {

	@Test
	public void saveStudent(){
		with().body(new Student(1,"TestName","TestAddress"))
				.when()
				.request("POST","/student")
				.then()
				.statusCode(200);
	}

}
