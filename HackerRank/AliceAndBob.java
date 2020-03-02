import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AliceAndBob {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int k=0 ; k<t ; k++){
            int size = in.nextInt();
            howWins(size);
        }    
    }
   static void howWins(int n){
        boolean prime[] = new boolean[n + 1];
        for(int j=0 ; j<=n ; j++){
            prime[j] = true;
        }
        
        for(int factor=2 ; factor*factor<=n ; factor++){
            if(prime[factor] == true){
                for(int k=factor ; factor*k <= n ;k++){
                    prime[factor*k] = false;
                }
            }
        }
        int count=0;
        for(int i=2 ; i<=n ; i++){
            if(prime[i] == true){
            	//System.out.println("primes are: ");
            	System.out.print(i+" ");
                count++;
            }
        }
        if(count%2 == 0)
            System.out.println("Bob");
        else
            System.out.println("Alice");
    }

}
