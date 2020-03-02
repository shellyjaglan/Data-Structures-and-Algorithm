class SieveOfEratosthenes
{
    void sieveOfEratosthenes(int n)
    {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;
         
        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }
         
         int product  = 1;
        // Print all prime numbers
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true){
                product = product* i;
               System.out.print(i + " ");
            }
        }
        System.out.print("product is: " + product);
    }

     public int countPrimes(int n) {
        int count = 0;
        if(n == 2)
            return 0;
        for(int i=2; i<=n; i++)
        {
            /* Assume that the current number is Prime */
            int isPrime = 1; 

            /* Check if the current number i is prime or not */
            for(int j=2; j<=i/2; j++)
            {
                /*
                 * If i is divisible by any number other than 1 and self
                 * then it is not prime number
                 */
                if(i%j==0)
                {
                    isPrime = 0;
                    break;
                }
            }

            /* If the number is prime then print */
            if(isPrime==1 )
                count++;
        }
        
        return count;
    }
     
    // Driver Program to test above function
    public static void main(String args[])
    {
        int n = 3;
        SieveOfEratosthenes g = new SieveOfEratosthenes();

        System.out.print("Following are the prime numbers ");
        System.out.println("smaller than or equal to " + n);
        
        g.sieveOfEratosthenes(n);

        // System.out.println(g.countPrimes(n));
    }
}