package cw_geekster;

public class stringCompare {
	  public static boolean checkEquality(String[] s1, String[] s2)    {
	       boolean strcmp=true;
	       int n=s1.length;
	       int n1=s2.length;
	       
	 
	        for (int i = 0; i < n; i++){
	        	for(int j=0;j<n1;j++) {
	        		
	            if (s1[i].equals(s2[i])) {
	            	
	                return true;
	            }
	        }
	        }
	 
	        return false;
	    }
	 
	    public static void main(String[] args)
	    {
	        String[] s1 = { "ab", "c"};
	        String[] s2 = { "a", "bc"};
	 
	        if (checkEquality(s1, s2));
	        
	    }
	}


