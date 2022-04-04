package cw_geekster;
import java.util.Arrays;
import java.util.Scanner;

public class kidsCandies {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Enter size of an Arrays :");
		int size=sc.nextInt();
		
		int[]candies = new int[size];
		
		System.out.println("Enter Array : ");
		
		for(int i=0;i<size;i++) {
			candies[i]=sc.nextInt();
			
			System.out.println(kidsCandies(candies,size));
		}
		

	}
	
	private static String[] kidsCandies(int[] candies, int extraCandies) 
	{
		String[] temp=new String[candies.length];
		int maxCandies = Integer.MIN_VALUE;
		for (int val : candies) {
			maxCandies = Math.max(maxCandies, val);
		}
		for(int i=0;i<candies.length;i++)
		{
			temp[i]=(candies[i]+extraCandies>=maxCandies)?"true":"false";
		}
		System.out.println(Arrays.toString(temp));
		return temp;
	}
}
