/*
   2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
    */

public class Q5 {

	   public static int gcd(int a, int b) 
	   {
	        while (b != 0) 
	        {
	            int temp = a;
	            a = b;
	            b = temp % b;
	        }
	        return a;
	    } 
	      

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = 1;
		
        for (int i = 1; i<21; i++)
        {
            int c = gcd(i, r);
            
            r = r / c * i;
        }
        System.out.println(r);
    }

	

}
	