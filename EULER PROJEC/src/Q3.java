import java.util.Scanner;

/*
    // The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
    */
public class Q3 {

public static void main(String[] args) {
	
  
          long n = 600851475143L;
          
	      int max =0;
	      long p = 0;
	      
	      for(int i = 2; i< n; i++) {
	    	  
	         while(n%i == 0) {
	           
	            n = n/i;
	         }
	      }
	      if(n >2) {
	    	  
	        if(n>max)
	        {
	        	 p = n;
	        }
	        System.out.println("ans is : " +p);
	      }
	   }
	 
	}



