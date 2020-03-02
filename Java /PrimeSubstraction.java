import java.util.*;

public class PrimeSubstraction{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		for(int i=0 ; i<t ; i++){
			long a = in.nextLong();
			long b = in.nextLong();
			if(canEqual(a, b) == true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
		}
	}
	
    public static boolean canEqual(long x, long y){
        long diff  = x-y;
        //find factors of dif..
        boolean prime_exists = false;

        if(diff <= 1){
            return false;
        }
        return true;
        // for (int i=1 ; i<=diff ; i++){ 
        //     if (diff%i==0){
        //         if(isPrime(i)){
        //             prime_exists = true;
        //         }
        //     }
        // }

        // if(prime_exists == false)
        //     return false;
        // return true;
    }

    static boolean isPrime(int n){
        // Corner case 
        if (n <= 1) return false; 
      
        // Check from 2 to n-1 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
      
        return true; 
    }
}
	
