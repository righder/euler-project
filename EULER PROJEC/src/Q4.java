/*
     A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
    */
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 1;
		int curr;
		
		int pcurr = 0;
		
		
		for(int x = 100; x < 1000; x++ )
	    { 
			
			
			for(int y = 100; y < 1000; y++ )
				
			{
				
				  p = x*y;
				
				if(ispalindrome(Integer.toString(p)))
				{
					System.out.println(p);
					
					
					if(p > pcurr)
					{
						pcurr = p;
					}
					
				}
		}
		}
		System.out.println("greatest palindrome is : " + pcurr);
	}

	private static boolean ispalindrome(String s) {
		// TODO Auto-generated method stub
		
		String st = "";
		
	    for(int i = s.length();i>0;i--)
		{
			st = st + s.charAt(i-1);
		}
		   if(s.equals(st))
		{
			return true;
		}
		 return false;
	}
}
