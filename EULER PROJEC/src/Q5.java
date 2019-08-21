/*
   2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
    */
public class Q5 {

	public void divisible(int n)
	{
		boolean f = false;
		
		for(int n1 = 1; !f ; n1++)
		{
			boolean e = true;
			
			for(int j = 1;j<=n;j++)
			{
				if(n1%j != 0)
				{
					e = false;
				}
			}
			if(e)
			{
				System.out.println(n1);
				f = true;
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q5 p = new Q5();
		
		p.divisible(20);
		
	}

}
