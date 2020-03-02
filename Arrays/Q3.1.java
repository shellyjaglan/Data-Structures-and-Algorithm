import java.util.Arrays;

public class Q3scnd{
	
	static String sortStr(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		str = new String(arr);
		return str;
	}

	static boolean checkStrs(String str1 , String str2) {
		str1 = sortStr(str1);
		str2 = sortStr(str2);
		return str1.equals(str2);
	}
	
	public static void main(String[] args) {
		System.out.println(checkStrs("shelly","llyshe" ));
	}

}