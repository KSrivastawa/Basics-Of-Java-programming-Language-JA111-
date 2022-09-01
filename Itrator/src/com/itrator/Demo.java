package com.itrator;

import java.util.*;

class Demo {
	
    public boolean containsDuplicate(int[] nums) {
        
    Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        
        int n = nums.length;
        
        int s = set.size();
        

        if(s == n) {
        	return true;
        }
        
        return false;
        

    }
    
    public static void main(String[] args) {
		
    	int[] arr = {1,2,3,1};
    	
    	Demo d = new Demo();
    	
    	System.out.println(d.containsDuplicate(arr));
    	
    	
	}


    
    
}
