package com.ss.tests;
import org.junit.Assert;
import org.junit.Test;

import com.ss.assignment9.Singleton;

public class DoubleCheckedSingletonTest {

		@Test
		public void TestsingletonConstructor() {
			Singleton intstanceA = Singleton.getInstance();
			Singleton intstanceB = Singleton.getInstance();
			
			//Passes test
			Assert.assertSame(intstanceA, intstanceB);
		}
		
		
			
		}


