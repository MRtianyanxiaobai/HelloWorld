package GuiBing;

import org.junit.Test;

public class GuiBin {
	public  int number = 0;
	public void hebing(int a[],int start,int mid,int end)
	{
		int i=start,j=mid+1,k=0;
		int []b = new int[a.length];
		
		while(i<= mid && j<=end)
		{
			if(a[i]<=a[j])
			{
				b[k] = a[i];
				i++;
				k++;
				
			}
			else {
				
				b[k] = a[j];
				j++;
				k++;
				number=(number+mid-i+1)%1000000007;
				
			}
		//	System.out.println("1");
		}
		while(i<=mid)
		{
			b[k] = a[i];
			i++;
			k++;
			//System.out.println("2");
		}
		while(j<=end)
		{
			b[k] = a[j];
			j++;
			k++;
			//System.out.println("3");
		}
		k = 0;
		 
		for(int ii=start;ii<=end;ii++)
		{
			a[ii] = b[k];
			k++;
		//	System.out.println("4");
		}
		 
		
	}
	
	public void sortHebin(int a[],int start,int end)
	{
		if(start>=end)
			return;
		sortHebin(a,start,(start+end)/2);
		sortHebin(a, ((start+end)/2)+1, end);
		hebing(a,start,(start+end)/2,end);
	}
	@Test
	public void test()
	{
		int a[]= {1,2,3,4,5,6,7,0};
		//int[] a = new int[200001];
//		for(int i=0;i<200000;i++)
//		{
//			a[i] = i;
//		}
		 
		//int a[]= {1,4,6,8,2,3,5};		
		//hebing( a , 0, 3,a.length-1);
		sortHebin(a, 0, a.length-1);
		for(int x:a)
		{
			System.out.println(x);
		}
		System.out.println("====="+number);
	}


}
/*
 public class Solution {
    public  int  number ;
	public void hebing(int a[],int start,int mid,int end)
	{
		int i=start,j=mid,k=0;
		int []b = new int[a.length];
		
		while(i< mid && j<end)
		{
			if(a[i]<=a[j])
			{
				b[k] = a[i];
				i++;
				k++;
				
			}
			else {
				
				b[k] = a[j];
				j++;
				k++;
				number=(number+mid-i)%1000000007
                    ;
			}
		//	System.out.println("1");
		}
		while(i<mid)
		{
			b[k] = a[i];
			i++;
			k++;
			//System.out.println("2");
		}
		while(j<end)
		{
			b[k] = a[j];
			j++;
			k++;
			//System.out.println("3");
		}
		k = 0;
		 
		for(int ii=start;ii<end;ii++)
		{
			a[ii] = b[k];
			k++;
		//	System.out.println("4");
		}
		 
		
	}
	
	public void sortHebin(int a[],int start,int end)
	{
		if(start>=end || end-start==1)
			return;
		sortHebin(a,start,(start+end)/2);
		sortHebin(a, (start+end)/2, end);
		hebing(a,start,(start+end)/2,end);
	}
    public int InversePairs(int [] array) {
        number = 0;
        if(array!=null)
        sortHebin(array,0,array.length);
        return number;
    }
    
}
 */
