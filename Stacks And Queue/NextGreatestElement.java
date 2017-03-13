//import java.util.*;
import java.util.Stack;


class NextGreatestElement{
	public static void main(String[] args) {
		int arr[] ={4,15,2,9,20,11,13};
		NextGreatestElement obj = new NextGreatestElement();
		obj.printNextGreater(arr,arr.length);
	}
	void printNextGreater(int arr[],int n){
		Stack<Integer> s = new Stack<Integer>();
		//s.top = -1;
		int element,next;
		for(int i = 0;i < n;i++){
			if(i == 0){
				s.push(arr[0]);
				continue;
			}
			next = arr[i];
			if(!s.empty()){
				element = s.pop();
				while(element < next){
					System.out.println("next gretest of "+element+ " is: "+next);
					if(s.empty()){
						break;
					}
					element = s.pop();
				}
				if(element > next){
					s.push(element);
				}
			}
			s.push(next);
		}
		while(!s.empty()){
			element = s.pop();
			next = -1;
			System.out.println("next gretest of "+element+ " is: "+next);
		}

	}
}