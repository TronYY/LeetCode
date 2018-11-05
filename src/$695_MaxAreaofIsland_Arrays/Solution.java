package $695_MaxAreaofIsland_Arrays;
public class Solution {
	public int maxAreaOfIsland(int[][] grid) {
		int result=0;
		for (int i=0;i<grid.length;i++)
			for (int j=0;j<grid[i].length;j++)
				if (grid[i][j]==1) {
					result=Math.max(result,dfs(i,j,grid));
				}
		return result;
        
    }
	
	public int dfs(int i,int j,int[][] grid) {
		if (i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!=1) return 0;
		grid[i][j]=0;
		int ans=1;
		return ans+dfs(i-1, j, grid)+dfs(i, j-1, grid)+dfs(i, j+1, grid)+dfs(i+1, j, grid);
	}
}
