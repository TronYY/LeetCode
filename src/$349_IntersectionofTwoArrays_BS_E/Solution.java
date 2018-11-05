package $349_IntersectionofTwoArrays_BS_E;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    	if (nums1.length==0 || nums2.length==0) return new int[0];
    	Arrays.sort(nums1);
    	Arrays.sort(nums2);
    	Queue<Integer> queue=new LinkedList<Integer>();
    	for (int i=0;i<nums2.length;i++) {
    		if (BS(nums1,nums2[i])) queue.offer(nums2[i]);
    		while(i+1<nums2.length && nums2[i]==nums2[i+1]) i++;
    	}
    	int[] result=new int[queue.size()];
    	int k=0;
    	while (!queue.isEmpty()) {
    		result[k]=queue.poll();
    		k++;
    	}
    	return result;
    	
    	
        
    }
    
    
    public boolean BS(int[] nums, int target) {
		int l=0,r=nums.length-1;
		int mid=0;
		//这里必须是<=
		while (l<=r) {
			mid=(l+r)/2;
			if (nums[mid]==target) return true;
			else if (nums[mid]>target) r=mid-1;
			else l=mid+1;	
		}
		return false;
		
	}
}