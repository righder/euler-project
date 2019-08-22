/*
  By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
    */



public class Q7 {

	public static boolean isprime(long n)
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
	public static  long problem(long l)
	{
		long c1 = 0;
		long res = 0;
		
		for(long x= 1;c1 <= l;x++)
		{
			if(isprime(x))
			{
				res = x;
				c1++;
				
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long l =10001;
		System.out.println(problem(l-1));
		
            
             
	}
}
