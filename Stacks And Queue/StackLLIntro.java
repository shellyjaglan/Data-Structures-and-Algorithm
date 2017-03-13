class Node{
	int top;
	Node next;
	Node(int key){
		top =key;
		next = null;
	}
}

class StackLLIntro{
	Node top = null;
	public static void main(String[] args) {
		StackLLIntro obj = new StackLLIntro();
		obj.pop();
		obj.push(3);
		obj.push(2);
		obj.peek();
		obj.push(1);
		obj.print();
		obj.pop();
		obj.peek();
		System.out.println("thank you so much");
	}
	void push(int element){
		if(top == null){
			Node temp = new Node(element);
			top = temp;
		}
		else{
			Node temp = new Node(element);
			temp.next = top;
			top = temp;
		}
		System.out.println("element added is: "+top.top);
		return;
	}
	void pop(){
		if(top == null){
			System.out.println("stack underflow");
		}
		else{
			System.out.println("node poped is:"+top.top);
			top = top.next;
		}
	}

	void peek(){
		if(top == null){
			System.out.println("no elemtn in the stack");
		}
		else{
			System.out.println("top is:"+top.top);
		}
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
} 