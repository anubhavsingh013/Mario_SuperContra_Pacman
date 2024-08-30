package com.in28minutes.mockito.learn_mockito.business;

public class SomeBusinessImpl {
	
	DataService dataService;
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService=dataService;
	}
	int maximum=Integer.MIN_VALUE;
	public int findMax() {
		int []data=dataService.retrieveAllData();
		for(int value:data) {
			if(value>maximum) {
				maximum=value;
			}
		}
		return maximum;
	}
}

interface DataService{
	int []retrieveAllData();
}
