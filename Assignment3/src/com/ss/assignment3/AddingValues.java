package com.ss.assignment3;

public class AddingValues {
	 public static boolean isInteger(String s) {
	      boolean isValid = false;
	      try
	      {
	         Integer.parseInt(s);
	 
	         // s is a valid integer
	 
	         isValid = true;
	      }
	      catch (NumberFormatException ex)
	      {
	         // s is not an integer
	      }
	 
	      return isValid;
	   }
	public static void main(String[] args) {
		Integer sum = 0;
		for(int i = 0; i < args.length; i++) {
			if(isInteger(args[i])) {
				sum+= Integer.parseInt(args[i]);
			}
		}
		System.out.println("the sum is "+ sum);
		
	}

}
