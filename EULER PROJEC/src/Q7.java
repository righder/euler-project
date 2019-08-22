/*
  By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
    */



public class Q7 {

	public static boolean isprime(long n)
	{
		int c=0;
        for(long i =1;i<= Math.sqrt(n);i++)
        { if(n%i == 0)
       		 c++;
       	 if(c>1)
       		 return false; }
        return true;
	}
	public static  long problem(long l)
	{
		long c1 = 0;
		long res = 0;
		
		for(long x= 2;c1 <= l;x++)
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
