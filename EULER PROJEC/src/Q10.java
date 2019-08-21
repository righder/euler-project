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
		 if(n<2){
				return false;}
			
			else if(n == 2){
				return true;}
			
			for(int i = 2;i< Math.pow(n,0.5)+1;i++)
			{
				if(n%i == 0)
					return false;
			}
			return true;
	}
}
