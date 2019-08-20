/*
      The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.


    */
public class Q10 {

	public static void main(String[] args)
	{
		 long sum = 2;
		 
		    for (int i=3; i<2000000; i++)
		    {
		        if(isPrime(i)) 
		        {
		            sum = sum + i;
		        }    
		    }
		       System.out.println("Sum  = "+sum);
	}
	 static boolean isPrime(int n)
	 {
		 int c=0;
	       
         long sq = (long) Math.sqrt(n);
         for(long i =1;i<= sq;i++)
         {
        	 if(n%i == 0)
        		 c++;
        	 
        	 if(c>1)
        		 return false;
        		 
         }
         return true;
	}
}
