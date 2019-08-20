/*
       A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
       a2 + b2 = c2
       For example, 32 + 42 = 9 + 16 = 25 = 52.

       There exists exactly one Pythagorean triplet for which a + b + c = 1000.
       Find the product abc.
    */

public class Q9 {

	public static long py(int l)
	{
		long res = 0;
		 for (int a = 3; a <= l; a++)
		 {
			 
	            for (int b = a + 1; b < l; b++) 
	            {
	                
	                double c = Math.pow(a,2) + Math.pow(b,2);
	                
	                   c = Math.sqrt(c);
	                
	                if (a + b + c == l)
	                {
	                	
	                	System.out.println(a +" " +b+" "+c);
	                	
	                    res =  (long)(a * b * c);
	                      
	                         break;
	                }
	            }
	        }
		 return res;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int l = 1000;
	System.out.println(py(1000));
			
		 }
}
