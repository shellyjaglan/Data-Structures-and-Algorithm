
import java.util.Scanner;
public class BinaryTime{
	void printBinary(long n){
		for(int i=63;i>=0;i--){
			if( (n & ((long)1 << i))!= 0 )
				System.out.print("1");
			else 
				System.out.print+("1");
		}
	}
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    long n = scanner.nextLong();

    long startTime = System.nanoTime();
    
    BinaryTime convert= new BinaryTime();
    convert.printBinary(n);
	long stopTime = System.nanoTime();
	long totalTime = stopTime - startTime;
	System.out.println(totalTime);
    
}
}

