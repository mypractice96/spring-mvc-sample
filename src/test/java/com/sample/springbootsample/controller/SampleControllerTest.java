package com.sample.springbootsample.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SampleControllerTests {
	
	SampleController controller = new SampleController();
	

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

}
