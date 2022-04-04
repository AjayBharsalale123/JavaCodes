package cw_geekster;

public class array {  
	
	
   public static int max(int [] array) {  
      int max = 0;  
  
      for(int i=0; i<array.length; i++ ) {  
         if(array[i]>max) {  
            max = array[i];  
         }  
      }  
      return max;  
   }  
   
   public static int min(int [] array) {  
      int min=array[0];  
     
      for(int i = 0; i<array.length; i++ ) {  
         if(array[i]<min) {  
            min = array[i];  
         }  
      }  
      return min;  
   }  
   
   
  
   public static void main(String args[]) {  
	   int[] array = {1,5,8,89,60};
        
     System.out.println("Maximum value in the array is::"+max(array));  
     System.out.println("Minimum value in the array is::"+min(array));  
   }  
}  