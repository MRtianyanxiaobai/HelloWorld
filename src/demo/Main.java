package demo;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		int[] a = new int[8];
		int n = 10;
		for(a[0]= 1;a[0]<n;a[0]++)
		{
		for(a[1]= 0;a[1]<n;a[1]++)
		{
			if(a[1]==a[0])
				continue;
		for(a[2]= 0;a[2]<n;a[2]++)
		{
			if(a[2]==a[0] || a[2]==a[1])
				continue;
		for(a[3]= 0;a[3]<n;a[3]++)
		{
			if(a[3]==a[0] || a[3]==a[1] || a[3]==a[2])
				continue;
			
				String s  = new String(""+a[0]+a[1]+a[2]+a[3]);
				int x = Integer.parseInt(s);
			for(a[4]= 1;a[4]<n;a[4]++)
			{
				if(a[4]==a[0] || a[4]==a[1] || a[4]==a[2] ||a[4]==a[3])
					continue;
			for(a[5]= 0;a[5]<n;a[5]++)
			{
				if(a[5]==a[0] || a[5]==a[1] || a[5]==a[2] 
						||a[5]==a[3] || a[5]==a[4])
					continue;
			for(a[6]= 0;a[6]<n;a[6]++)
			{
				if(a[6]==a[0] || a[6]==a[1] || a[6]==a[2] 
						||a[6]==a[3] || a[6]==a[4] ||a[6]==a[5])
					continue;
			for(a[7]= 0;a[7]<n;a[7]++)
			{
				if(a[7]==a[0] || a[7]==a[1] || a[7]==a[2] 
						||a[7]==a[3] || a[7]==a[4] ||a[7]==a[5] || a[7]==a[6])
					continue;
				String s2  = new String(""+a[4]+a[5]+a[6]+a[1]);
				int y= Integer.parseInt(s2);
				String s3 = new String(""+a[4]+a[5]+a[2]+a[1]+a[7]);
				int z = Integer.parseInt(s3);
				if(z==x+y)
				{
					System.out.println(s3+"="+s+"+"+s2);
				}
			}
						
			}
					
			}
				
			}
		}
					
		}
				
		}
			
		}
		
				
		
		System.out.println(System.currentTimeMillis() - time);
		
		
		
	}
	public static int getThreeSquart(int x,int y,int z)
	{
		return x*x+y*y+z*z;
	}
}
