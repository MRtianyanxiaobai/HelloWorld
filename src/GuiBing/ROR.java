package GuiBing;

import java.util.LinkedList;
import java.util.Stack;

import javax.print.DocFlavor.STRING;

import org.junit.Test;

public class ROR {
	@Test
	public void mian() {
		String str = new String("123456");
//		String str1="123";
//		String str2 = "456";
//		String str3=str1+str2;
		Stack<Character> stacks = new Stack<Character>();
		for(Character c:str.toCharArray())
		{
			stacks.push(c);
		}
		StringBuffer sb = new StringBuffer();
		while(!stacks.isEmpty())
		sb.append(stacks.pop());
		//return sb.toString();
		
		 //System.out.println(str3);
		} 
	    public String LeftRotateString(String str,int n) {
	    	
	    	char strs[] = str.toCharArray();
	    	StringBuffer sb = new StringBuffer(str);
	    	
	    	for(int i=0;i<n;i++)
	    	{
	    		//swap(strs,i,str.length()-n+i);
	    		sb.append(strs[i]);
	    	}
	    	
			return sb.toString().substring(n);
	        
	    }
		private void swap(char[] strs, int i, int j) {
			// TODO Auto-generated method stub
			char c = strs[i];
			strs[i] = strs[j];
			strs[j] = c;
			
		}
	 
}
