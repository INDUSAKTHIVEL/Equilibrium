package Equilibrium;

import java.util.Scanner;

public class Array_equilibrium {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int pre_arr[]=pre_sum(arr);
		int val=eqiui(pre_arr);
		System.out.println(val);
	}
	public static int []pre_sum(int arr[])
	{
		int i;
		int pre_arr[]=new int[arr.length];
		pre_arr[0]=arr[0];
		for( i=1;i<arr.length;i++);
		{
			pre_arr[i]=pre_arr[i-1]+arr[i];
		}
		return pre_arr;
	}
	public static int eqiui(int []arr)
	{
		int per_arr[]=new int[arr.length];
		int count=0;
		int min=Integer.MAX_VALUE;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]==arr[arr.length-1]-arr[i])
			{
				count=count+1;
				if(min>i)
				{
					min=i;
				}
			}
		}
		if(count==0)
		{
			return -1;
		}
		return min;
	}

}
