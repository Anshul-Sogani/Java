package test;

import java.util.*;

 class TwoSum {
	
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement) && map.get(complement) != i) {
            return new int[] { i, map.get(complement) };
        }
    }
    throw new IllegalArgumentException("No two sum solution");
}



	public static void main(String[] args) {
		TwoSum  obj = new TwoSum();
		int[] a = new int[] {1,2,3,4,5};
		
		int [] b=obj.twoSum(a,9);
		
		for(int i : b)
		System.out.println(i);
	}
	
	
}
