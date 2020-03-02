import java.util.*;

class RemoveDuplicateString{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0 ; i<t ; i++){
        	String s = in.next();
        	System.out.println(removeDuplicate(s));
        }
	}
	static String removeDuplicate(String s){
		Stack stack = new Stack();
		char poped = '\0';
		String snew = "";
		for(int i=0 ; i<s.length() ; i++){
			char ch = s.charAt(i);
			if(stack.size() == 0){
				if(ch != poped){
					stack.push(ch);
					poped = '\0';
				}
					
			}
			else if((char)stack.peek() == ch){
				poped = (char)stack.pop();
			}
			else if(poped != '\0' && ch == poped){
				continue;
			}
			else{
				stack.push(ch);
				poped = '\0';
			}
		}
		while(stack.size() > 0){
			snew = (char)stack.pop() + snew;
		}
		return snew;
	}
}