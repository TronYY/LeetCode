
package $566_ReshapetheMatrix_Arrays;

import java.awt.print.Printable;
import java.util.Arrays;

public class Solution {
	/*public void print(int[][] arr) {
		System.out.print("[");
		for (int i=0;i<arr.length-1;i++)
			System.out.print(Arrays.toString(arr[i])+",\n ");
		System.out.print(Arrays.toString(arr[i])+"]");
	}*/
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		int i,j;
		if (nums.length*nums[0].length!=r*c) {
			return nums;
		}
		int[][] newNums=new int[r][c];
		int or=0,oc=0;
		for(i=0;i<r;i++)
			for (j=0;j<c;j++) {
				newNums[i][j]=nums[or][oc];
				oc++;
				if (oc==nums[0].length) {
					or++;
					oc=0;
				}
			}
		return newNums;
    }
}