package Gonggongdian;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
/*
 ����һ�ö����������������ȡ�
 	�Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·����
 	�·���ĳ���Ϊ������ȡ� 
 */
public class qiu_erchashu_shengdu {
	 public int TreeDepth(TreeNode root) {

		 int number = 0;//��¼��������
		 Queue<TreeNode> que1 = new ArrayDeque<TreeNode>();
		 Queue<TreeNode> que2 = new ArrayDeque<TreeNode>();
		 if(root==null)
			 return 0;
		 que1.add(root);
		 number++;
		 while(!que1.isEmpty() ) {
			 while(!que1.isEmpty())
			 {
				 TreeNode node = que1.remove();
				if(node.left!=null)
				 que2.add(node.left);
				if(node.right!=null)
					que2.add(node.right);
			 }
			 if(!que2.isEmpty())
			 number++;
			 while(!que2.isEmpty())
			 {
				 TreeNode node = que2.remove();
				 que1.add(node);
			 }
		
		 }
		 return number;
		 
		 
		 
	        
	  }
	 public int TreeDepth3(TreeNode root) {
		   if(root==null)
				 return 0;
			 return Math.max(TreeDepth3(root.left)+1, TreeDepth3(root.right)+1);
	 }
	 public int TreeDepth2(TreeNode root) {
		 if(root==null)
			 return 0;
		 Queue<TreeNode> que = new ArrayDeque<TreeNode>();
		 int number = 0;
		 TreeNode numbernode = new TreeNode(Integer.MAX_VALUE);
		 que.add(root);
		 que.add(numbernode);
		 while(!que.isEmpty())
		 {
			 TreeNode node = que.remove();
			 if(node.val!=Integer.MAX_VALUE)
			 {
				 if(node.left!=null)
					 que.add(node.left);
				 if(node.right!=null)
					 que.add(node.right);
			 }
			 else {
				 number++;
				 if(!que.isEmpty())
				 que.add(node);
			 }
			 
		 }
		 return number;
		 
		 
	 }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}
