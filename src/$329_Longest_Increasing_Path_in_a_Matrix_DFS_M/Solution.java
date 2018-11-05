package $329_Longest_Increasing_Path_in_a_Matrix_DFS_M;
public class Solution {
	int[][] cache;
	
	int [][] dir= {{-1,0},{0,1},{1,0},{0,-1}};
	public int longestIncreasingPath(int[][] matrix) {
		if (matrix.length==0) return 0;
		int result=0;
		cache=new int[matrix.length][matrix[0].length];
		
		for (int i=0;i<matrix.length;i++)
			for (int j=0;j<matrix[0].length;j++)
				result=Math.max(result,dfs(i,j,matrix));
				
		return result;
        
    }
	
	public int dfs(int i,int j,int[][] matrix) {
		if ( cache[i][j]!=0) return cache[i][j];
		int t=1;
		for (int k=0;k<4;k++) {
			int x=i+dir[k][0];
			int y=j+dir[k][1];
			if (x<0|| x>=matrix.length || y<0 ||y>=matrix[0].length) continue;
			if (matrix[x][y]>matrix[i][j] ) t=Math.max(t, 1+dfs(x, y, matrix));
			
		}
		return cache[i][j]=t;
		
	}
}
