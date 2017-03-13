import java.util.Scanner ;
class sum{
	public static void main(String[] args){

		Scanner in =new Scanner(System.in);
		int a,i,sum =0;
		System.out.println("enter the integer");
		a =in.nextInt();
		
		if(a<= 0){
			System.out.println("the int u typed is negative");
		}
		else{
			while( a !=0 ){
				sum= sum + a % 10 ;
				a = a/10 ;
			}
		}
		System.out.println("sum is:"+ sum);
		
	}
}