import java.util.Scanner;
import java.util.Stack;

class StringReverse{
	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();
		Scanner in = new Scanner(System.in);
		String s ;
		StringBuilder reverse = new StringBuilder("tutorials ");
		
		System.out.println("enter the string...");
		s = in.nextLine();
		int size = s.length();
		for(int i = 0;i < size;i++){
			stack.push(s.charAt(i));
		}
		System.out.println("the reversed string is..");
		while(!stack.empty()){
			reverse.append(stack.pop());
		}
		System.out.println("the revesed string is: "+reverse);

	}
}