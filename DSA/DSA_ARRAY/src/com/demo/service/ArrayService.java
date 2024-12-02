package com.demo.service;

public class ArrayService {



	public static int findMax(int[] arr) {
		int max= arr[0];
		for(int i=1;i<arr.length;i++)
			if( arr[i]>max)
			{
				max=arr[i];
			}	
		return max;
	}


	public static int findSecondMax(int[] arr) {

		int max=arr[0],xmax=0;
		for(int i=1;i<arr.length;i++)
			if(arr[i]>max) {
				xmax=max;
				max=arr[i];
			}
		return xmax;
	}

	public static int findPrimeSum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(isPrime(arr[i])) {
				System.out.println("data"+arr[i]);
				sum=sum+arr[i];
			}
		}

		return sum;
	}

	
	
	private static boolean isPrime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	

	public static int SequentialSearch(int[] arr, int val) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==val) {
				return i;
			}
		}
		return -1;
	}
	
	

	public static int findMin(int[] arr) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
			if(arr[i]<min) {
				min=arr[i];
			}
		return min;
	}
	
	public static int test(int[] arr) {
		int a=arr[0];   
		for(int i=0;i<arr.length;i++) {  
			if(a>=0)
				 return a;  
		
	}
		return -1;  
	}

}
