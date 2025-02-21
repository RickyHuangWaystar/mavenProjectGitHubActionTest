package com.example.demo;


import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void unitAddition(){
		assert MathFunctions.addition(1,2) == 3;
	}

}
