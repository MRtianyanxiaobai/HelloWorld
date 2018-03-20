package GuiBing;

import java.util.Stack;

import org.junit.Test;

public class String_Reverse {

	@Test
	public void test()
	{
		System.out.println( ReverseSentence("student. a am I"));
	}
	   public String ReverseSentence(String str) {
	        if(str==null || str.trim().equals(""))
	        	return str;
		   StringBuffer sb = new StringBuffer();
		   String str_sub[] = str.split(" ");
		   for(int i=str_sub.length-1;i>=0;i--)
		   {
			   sb.append(str_sub[i]+" ");
			   
		   }
		   return sb.toString().substring(0, sb.length()-2);
		   
	    }
}
