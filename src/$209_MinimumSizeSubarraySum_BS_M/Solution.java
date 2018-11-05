package $209_MinimumSizeSubarraySum_BS_M;

class Solution {
    public int minSubArrayLen(int s, int[] nums) {
    	if (nums.length==0) return 0;//¿Ó
    	int i=0,j=0,sum=0,ans=Integer.MAX_VALUE;
    	while (i<nums.length) {
    		sum+=nums[i];
    		while (sum>=s) {
    			ans=Math.min(ans, i-j+1);
    			sum-=nums[j];//×¢ÒâÏÈ¼õÔÙÅ²
    			j++;
    		}
    		i++;
    	}
    	return ans==Integer.MAX_VALUE? 0:ans;//¿Ó
        
    }
}