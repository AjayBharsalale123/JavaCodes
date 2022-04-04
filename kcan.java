package cw_geekster;

import java.util.Arrays;
import java.util.Scanner;

public class kcan
{
    public static void main(String args[])
    {
        int[] arr = {1 , 4 , 5 , 6 , 7};
        int extraCandies = 5;
        for(boolean x : kCandies(arr , extraCandies))
            System.out.print(x + " ");
    }
    public static boolean[] kCandies(int[] candies , int extraCandies)
    {
        int n = candies.length , maxCandies = 0;
        
        for(int i = 0 ; i < n ; i++)
        	
            if(candies[i] > maxCandies)
            	
                maxCandies = candies[i];
        
        boolean[] result = new boolean[n];
        for(int i = 0 ; i < n ; i++)
            result[i] = (candies[i] + extraCandies >= maxCandies);
        return result;
    }
}