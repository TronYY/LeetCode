package $861_ScoreAfterFlippingMatrix_Greedy_M;

class Solution {
    public int matrixScore(int[][] A) {
        int m=A.length,n=A[0].length;//第一行是都翻为1
        int ans=(1<<(n-1))*m;
        for (int j=1;j<n;j++) {
            int temp=0;
            for (int i=0;i<m;i++)
                if (A[i][j]==A[i][0]) temp++;//temp是1的个数
            ans+=Math.max(temp,m-temp)<<(n-1-j);//后面每列看0与1哪个多，0多的话这一列要翻

        }
        return ans;

    }
}
