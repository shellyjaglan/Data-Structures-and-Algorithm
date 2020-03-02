import java.util.Scanner;

class Time{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int n = str.length();
		int h ,m ,s ;
		h = (str.charAt(0) - '0')* 10 + (str.charAt(1) - '0');
		if( h < 1 && h > 12)
			return;
		m = (str.charAt(3) - '0')* 10 + (str.charAt(4) - '0');
		s = (str.charAt(6) - '0')* 10 + (str.charAt(7) - '0');
		if(h < 12 && str.charAt(8) == 'P')
			h = h + 12;
		else if(h == 12 && str.charAt(8) == 'A')
			h = 0;
//		System.out.println("%02d", h + ":" + "%02d",m + ":" + "%02d",s);
		System.out.printf("%02d", h);
		System.out.print(":");
		System.out.printf("%02d", m);
		System.out.print(":");
		System.out.printf("%02d", s);
	}
}