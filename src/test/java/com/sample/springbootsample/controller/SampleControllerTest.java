package com.sample.springbootsample.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SampleControllerTests {
	
	SampleController controller = new SampleController();
	

	/* Unit Test Example */
	@Test
	void testAddition1() {
		int actualResult = controller.add(2,3);
		int expected = 5;
		assertEquals(expected, actualResult);
	}
  
        @Test
	void testAddition2() {
		int actualResult = controller.add(-2,-3);
		int expected = -5;
		assertEquals(expected, actualResult);
	}
	
	
	/* Integration Test Example */
	@Test
	void testRegisterUser() {
		String actualResult = controller.registerUser("vamsi","password","vamsi@gmail.com","9123456789");
		int expected = "Success";
		assertEquals(expected, actualResult);
	}
	

}
