package cw_geekster;

public class freqArray {
	
	 public static int missingNumber(int[] num)
	    {
	        int n=num.length;  // to assign num length to n variable
	        
	        int sum=((n+1)*(n+2))/2; // for calculation of sum
	        
	        for(int i=0;i<n;i++)	//logic for getting missing number
	          sum=sum-num[i];
	        return sum;
	    }
	    public static void main(String[] args)
	    {
	        int[] a = { 1, 3, 4, 5, 6};
	        System.out.println(missingNumber(a));
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
//		public static int frequency(int a[],int b, int c)
//			    {
//			        int count = 0;
//			        
//			        for (int i=0; i < c; i++)
//			        if (a[i] == b)
//			            count++;
//			        return count;
//			    }
//			     
//			    
//			    public static void main (String[] args) {
//			         
//			        int a[] = {2,4,5,6,2,2,6,7};
//			        int b=2;
//			        int c=a.length;
//			         
//			        System.out.println(frequency(a, b, c));

	}


