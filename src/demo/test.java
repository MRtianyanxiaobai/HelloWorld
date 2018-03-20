package demo;

/*
 * 求最长公共子序列 
	问题描述:
		 现在有一个字符串Str1，以及str2.
		 	现在找第三个串str3在str1，str2中出现，但是不要求在str1和str2中连续出现
	例如：s1="7123456789"
			s2="121114789"
			则s3=14789	
			s2="12114789713459"
			s3=713459
 */
public class test {
	public static int getInext(String str1,char num,int i)
	{
		
		for(int j=i;j<str1.length();j++)
		{
			if(num==str1.charAt(j))
				return j;
		
		}
			return -1;
	}
	public static int getIndex(String str1,char num)
	{
		
		for(int j=0;j<str1.length();j++)
		{
			if(num==str1.charAt(j))
				return j;
		
		}
			return -1;
	}
	
	public static void main(String[] args) {
		String s1="07123456789";
		String s2="012114789713459";
		String s3="";
		int[][] map = new int[s2.length()][s1.length()];//用来记录步数
		for(int i=0;i<s1.length();i++)
		{
			map[0][i] = 0;
		}
		for(int i=0;i<s2.length();i++)
		{
			map[i][0] = 0;
		}
		for(int i=1;i<s2.length();i++)
		{
			for(int j=1;j<s1.length();j++)
			{
				if(s2.charAt(i)==s1.charAt(j))
				{
					map[i][j]=map[i-1][j-1]+1;
					
				}
				else if(s1.charAt(j) != s2.charAt(i))
				{
					map[i][j] = Math.max(map[i-1][j],map[i][j-1]);
				}
			}
		}
		for(int i=0;i<s2.length();i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				System.out.printf("%d", map[i][j]);
			}
			System.out.printf("\n");
		}
		int m = s2.length()-1;
		int n = s1.length()-1;
		while(s3.length()<map[s2.length()-1][s1.length()-1])
		{
			if(s2.charAt(m)==s1.charAt(n))
			{
				System.out.println(s2.charAt(m));
				s3+=s2.charAt(m);
				m--;
				n--;
				
			}
			else 
			{
				if(map[m-1][n]>map[m][n-1])
					m--;
				else
					n--;
				
			}
		}
		System.out.println(new StringBuffer(s3).reverse().toString());
		
	}

}
