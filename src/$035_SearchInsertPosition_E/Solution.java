package $035_SearchInsertPosition_E;
/*
class Solution {
    public int searchInsert(int[] nums, int target) {
    	int i=0;
    	while ( i<nums.length && target>nums[i]) i++;
    	return i;
        
    }
}*/

class Solution {
	public int searchInsert(int[] nums, int target) {
		int l=0,r=nums.length-1;
		int mid=0;
		//这里必须是<=
		while (l<=r) {
			mid=(l+r)/2;
			if (nums[mid]==target) return mid;
			else if (nums[mid]>target) r=mid-1;
			else l=mid+1;	
		}
		return l;
		
	}
}
