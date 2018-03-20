package GuiBing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.omg.CORBA.INTERNAL;

public class Main {
	/*
	 * 测试数据：
	 * 	8 6
1 6 100
1 5 30
1 3 10
2 3 5
3 4 50
5 4 20
5 6 60
4 6 10
	 */
	public static void main(String[] args) {
	
			DJST();
			
		
		
		 
		
	
		
	}
	public static void SPFA()
	{
		int m,n;
		Scanner sc = new Scanner(System.in);
		  n =sc.nextInt();
		m = sc.nextInt();
		List<Eadge>[] map = new LinkedList[n];
			for(int i = 0;i<n;i++)
				map[i] = new LinkedList<Eadge>();
			for(int i = 0;i<m;i++)
			 {
				 int u = sc.nextInt();
				 int v = sc.nextInt();
				 int l = sc.nextInt();
				 map[u-1].add(new Eadge(v-1,l));
				
				
			 }
			//记录路径
			int[][] road = new int[n][n];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					road[i][j] = j;
				}
			}
		 int[] D = new int[n];
		 Arrays.fill(D, Integer.MAX_VALUE);
		 D[0] = 0;
		 Queue<Integer> que = new LinkedList<>();
		 que.add(0);
		while(!que.isEmpty())
		{
			int index = que.poll();
			for(Eadge edge:map[index])
			{
				if(D[index]+edge.wight < D[edge.index])
				{
					D[edge.index] = D[index]+edge.wight;
					if(!que.contains(edge.index))
					que.add(edge.index);
				}
			}
			
			
			
		}
		
		
		 //System.out.println();
		
		 for(int i =1;i<n;i++)
		 { 
			 if( D[i]!=Integer.MAX_VALUE)
				 System.out.println(D[i]);
			 
		 }
			
	}
	public static void DJST()
	{
		int m,n;
		Scanner sc = new Scanner(System.in);
		 m  =sc.nextInt();
		 n = sc.nextInt();
		 int [][] map = new int[n][n];
		 for(int h=0;h<n;h++)
		 Arrays.fill(map[h], 10001);
		 int[] road = new int[n];//road[i]表示以i为终节点的前驱
		 Arrays.fill(road,-1);
		road[0] = 0;
		 for(int i = 0;i<m;i++)
		 {
			 int u = sc.nextInt();
			 int v = sc.nextInt();
			 int l = sc.nextInt();
			 map[u-1][v-1] = l;
			
		 }
		 for(int j = 0;j<n;j++)
			 map[j][j] = 0;
	
		
		 int[] D = new int[n];
		 Arrays.fill(D, 10001);
		 for(int i = 0;i<n;i++)
		 {
			 D[i] = map[0][i];
			 road[i] = 0;
		 }
		 boolean[] fina = new boolean[n];
		 Arrays.fill(fina, false);
		 for(int i = 0;i<n;i++)
		 {
			 System.out.printf("%d ", D[i]);
		 }
		 for(int i=1;i<n;i++)
		 {
			 int index  = findTheMinIndex(D,fina);
			
			 
			 fina[index] = true;
			 for(int  j = 1;j < n;j++)
			 {
				 
				 if(D[j]!=Integer.MAX_VALUE  && map[index][j]+D[index] < D[j])
				 {
					 road[j] = index;
					 //System.out.println(D[j]+" "+j);
					 D[j] = map[index][j]+D[index];
					// System.out.println(D[j]+" "+j);
				 }
			 }
		 }
		 System.out.println();
		 for(int i = 0;i<n;i++)
		 {
			 System.out.printf("%d ", D[i]);
		 }
		 System.out.println();
		 for(int i = 0;i<n;i++)
		 {
			 System.out.printf("%d ", road[i]);
		 }
	}
	
	public static void Flored(int n, int[][] map)
	{
		 for(int i = 0;i<n;i++)//中间点
		 {
			 for(int j=0;j<n;j++)
			 {
				 
				if(map[j][i]!=Integer.MAX_VALUE)
				{
					 for(int k = 0;k<n;k++)
					 {
						 if(map[i][k]!=Integer.MAX_VALUE)
						 {
							 if(map[j][i]+map[i][k] < map[j][k])
								 map[j][k] = map[j][i]+map[i][k];
						 }
					 }
				}
			 }
		 }
		// Print(map);
		 for(int i = 1;i<n;i++)
		 {
			 if(map[0][i]!=Integer.MAX_VALUE)
				 System.out.println(map[0][i]);
		 }
		 
	}
	private static void Print(int[][] map) {
		for(int i = 0;i<map.length;i++)
		{
			for(int j=0;j<map[0].length;j++)
			{
				if(map[i][j]==Integer.MAX_VALUE)
					System.out.printf("%d ",0);
				else
				System.out.printf("%d ", map[i][j]);
			}
				
			System.out.println("");
		}
		
	}

	private static int findTheMinIndex(int[] d,boolean fina[]) {
		int min = Integer.MAX_VALUE;
		int index = -1;
		for(int i=1;i<d.length;i++)
		{
			if(fina[i]==false)
			{
				if(min >= d[i])
				{
					index = i;
					min = d[i];
				}
			}
		}
		return index;
	}
	

	
}

class Eadge
{
	public Eadge(int index,int wight)
	{
		this.index = index;
		this.wight = wight;
	}
	public int index;
	public int wight;
	
}


