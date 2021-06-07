package com.ss.Wk1FinalAssignment;

public class GroupToSum {

	public boolean groupSumClump(int start, int[] numbers, int target) 
	{
	    if(start >= numbers.length)
	        return target == 0;
	          
	    int i = start;
	    int sum = 0;
	    
	    while(i < numbers.length && numbers[start] == numbers[i]) {
	        sum += numbers[i];
	        i++;
	    }
	                              
	    if(groupSumClump(i, numbers, target - sum))
	        return true;
	                                        
	    if(groupSumClump(i, numbers, target))
	        return true;
	                                                  
	    return false;
	}
}
