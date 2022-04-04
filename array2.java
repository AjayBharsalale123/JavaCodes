package cw_geekster;

public class array2 {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
		int n=5;
		
		System.out.println(peakElement(arr,n));

	}
	
	public static int peakElement(int[] arr,int n)
    {
        if(arr[0]>=arr[1]){
       return 0;
   }
   else if(arr[n-1]>=arr[n-2]){
       return n-1;
   }
  for(int i =1 ; i<n-1 ; i++){
      if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
          return i;
      }

}
return n;
    }
}
