/*
      Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
    */
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int sum = 0, i = 2;
		     
		     int a = 0,b = 1,c;
		     
		     while(true){
		    	 
		     c = a+b;
		     a = b;
		     b = c;
		     
		          System.out.println(c);
		     
		     if(c > 4000000)
		    	 break;
		     
		     if(c%2 == 0)
		     {
		    	 sum = sum+c;
		    	 
		     }
		       i++;
		     
		     }
		         System.out.println("sum is " + sum);
			}

}
