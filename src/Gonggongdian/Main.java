package Gonggongdian;

import java.util.Arrays;

public class Main {
	public static void swap(int a[],int b,int c)
	{
		int t = a[b];
		a[b] = a[c];
		a[c] = t;
	}
	public static void main(String[] args) {
		int[] a = new int[5];
		for(int i = 1;i<5;i++)
		{
			a[i] = i;
		}
		int lenght = a.length;
		showA(a,1,lenght);
		
	}
	
	private static void showA(int[] a,int size, int lenght) {
	
		for(int j=size;j<lenght;j++)
		{
			swap(a, j, size);
			//size++;
			showA(a,size+1,lenght);
			swap(a, j, size);
		}
		if(size==lenght)
		{
			for(int i=1;i<lenght;i++)
			{
				System.out.printf("%d ", a[i]);
			}
			System.out.println();
		}
		
	}

	
}
