
package $485_MaxConsecutiveOnes_Arrays;

import java.util.Arrays;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    	int i,max=-1,temp=0;
    	for (i=0;i<nums.length;i++) {
    		if (nums[i]==1) temp++;
    		else {
    			if (max<temp) max=temp;
    			temp=0;	
    		}
    	}
    	if (max<temp) max=temp;
    	return max;
        
    }
}