package it.beije.malang;

public class Fibonacci {
	
	private static void print(int[] array) {
		for (int i=0;i<array.length;i++) {
			if (array[i]!=0)
				System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
	int [] nums; 
	nums=new int[20];
	for (int i=0;i<20;i++)
	{
		if (i<=1) {
			nums[i]=i+1;
		}
		else
		{
			nums[i]=nums[i-2]+nums[i-1];
		}
		print(nums);
	}
	}
}
