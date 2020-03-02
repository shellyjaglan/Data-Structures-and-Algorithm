import java.util.*;
class Node{
	char top;
	Node next;
	int size;
	Node(char key){
		top = key;
		next = null;
		//size = 0;
	}
}
class StackBrackets{
	Node top;Node size;
	public static void main(String[] args) {
		StackBrackets obj = new StackBrackets();
		Scanner in = new Scanner(System.in);
		// obj.push('a');
		// obj.push('b');
		// obj.print();
		// char y = obj.pop();
		// System.out.print("poped: "+y);
		String s = in.nextLine();
		for(int i = 0; i<s.length();i++){
			obj.push(s.charAt(i));
		}
		obj.print();
		System.out.print("size is: "+obj.size.size);

	}
	void push(char c){
		if(top == null){
			Node temp = new Node(c);
			top = temp;
		}
		else
		{
			Node temp = new Node(c);
			temp.next = top;
			top = temp;
		}
		size++;
	}

	char pop(){
		char x = top.top;
		if(top == null){
			//return null;
		}
		else{
			//Node x = top;
			top = top.next;
			//return x;
			size--;
		}
		//size --;
		return x;
	}
	void print(){
		Node t = top;
		if(t == null){
			return;
		}
		else{
			while(t != null){
				System.out.print(t.top);
				t = t.next;
			}
		}
	}
	int getSize(){
		return size.size;
	}
}