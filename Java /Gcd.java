import java.util.Scanner;
import java.math.*;

class Gcd{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long a = in.nextLong();
		long b = in.nextLong();
		long newno = n;
		long count = 0;
		while(n != 0){
			n = n/10;
			count++;
		}
		double p = Math.pow(10,count);
		long powr = (long) p;
		long div = findgcd(a,b);
		if(div > 1){
			for(long i = 0;i < div-1;i++){
				newno  = ((newno * powr) + n);
			}
			System.out.println(newno);
		}
		else
			System.out.println(newno);
	}

	public static long findgcd(long num1,long num2){
			long divident = num1;
			long divisor = num2;
			if(num1 <= num2){
				long temp = divident ;
				divident = divisor;
				divisor = temp;
			}
			long rem = divident % divisor;
			while(rem != 0){
				divident = divisor;
				divisor = rem;					
				rem = divident % divisor;																					
			}
			return divisor;
	}
}