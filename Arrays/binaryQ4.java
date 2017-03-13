import java.util.Scanner ;
class binaryQ4{
	public static void main(String[] args){
		Scanner in = new Scanner ;
		System.out.println("enter the decimal number");
		int a = in.nextInt();
		int [] array = new int[50];
		
		while(n != 1){
			array[i] = a % 2;
			a = a / 2;
		}
	}


}
import java.util.Scanner;

public class DecimalToBinary {

   public String toBinary(int n) {
       if (n == 0) {
           return "0";
       }
       String binary = "";
       while (n > 0) {
           int rem = n % 2;
           binary = rem + binary;
           n = n / 2;
       }
       return binary;
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int decimal = scanner.nextInt();
       DecimalToBinary decimalToBinary = new DecimalToBinary();
       String binary = decimalToBinary.toBinary(decimal);
       System.out.println("The binary representation is " + binary);

   }
}