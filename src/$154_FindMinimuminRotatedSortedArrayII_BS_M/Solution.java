package $154_FindMinimuminRotatedSortedArrayII_BS_M;

class Solution {
    public int findMin(int[] nums) {
    	int l=0,r=nums.length-1;
    	//考虑只有一元素，如果是等于就会一直循环
        while (l<r) {
        	while (l<r-1 && nums[l]==nums[r] ) l++;
        	if (nums[l]<nums[r]) return nums[l];
        	int mid=(l+r)/2;
        	if (nums[l]<=nums[mid]) l=mid+1;//考虑两元素1 0
        	else r=mid;
        		
        }
        return nums[l];
    }
}