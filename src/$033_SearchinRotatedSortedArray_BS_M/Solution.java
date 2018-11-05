package $033_SearchinRotatedSortedArray_BS_M;

class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while (l<=r) {
        	int mid=(l+r)/2;
        	if (nums[mid]==target) return mid;
        	if (nums[l]==nums[mid]) l++;
        	else if (nums[l]<nums[mid]) /*×ó°ë¶ËÓÐÐò*/{
        		if  (nums[l]<=target && target<nums[mid]) r=mid-1;
        		else l=mid+1;
        	}
        	else /*ÓÒ°ë¶ËÓÐÐò*/{
        		if (nums[mid]<target && target<=nums[r]) l=mid+1;
        		else r=mid-1;
        	}
        		
        }
        return -1;
    }
}