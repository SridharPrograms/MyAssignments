package week3.day2;

import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		int[] nums = {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		for (int i = 0; i < nums.length; i++) {
           if (map.containsKey(nums[i])) {
        	   int value=map.get(nums[i]);
        	   map.put(nums[i],value+1);
           }
           else {
        	   map.put(nums[i], 1);
           }
		}
           System.out.println(map);

	}

}
