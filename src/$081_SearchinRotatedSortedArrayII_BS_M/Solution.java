package $081_SearchinRotatedSortedArrayII_BS_M;

class Solution {
    public boolean search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while (l<=r) {
        	int mid=(l+r)/2;
        	if (nums[mid]==target) return true;
        	
        	if(nums[l] == nums[mid]) l++;//��Ϊ��Ե�ظ������ǲ���֪��Ӧ��������һ�롣����İ취ֻ���ǶԱ�Ե�ƶ�һ����ֱ����Ե���м䲻����Ȼ���������
        	else if (nums[l]<nums[mid]) /*��������*/{
        		if  (nums[l]<=target && target<nums[mid]) r=mid-1;
        		else l=mid+1;
        	}
        	else /*�Ұ������*/{
        		if (nums[mid]<target && target<=nums[r]) l=mid+1;
        		else r=mid-1;
        	}
        		
        }
        return false;
    }
}