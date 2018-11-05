package $695_MaxAreaofIsland_Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] grid=new int[][] {{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};/*{{0,0,0,0,0,0,0,0}};*/
				/*{{0,0,1,0,0,0,0,1,0,0,0,0,0},
			 {0,0,0,0,0,0,0,1,1,1,0,0,0},
			 {0,1,1,0,1,0,0,0,0,0,0,0,0},
			 {0,1,0,0,1,1,0,0,1,0,1,0,0},
			 {0,1,0,0,1,1,0,0,1,1,1,0,0},
			 {0,0,0,0,0,0,0,0,0,0,1,0,0},
			 {0,0,0,0,0,0,0,1,1,1,0,0,0},
			 {0,0,0,0,0,0,0,1,1,0,0,0,0}};*/
		Solution solution=new Solution();
		System.out.println(solution.maxAreaOfIsland(grid));
	}

}
