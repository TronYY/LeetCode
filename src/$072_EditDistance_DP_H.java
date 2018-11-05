public class $072_EditDistance_DP_H {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int editDistanceTable[][]=new int[m+1][n+1];
        int i,j;
        for (i=0;i<=n;i++) editDistanceTable[0][i]=i;
        for (i=0;i<=m;i++) editDistanceTable[i][0]=i;

        for (i=1;i<=m;i++) //str1+a
            for (j=1;j<=n;j++) { //str2+b
                //???str1+a??str2,??b
                int temp = editDistanceTable[i][j-1]+1;

                //???str1??str2+b???a
                temp = Math.min(temp,editDistanceTable[i-1][j]+1);

                //str1??str2
                if (word1.charAt(i-1)==word2.charAt(j-1)) {
                    temp = Math.min(temp, editDistanceTable[i - 1][j - 1]);
                } else {
                    temp = Math.min(temp,editDistanceTable[i-1][j-1]+1);//????????
                }
                editDistanceTable[i][j]=temp;
            }
        return editDistanceTable[m][n];
    }
}
