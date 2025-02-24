package com.example.demo;


import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void testAddition(){
		assert MathFunctions.addition(1,2) == 3;
	}

	@Test
	public void testSubtraction(){
		assert MathFunctions.subtraction(2,1) == 1;
	}

	@Test
	public void testMultiplication(){
		assert 4 * 4 == 16;
	}

}
