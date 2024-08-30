package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {
	List<String>todos=Arrays.asList("Azure","Springboot","Microservices","Kafka","Docker","Kubernetes");
	@Test
	void test() {
		boolean test=todos.contains("Microservices");
//		assertTrue(test);
//		assertEquals(true,test);
//		assertEquals(3,todos.size());
//		assertNull,assertNotNull
		assertArrayEquals(new int[] {1,2},new int[] {1,2});
	}

}
