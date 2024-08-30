package com.in28minutes.mockito.learn_mockito.list;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ListTest {

	@Test
	void SimpleTest() {
		List listMock=mock(List.class);
		when(listMock.size()).thenReturn(4);
		assertEquals(4,listMock.size());
	}
	
	@Test
	void MultipleReturns() {
		List listMock=mock(List.class);
		when(listMock.size()).thenReturn(4).thenReturn(5);
		assertEquals(4,listMock.size());
		assertEquals(5,listMock.size());
	}
	
	@Test
	void specificParameters() {
		List listMock=mock(List.class);
		when(listMock.get(0)).thenReturn("MicroService");
		assertEquals("MicroService",listMock.get(0));
		assertEquals(null,listMock.get(1));
	}
	
	@Test
	void parameterWithAny() {
		List listMock=mock(List.class);
		when(listMock.get(Mockito.anyInt())).thenReturn("DefaultString");
		assertEquals("DefaultString",listMock.get(0));
		assertEquals("DefaultString",listMock.get(1));
	}

}
