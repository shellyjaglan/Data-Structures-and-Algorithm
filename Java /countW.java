import java.util.Scanner;

class countW{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter the string");
		String s = in.nextLine();
		int len= s.length();
		int count=0 ,i;
		for(i=0;i<len;i++){
			if(s.charAt(i) != ' ')
				continue ;

			count ++ ;
		}
		count = count + 1 ;

		System.out.println("words :"+count);
	}
}