import java.util.*;

class StackBrackets2{
	public static void main(String[] args) {
		StackBrackets2 obj = new StackBrackets2();
		//Stack stack = new Stack();
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();

		System.out.println(obj.checkBrackets(s));
		//System.out.println(obj.checkBrackets2(s));
	}
		//System.out.println(stack);
		//System.out.println(stack.peek());
		//System.out.println(stack.size());
		
	boolean checkBrackets(String s) {
		Stack stack = new Stack();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == '[' || c == '{' || c == '(') {
				stack.push(c);
			} else if (stack.size() > 0 &&
				((c == ']' && stack.peek() == '[') ||
				(c == '}' && stack.peek() == '{') ||
				(c == ')' && stack.peek() == '('))) {
				stack.pop();
			} else {
				return false;
			}
		}
		return (stack.size() == 0);
	}

	public static boolean checkBrackets2(String s){
		int l = s.length();
		if((l % 2) != 0)
            return false;
        int i,j;
        for(i = 0,j =l-1;i < j;i++,j--){
            char c = s.charAt(i);
            char d = s.charAt(j);
            // System.out.println("c is: "+c);
            // System.out.println("d is: "+d);
            if(c == '[' && d == ']')
                continue;
            else if(c =='{' && d=='}')
            	continue;
            else if(c =='(' && d==')')
            	continue;
            else{
                return false;
            }   
        }
        return true;
	}
}