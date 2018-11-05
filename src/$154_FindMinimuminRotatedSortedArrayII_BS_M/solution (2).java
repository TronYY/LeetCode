class Solution {
    public int findMin(int[] nums) {
		if (nums.length==0) return 0;
        int l=0,r=nums.length-1,mid=0;
		while (l<=r) {
			
			if (nums[l]<nums[r]) return nums[l];
			mid=l+(r-l)/2;
			if (nums[mid]<nums[r]) r=mid;
            else if (nums[mid]==nums[r]) r=r-1;//不好判断只能一个个试
			else l=mid+1;
		}
        return nums[mid];
    
    }
}