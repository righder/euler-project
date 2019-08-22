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
		boolean f = true;
		if(n%2==0)
			return false;
		for(long i=3;i*i<=n;i=i+2)
		{
			if(n%i==0)
				return false;
		}
		return f;
		
}
}
