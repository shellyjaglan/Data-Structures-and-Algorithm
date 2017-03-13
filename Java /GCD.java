import java.util.Scanner;

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
		long powr = Math.pow(10,count);
		long div = findgcd(a,b);
		if(div > 1){
			for(long i = 0;i < div-1;i++){
				newno  = ((newno * powr) + num);
			}
			System.out.println(newno);
		}
		else
			System.out.println(newno);
	}

	public static int findgcd(long num1,long num2){
			long divident , divisor, rem ;
			if(num1 >= num2){
				divident = num1;
				divisor = num2;
			}
			else(num2 > num1){
				divident = num2;
				divisor = num1;
			}

			while(rem != 0){
				rem = divident % divisor;
				if(rem != 0){
					divident = divisor;
					divisor = rem;
				}
				else
					continue;
			}
			return divisor;
	}
}