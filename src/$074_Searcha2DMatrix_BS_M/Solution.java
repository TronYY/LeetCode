package $074_Searcha2DMatrix_BS_M;


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    	
    	int m=matrix.length;
    	if (m==0) return false;
    	int n=matrix[0].length;
    	int l=0,r=m*n-1;
    	while (l<=r) {
    		int mid=(l+r)/2;
    		int t=matrix[mid/n][mid % n];
    		if (t==target) return true;
    		else if (t>target) r=mid-1;
    		else l=mid+1;
    			
    	}
    	return false;
    	
    }
}