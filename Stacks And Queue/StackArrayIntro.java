class StackArrayIntro{
	int capacity = 4;
	int arr[] = new int[capacity];
	int top = -1;
	public static void main(String[] args) {
		StackArrayIntro obj = new StackArrayIntro();
		obj.pop1();
		obj.push1(1);
		obj.printElements();
		obj.pop();
		obj.push1(1);
		obj.push(2);
		obj.push(3);
		int i = obj.peek();
		System.out.println("peek Element is: "+i);
		obj.printElements();
		obj.pop();
		obj.printElements();
	}
	public void push(int pushedElement){
		if(top < capacity-1){
			top++;
			arr[top] = pushedElement;
			System.out.println("Element " + pushedElement
           + " is pushed to Stack !");
		}
		else{
			System.out.println("Stack Overflow !");
		}
	}
	public void pop(){
		if(top >= 0){
			top--;
			System.out.println("Pop operation done !");
		}
		else{
			System.out.println("Stack Underflow !");
		}
	}

//another method to write push...using full()
	public void push1(int pushedElement){
		if(isFull()){
			System.out.println("Stack Overflow !");
		}
		else{
			arr[++top] = pushedElement;
			System.out.println("Element " + pushedElement
           + " is pushed to Stack !");
		}
		
	}
//another method to write pop
	public void pop1(){
		if(isEmpty()){
			System.out.println("Stack Underflow !");
		}
		else{
			top--;
			System.out.println("Pop operation done !");
			//return (top--);
		}
		
	}
	public boolean isFull(){
		return (top == capacity-1);
	}
	public boolean isEmpty(){
        return (top == -1);
    }
	public void printElements() {
      if (top >= 0) {
         System.out.println("Elements in stack :");
         for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
         }
      }
   }

   public int peek(){
   		if(top < 0){
   			System.out.println("stack is empty");
   		}
   		return arr[top];	
   }
}