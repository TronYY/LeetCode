package $766_ToeplitzMatrix_Array;

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
    	int i,j;
    	for (i=0;i<matrix.length-1;i++)
    		for (j=0;j<matrix[i].length-1;j++)
    			if (matrix[i][j]!=matrix[i+1][j+1]) return(false);
    	return(true); 
        
    }
}
