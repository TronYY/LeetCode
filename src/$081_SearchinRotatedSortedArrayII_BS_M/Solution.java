package $081_SearchinRotatedSortedArrayII_BS_M;

class Solution {
    public boolean search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while (l<=r) {
        	int mid=(l+r)/2;
        	if (nums[mid]==target) return true;
        	
        	if(nums[l] == nums[mid]) l++;//因为边缘重复，我们并不知道应该跳向哪一半。解决的办法只能是对边缘移动一步，直到边缘和中间不在相等或者相遇。
        	else if (nums[l]<nums[mid]) /*左半端有序*/{
        		if  (nums[l]<=target && target<nums[mid]) r=mid-1;
        		else l=mid+1;
        	}
        	else /*右半端有序*/{
        		if (nums[mid]<target && target<=nums[r]) l=mid+1;
        		else r=mid-1;
        	}
        		
        }
        return false;
    }
}