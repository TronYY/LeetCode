package $454_4SumII_BS_M;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
    	Map<Integer, Integer> map=new HashMap<>();//jy初始化，Map是接口  
    	int v=0,sum=0,ans=0;
    	for (int i=0;i<A.length;i++)
    		for (int j=0;j<B.length;j++) {
    			sum=A[i]+B[j];
    			v=map.getOrDefault(sum, 0)+1;
    			map.put(sum, v);
    		}
    	for (int i=0;i<C.length;i++)
    		for (int j=0;j<D.length;j++) {
    			sum=C[i]+D[j];
    			if (map.containsKey(-sum)) ans+=map.getOrDefault(-sum, 0);
    			
    		}
    	return ans;
    			
    	
    }
}