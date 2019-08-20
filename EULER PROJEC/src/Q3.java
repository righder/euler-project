/*
    // The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
    */
public class Q3 {

public static void main(String[] args) {
		
		long n = 600851475143L;

		System.out.println(checkPrime(n));
	 
	}

private static long checkPrime(long num){
    
    long largest = 2;

    while(num % 2 == 0){
               num /= 2;
    }
    
    for (int i = 3; i <= Math.sqrt(num); i += 2){
        while (num % i == 0)
            num /= i; 

            if (largest < i)
                largest = i;
    }

    if(num > 2){
      largest = num;
   }
    return largest;

}
}
