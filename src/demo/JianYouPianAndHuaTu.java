package demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class JianYouPianAndHuaTu {
	//static String[] strs = new String[10];
		static List<String> lists = new LinkedList<>();
		public static void swap(int x,int y,int a[])
		{
			int t = a[x];
			a[x] = a[y];
			a[y] = t;
		}
		public static boolean IsXiangLin(String str,int aid,int ...args)
		{
			for(int x:args)
			{
				if(Math.abs(str.charAt(aid)-str.charAt(x))==1)
					return true;
			}
			return false;
		}
		public static boolean IsXiangLin2(int a,int b )
		{
			if(Math.abs(a-b)==4)
				return true;
			if(Math.abs(a-b)==1)
			{
				if(a%4==0 && b%4==3)
					return false;
				if(b%4==0 && a%4==3)
					return false;
				return true;
			}
			return false;
		}
		public static void main(String[] args) {
			/*int[] a = new int[5];
			for(int i=0;i<a.length;i++)
			{
				a[i] = i;
			}
			quanPai(a, 0);*/
			quanPai2();
			
			/*int count = 0;
			for(String str:lists)
			{
				//System.out.println(str);
				if(!IsXiangLin(str,0,1,3,4,5) && !IsXiangLin(str, 1,0,4,5,6,2)
						&& !IsXiangLin(str, 2, 1,5,6)
						&& !IsXiangLin(str, 3, 0,4,7,8)
						&& !IsXiangLin(str, 4, 0,1,3,5,7,8,9)
						&& !IsXiangLin(str, 5, 0,1,2,4,6,8,9)
						&& !IsXiangLin(str, 6, 1,2,5,9)
						&& !IsXiangLin(str, 7, 3,4,8)
						&& !IsXiangLin(str, 8, 3,4,5,7,9)
						&& !IsXiangLin(str, 9, 4,5,6,8)
						)
				{
					count++;
					
				}
					
			}
			System.out.println(count);*/
			//System.out.println(lists.size());
		}
		 
		public static void quanPai2()
		{
			//int count=0;
			Set<String> sets = new HashSet<>();
			for(int i1=0;i1<12;i1++)
			{
				
				for(int i2=0;i2<12;i2++)
				{
					if(i1==i2)
					continue;
					for(int i3=0;i3<12;i3++)
					{
						if(i3==i2 || i3==i1 )
						continue;
						for(int i4=0;i4<12;i4++)
						{
							if(i4==i3 || i4==i2 || i4==i1)
							continue;
							for(int i5=0;i5<12;i5++)
							{
								if(i5==i3 || i5==i2 || i5==i1 || i5==i4)
								continue;
								int a[] = {i1,i2,i3,i4,i5};
								if(IsXiangJin(a))
								{
									//System.out.println("123");
						
									Arrays.sort(a);
									sets.add(getSring2(a));
									//System.out.println(" "+i1+" "+i2+" "+i3+" "+i4+" "+i5);
									//count++;
								}
							}	
						}	
					}	
				}
			}
			String[] ss = new String[sets.size()]; 
			int k=0;
			for(String s:sets)
			{
				ss[k] =s;
				k++;
			}
			Arrays.sort(ss);
			for(String s:ss)
			{
				System.out.println(s);
			}
			System.out.println(sets.size());
		}
		private static boolean IsXiangJin(int[] a) {
			int count=0;
			for(int i = 0;i<a.length;i++)
			{	// flag = false;
				for(int j =0;j<i;j++)
				{
					
					if(IsXiangLin2(a[i],a[j]))
					{
						
						count++;
						break;
					}
					
				}
				
					
			}
			if(count==4)
				return true;
			return false;
		}
		public static void quanPai(int a[],int size)
		{
			if(size == a.length)
			{
				lists.add(getSring(a));
				//System.out.println();
			}
			//size以前的已经都交换过了，所以不用再交换之前的了哦
			for(int i = size;i<a.length;i++)
			{
				swap(i, size, a);
				quanPai(a,size+1);
				swap(i, size, a);
				
			}
		}
		public static String getSring2(int a[])
		{
			StringBuffer sb = new StringBuffer("");
			for(int x:a)
			{
				sb.append(" "+x);
			}
			return sb.toString();
		}
		public static String getSring(int a[])
		{
			StringBuffer sb = new StringBuffer("");
			for(int x:a)
			{
				sb.append(""+x);
			}
			return sb.toString();
		}
}
