package $167_TwoSumIIInputarrayissorted_BS_E;

public class Solution {
	public int[] twoSum(int[] numbers, int target) {
		int l=0,r=numbers.length-1;
		while (l<r) {
			int s=numbers[l]+numbers[r];
			if (s==target) return new int[] {l+1,r+1};
			else if (s<target) l++;
			else r--;		
		}
		return new int[] {l+1,r+1};
		
	        
	}

}
