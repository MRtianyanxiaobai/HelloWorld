package Gonggongdian;

public class TreeNodeHight {
	private boolean flag = true;
	 public boolean IsBalanced_Solution(TreeNode root) {
		 getMaxSubDepth( root);
		 return flag;
	}
	 public int getMaxSubDepth(TreeNode root)
	 {
		 if(root==null)
			 return 0;
		 if(root.left.val>=root.val || root.right.val<=root.val) {
			 flag = false;
		 }
		 int  l = getMaxSubDepth(root.left);
		 int r = getMaxSubDepth(root.right);
		 if(Math.abs(l-r)>1) {
			 flag = false;
		 }
		 return Math.max(l, r);
	 }
	
}
