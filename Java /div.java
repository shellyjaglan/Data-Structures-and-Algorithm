import java.util.Scanner;

class div{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int result = divide(a,b,c);
		System.out.println(result);
	}
	public static int divide(int q,int w, int e){
		int count = 0;
		for(int i = q;i <= w;i++){
			if((i % e) == 0){
				count ++;
			}
		}
		return count;
	}

}