package $222_CountCompleteTreeNodes_Tree_M;



class Solution {
	
    public int countNodes(TreeNode root) {
    	int num=0,h=getHeight(root);
    	while (root!=null) {
    		if (getHeight(root.right)==h-1) { //左子树满  节点=根+左=1+(2^h -1)=2^h
    			num+=1<<h;//2^h  
    			root=root.right;
    		}
    		else {
    			num+=1<<(h-1);//右子树满  节点=根+右=1+(2^(h-1)  -1)=2^(h-1)
    			root=root.left;
    		}
    		h--;//往下一层
    	}
    	return num;
        
    }
    
    public int getHeight(TreeNode root) {//可以设置一个hash Table 有些节点是重新计算高度了
    	int ans=-1;//空串高度为-1，一个节点高度为0；
    	while (root!=null) {
    		ans++;
    		root=root.left;
    	}
    	return ans;
    	
    	
    }
}
