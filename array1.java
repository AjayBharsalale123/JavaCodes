package cw_geekster;

public class array1 {

	  
	   public static void main(String[] args)  
	   {  
	      final int n = 6;    
	      int[] random_array;  
	   
	      random_array = create_random(n);  
	      System.out.println("The array of random numbers is:");  
	      for (int i = 0; i <random_array.length; i++)  
	      {  
	          System.out.print(random_array[i] + " ");  
	      }  
	   }  
	   
	   public static int[] create_random(int n)  
	   {  
	        
	      int[] random_array = new int[n];  
	   
	    
	      for (int i = 0; i <random_array.length; i++)  
	      {  
	          random_array[i] = (int) (Math.random() * 10);  
	      }  
	    
	     return random_array;  
	   }  
	}  
