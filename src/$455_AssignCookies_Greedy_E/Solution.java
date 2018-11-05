package $455_AssignCookies_Greedy_E;

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0,ans=0;
        while (i<g.length && j<s.length)
            if (s[j]>=g[i]) {
                i++;
                j++;
                ans++;
            }
            else j++;
        return ans;

    }
}