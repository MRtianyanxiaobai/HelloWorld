package Gonggongdian;

import java.util.Arrays;

import org.junit.Test;

//num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
//��num1[0],num2[0]����Ϊ���ؽ��
public class liang_ge_shu_zhi_chu_xian_yi_ci {
	
	/*
	 	��Ϊ�����е����ֶ������������ɶԴ��ڣ����Կ��ǽ����������һ��
	 	1^1 = 0
	 	2^2 = 0
	 	0^0	= 0
	 	0^1 = 1
	 	�κ���������������0
	 	�κ�����0���õ�������
	 	 
	 	 ����˵�����������õ��ıض����������¶��������ô�������������¶��ֿ��أ�
	 	 	���԰��������¶��Ŵ����������飨�������������ֱ��г���һ���¶��������ǳɶԴ��ڣ����棬�����ͽ����Ƿֿ���
	 	��ô���������������¶��ֿ��أ�����ȥ�������������������ǵġ�1��λ����Ϊ������λ�ӵ���λ1����ʾ�������¶������λ�ӵ���
	 		�պ����෴�ģ��������ǾͿ��԰����Ǹ��ֿ���
	 */
	public  void FindNumsAppearOnce2(int [] array,int num1[] , int num2[]) {
		int x=0;
		for(int s:array)
		{
			x=x^s;
		}
		int index = findindex(x);
		int len0=0,len1=0;
		int[] a0 = new int[array.length];
		int[] a1 = new int[array.length];
		
		for(int i=0;i<array.length;i++)
		{
			if(IsPointInde(array[i], index))
			{
				
				a1[len1]=array[i];
				len1++;
			}
			else {
				a0[len0]=array[i];
				len0++;
			}
			
		}
	//System.out.println(index+"  "+Arrays.toString(a0)+"\n"+Arrays.toString(a1));
		num2[0]=0;
		num1[0]=0;
		for(int i=0;i<a0.length;i++)
		{
			num1[0]=num1[0]^a0[i];
			
			
		}
		for(int i=0;i<a1.length;i++)
		{
			num2[0]=num2[0]^a1[i];
			
			
		}
		System.out.println(num1[0]+" "+num2[0]);
		
	}
	boolean IsPointInde(int x,int index)
	{
		x = x>>index;
		if((x&1)==1)
			return true;
		return false;
	}
	int findindex(int x)
	{
//		int index=0;
		for(int i=0;i<Integer.SIZE;i++)
		{
			
			if((x&1)==1)
			{
				return i;
			}
			x = x>>1;
			
		}
		return -1;
	}
	
	
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
    	num1[0]=Integer.MAX_VALUE;
    	num2[0] = Integer.MAX_VALUE;
    	Arrays.sort(array);
		 
		for(int i=0;i<array.length;i++)
		{
            if(i==0&&array[i]!=array[i+1])
            {
               if(num1[0]==Integer.MAX_VALUE)
            	   num1[0] = array[i];
               else
            	   num2[0]=array[i];
            }
            if(i==array.length-1 && array[i]!=array[i-1])
            {
            	if(num1[0]==Integer.MAX_VALUE)
             	   num1[0] = array[i];
                else
             	   num2[0]=array[i];
            }
			if(i>0 && i<array.length-1 && array[i]!=array[i+1] && array[i]!=array[i-1])
			{
				if(num1[0]==Integer.MAX_VALUE)
	            	   num1[0] = array[i];
	               else
	            	   num2[0]=array[i];
			}
		}
		 
		System.out.println(num1[0]+" " +num2[0]);
		 
    }
    
    	@Test
    	public  void main() {
			int a[]= {2,2,1,3,1,4};
			int[] a1= new int[1];
			int[] a2 =  new int[1];
			FindNumsAppearOnce2(a,a1,a2);
		}
    
}
