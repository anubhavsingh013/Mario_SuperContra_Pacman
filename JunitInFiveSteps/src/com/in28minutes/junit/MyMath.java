package com.in28minutes.junit;

public class MyMath {
	public int Sum(int []nums) {
		int sum=0;
		for(int num:nums) {
			sum+=num;
		}
		return sum;
	}
}
