package com.in28minutes.mockito.learn_mockito.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplStubTest {

	@Test
	void test() {
		DataServiceStub dataServiceStub=new DataServiceStub();
		SomeBusinessImpl someBusinessImpl=new SomeBusinessImpl(dataServiceStub);
		int ans=someBusinessImpl.findMax();
		assertEquals(43,ans);
	}

}

class DataServiceStub implements DataService{
	@Override
	public int[]retrieveAllData(){
		return new int[] {23,32,43};
	}

}
