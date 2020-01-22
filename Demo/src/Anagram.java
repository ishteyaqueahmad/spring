import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	 static boolean isAnagram(String a, String b) {
		 
	      char[] first=a.toLowerCase().toCharArray();
	       char[] sec=b.toLowerCase().toCharArray();
	     
	       if(first.length!=sec.length)
	       {
	    	   return false;
	       }
	       else {
	    	   Arrays.sort(first); 
		        Arrays.sort(sec); 
	    	   for (int i = 0; i < sec.length; i++) 
	               if (first[i] != sec[i]) 
	                   return false; 
	     
	           return true; 
	    	  
	       }
	    }

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

}
