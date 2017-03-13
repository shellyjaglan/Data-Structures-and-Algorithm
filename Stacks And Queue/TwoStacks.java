class TwoStacks{
	int arr[];
	int top1,top2;
	int size;

	TwoStacks(int n){
		arr = new int[n];
		size = n;
		top1 = -1;
		top2 = size;
	}
	public static void main(String[] args) {
		TwoStacks obj = new TwoStacks(6);
		int res  =  obj.pop1();
		System.out.println("elemet poped is: "+res);
		obj.push1(1);
		obj.push1(2);
		
		obj.push2(3);
		obj.push2(4);
		
		int res2  = obj.pop2();
		System.out.println("elemet poped is: "+res2);
	}
	void push1(int element){
		if(top1 < top2 -1){
			//top1++;
			arr[++top1] = element;
		}
		else{
			System.out.println("stack overflow");
		}
	}
	void push2(int element){
		if(top1 < top2-1){
			//top1++;
			arr[--top2] = element;
		}
		else{
			System.out.println("stack overflow");
		}
	}
	int pop1(){
		if(top1 >= 0 && top1 < size){
			int x = arr[top1];
			//arr[top1] = null;
			top1--;
			return x;
		}
		else{
			System.out.println("stack underflow");
			return 0;
		}
		
	}
	int pop2(){
		if(top2 < size && top2 >=0){
			int x = arr[top2];
			//arr[top2] = null;
			top2--;
			return x;
		}
		else{
			System.out.println("stack underflow");
			return 0;
		}
		
	}
}