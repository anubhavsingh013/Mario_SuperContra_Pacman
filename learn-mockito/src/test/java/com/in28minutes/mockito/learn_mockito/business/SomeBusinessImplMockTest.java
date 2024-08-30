package com.in28minutes.mockito.learn_mockito.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {
	@Mock
	private DataService dataServiceMock;
	
	@InjectMocks
	private SomeBusinessImpl someBusinessImpl;
	
	@Test
	void test1() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {22,23,43});
		assertEquals(43,someBusinessImpl.findMax());
	}
	@Test
	void findGreatestWithOneValue() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {22});
		assertEquals(22,someBusinessImpl.findMax());
	}
	@Test
	void findGreatestEmptyArray() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE,someBusinessImpl.findMax());
	}
//	@Test
//	void test() {
//		DataService dataServiceMock=mock(DataService.class);
//		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {22,23,43});
//		SomeBusinessImpl someBusinessImpl=new SomeBusinessImpl(dataServiceMock);
//		int ans=someBusinessImpl.findMax();
//		assertEquals(43,ans);
//	}

}


