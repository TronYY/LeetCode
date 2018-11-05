package $337_HouseRobberIII_DFS_M;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class Solution {
	//Map<TreeNode, int[]> map;//jy�����ֵ����
	
    public int rob(TreeNode root) {
    	//map=new HashMap<>();//jy��ʼ����Map�ǽӿ�
    	
    	int[] result=new int[2];
    	result=robSub(root);
    	return Math.max(result[0], result[1]);
        
    }
    
    public int[] robSub(TreeNode root) {
    	if (root==null) return new int[] {0,0};
    	
    	//if (map.containsKey(root)) return map.get(root);//jy hash map ����
    	
    	int[] result=new int [2];//result[0]�����ڲ����root������£���rootΪ���ܹ���ٶ��٣�result[1]������root
    	int [] left=robSub(root.left);
    	int [] right=robSub(root.right);//�������ظ�������Բ�������hash
    	result[0]=Math.max(left[0], left[1])+Math.max(right[0], right[1]);
    	result[1]=root.val+left[0]+right[0];
    	
    	//map.put(root, result);//jy hash map ����
    	return result;
    	
    }
}
