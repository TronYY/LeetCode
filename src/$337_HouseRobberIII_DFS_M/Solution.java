package $337_HouseRobberIII_DFS_M;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class Solution {
	//Map<TreeNode, int[]> map;//jy定义键值类型
	
    public int rob(TreeNode root) {
    	//map=new HashMap<>();//jy初始化，Map是接口
    	
    	int[] result=new int[2];
    	result=robSub(root);
    	return Math.max(result[0], result[1]);
        
    }
    
    public int[] robSub(TreeNode root) {
    	if (root==null) return new int[] {0,0};
    	
    	//if (map.containsKey(root)) return map.get(root);//jy hash map 查找
    	
    	int[] result=new int [2];//result[0]代表在不打劫root的情况下，以root为树总共打劫多少；result[1]代表打劫root
    	int [] left=robSub(root.left);
    	int [] right=robSub(root.right);//不存在重复计算可以不用设置hash
    	result[0]=Math.max(left[0], left[1])+Math.max(right[0], right[1]);
    	result[1]=root.val+left[0]+right[0];
    	
    	//map.put(root, result);//jy hash map 插入
    	return result;
    	
    }
}
