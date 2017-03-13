import java.util.ArrayList;

class Stack{
	private ArrayList<Integer> elements;
	public Stack(){
		 elements = new ArrayList<Integer>();
	}
	public void push(int a){
		elements.add(a);
	}
	public void pop(){
		if(!elements.isEmpty()){
			elements.remove(elements.size()-1);
		}
		else{
			System.out.println("underflow");
		}
	}
	public int size(){
		return elements.size();
	}
}
public class MainClass{
	public static void main(String[]args){
		Stack myStack = new Stack() ;
		myStack.push(3);
		myStack.push(10);
		myStack.push(7);
		myStack.push(12);
		myStack.pop();
		System.out.println("Stack size = " + myStack.size());
	}
}