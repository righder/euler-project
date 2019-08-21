/*
  The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
    */
public class Q6 {

	static int Sq(int num){ 
		  
		int a, b, c; 
		    
		    a = (num * (num + 1) * (2 * num + 1)) / 6; 
		         
		    b = (num * (num + 1)) / 2; 
		    b = b * b; 
		      
		    c = Math.abs(a - b); 
		      
		    return c; 
		  
		} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 int n = 100; 
		    System.out.println(Sq(n));   
	
}
}