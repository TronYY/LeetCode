
package $442_FindAllDuplicatesinanArray;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    	List<Integer> list=new ArrayList<Integer>();
    	int k;
    	for (int i=0;i<nums.length;i++) {
    		k=Math.abs(nums[i]);
    		if (nums[k-1]<0) list.add(k);
    		nums[k-1]*=-1;
    		/*
    		if ((nums[i-1]^nums[i])==0) {
    			list.add(nums[i]);
    			nums[i]=nums[i-1];
    		} else
    			nums[i]=nums[i-1]^nums[i];*/
    	}
    	
    	return list;        
    }
}