package com.ss.tests;
import static org.junit.Assert.*;
import org.junit.Test;

import com.ss.Wk1FinalAssignment.ModString;
public class ModString_Test {


		@Test
		public void test_removeX() {
			
			assertTrue(ModString.removeX("ax").equals("a"));
			assertFalse(ModString.removeX("ax").equals("x"));
		}

	}



