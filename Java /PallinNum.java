import java.util.Scanner;
class PallinNum{
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt(); 
		int temp = 0;
		int rem ;
		for(int i = n; i != 0;i = i/10){
			rem = i % 10;
			temp = temp*10 + rem;
		}
		if(temp == n){
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
}