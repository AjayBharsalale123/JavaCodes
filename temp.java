package cw_geekster;
import java.util.Scanner;

import java.util.Arrays;

public class temp  {  
  
	public static void main(String args[])   {   
		
		int [] arr= {1,2,3,4,5};
		int [] arr1= {5,6,3,2,1};
		
		boolean isper=isPermu(arr,arr1);
		System.out.println(isper);
 
		         
//		        Scanner sc = new Scanner(System.in);
//		        System.out.print("How many days' temperatures? ");
//		        int numDays = sc.nextInt();
//		        float sum=0;
//		        int arr[]=new int[numDays];		        
//		        for (int i = 0; i <numDays; i++) {
//		        System.out.print("Day " + i + " temp: ");
//		           arr[i] = sc.nextInt();
//		           sum =sum + arr[i];
//		       }
//		      float average =  sum / numDays;
//		        System.out.println();
//		      System.out.println("Average = " + average);
//		      
//		      int count=0;
//		      
//		      for(int i=0;i<arr.length;i++)
//		      {
//		    	  if(arr[i]>average)
//		    	  {
//		    		  count++;
//		    	  }
//		      }
//		      
//		      System.out.println(count);
		      }
	
	
	public static boolean isPermu(int arr1[],int[]arr2) {
		int sum=0,sum1=0;
		int mul=1,mul1=1;
		for(int i=0;i<arr1.length;i++) {
			 sum=sum+arr1[i];
			 mul=mul*arr1[i];
		}
		for(int i=0;i<arr1.length;i++) {
			 sum1=sum1+arr2[i];
			 mul1=mul1*arr2[i];
		}
		
		if(sum==sum1 && mul==mul1) {
			return true;
		}
		else {
			return false;
		}
	}
		 }
					  
