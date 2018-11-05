package $222_CountCompleteTreeNodes_Tree_M;



class Solution {
	
    public int countNodes(TreeNode root) {
    	int num=0,h=getHeight(root);
    	while (root!=null) {
    		if (getHeight(root.right)==h-1) { //��������  �ڵ�=��+��=1+(2^h -1)=2^h
    			num+=1<<h;//2^h  
    			root=root.right;
    		}
    		else {
    			num+=1<<(h-1);//��������  �ڵ�=��+��=1+(2^(h-1)  -1)=2^(h-1)
    			root=root.left;
    		}
    		h--;//����һ��
    	}
    	return num;
        
    }
    
    public int getHeight(TreeNode root) {//��������һ��hash Table ��Щ�ڵ������¼���߶���
    	int ans=-1;//�մ��߶�Ϊ-1��һ���ڵ�߶�Ϊ0��
    	while (root!=null) {
    		ans++;
    		root=root.left;
    	}
    	return ans;
    	
    	
    }
}
