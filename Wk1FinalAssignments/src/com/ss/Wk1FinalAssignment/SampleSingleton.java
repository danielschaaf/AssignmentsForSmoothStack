package com.ss.Wk1FinalAssignment;


public class SampleSingleton {

	private static volatile SampleSingleton instance = null;
	
	public static SampleSingleton getInstance() {
			if (instance == null) {

				synchronized (SampleSingleton.class) {
					if (instance == null) {
						
						instance = new SampleSingleton();
					}
				}
			}
			return instance;
		
	}

}