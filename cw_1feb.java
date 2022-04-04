package cw_geekster;
import java.util.*;

public class cw_1feb {

	
		 public static int add(int n) {
		        int res=0;
		        for (int i = 0; i <= n; i++) {
		            res +=i;
		            
		        }
		        return res;
		    }
		    public static int factorial(int n) {
		        int res2 =1;
		        for (int i = 1; i <= n; i++) {
		            res2 *= i;
		            
		        }
		        return res2;
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("N = ");
		        int n = sc.nextInt();
		        System.out.println("Enter 1 for Addition or 2 for Factorial : ");
		        int choice = sc.nextInt();
		        if(choice==1){
		            int result1=add(n);
		            System.out.println(result1);
		            
		        }else if(choice ==2){
		            int result2 = factorial(n);
		            System.out.println(result2);
		            
		        }else
		        System.out.println("-1");
		        
		        sc.close();
		    }
		

	}


