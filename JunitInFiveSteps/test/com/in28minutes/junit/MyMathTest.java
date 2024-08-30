package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {
	MyMath math=new MyMath();
//	@Test
//	void test() {
//		int numbers[]= {1,2,3,4};
//		
//		int result=math.Sum(numbers);
//		System.out.println(result);
//		int expected=10;
//		assertEquals(expected,result);
//		
//	}
//	
//	@Test
//	void Test2() {
//		int numbers[]= {};
//		MyMath math= new MyMath();
//		int result=math.Sum(numbers);
//		System.out.println(result);
//		int expected=0;
//		assertEquals(expected,result);
//	}
	@Test
	void ThreeLengthArraySum() {
		assertEquals(7,math.Sum(new int[] {4,2,1}) );
	}
	@Test
	void ZeroLengthArraySum() {
		assertEquals(0,math.Sum(new int[] {}) );
	}
}
