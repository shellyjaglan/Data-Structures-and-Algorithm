import java.util.Scanner;
class input{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		String s,d ;
		int a ;
		float f ;

		System.out.println("enter  the string:");
		s = in.nextLine();
		int len1 = s.length();
		System.out.println("stringyou enteres is :"+ s);


		System.out.println("enter  the second string:");
		d = in.nextLine();
		int len2 = d.length();
		System.out.println("stringyou enteres is :"+ s); 
		int maxLen = Math.max(len1,len2);
		System.out.println("max length is "+ maxLen); 

		System.out.println("enter  the int:");
		a = in.nextInt();
		System.out.println("int you enteres is :"+ a);


		System.out.println("enter  the float value:");
		f = in.nextFloat();
		System.out.println("float you enteres is :"+ f);

	}
}