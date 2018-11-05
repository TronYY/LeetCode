
package $001_TwoSum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int i=0;i<nums.length;i++)
    		map.put(nums[i], i);
    	for (int i=0;i<nums.length;i++) {
    		int compl=target-nums[i];
    		if (map.get(compl)!=null && map.get(compl)!=i)
    			return new int[] {i,map.get(compl)};
    	}
    	throw new IllegalArgumentException("No two sum solution");
    	
    	
        
    }
}