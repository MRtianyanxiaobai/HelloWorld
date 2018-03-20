package Gonggongdian;

import java.awt.List;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

/*
 	输入两个链表，找出它们的第一个公共结点。
 */
public class gonggongdian {
	
		public static void main(String[] args) {
			
		}
		public ListNode FindFirstCommonNode2(ListNode pHead1, ListNode pHead2)
		{
			Stack<ListNode> stack1 = new Stack<ListNode>();
			Stack<ListNode> stack2 = new Stack<ListNode>();
			ListNode head1 = pHead1;
			ListNode head2 = pHead2;
			while(head1!=null)
			{
				stack1.push(head1);
				head1 = head1.next;
			}
			while(head2!=null)
			{
				stack2.push(head2);
				head2 = head2.next;
			}
			if(stack1.isEmpty() || stack2.isEmpty())
				return null;
			ListNode node = null;
			while(!(stack1.isEmpty() || stack2.isEmpty()))
			{
				ListNode node1 = stack1.pop();
				ListNode node2 = stack2.pop();
				if(node1==node2)
				{	node=node1;
					//break;
				}
				else
					break;
					
			}
			return node;
//			return pHead2;
			
		}
	    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
			HashMap<Integer, Integer> maps = new HashMap<>();
			ListNode head = pHead1;
			while(head.next!=null)
			{
//				if(maps.containsKey(head.val))
				maps.put(head.val,1);
				head = head.next;
				
			}
			head = pHead2;
			while(head.next!=null)
			{
				if(maps.containsKey(head.val)) {
					return head;
				}
			}
			return null;
			
			
			
	    	
	    }
	
	
}
 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
