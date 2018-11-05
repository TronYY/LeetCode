package $199_BinaryTreeRightSideView_DFS_M;


import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		
        l.add(0,1);
        l.add(0,3);
       
        TreeNode treeNode=new TreeNode(1);
        Solution solution=new Solution();
        List<Integer> list=solution.rightSideView(treeNode);
        
        //l.add(5,10);
        System.out.print(l.get(1));

	}

}
