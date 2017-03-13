import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution{
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		int a_size = a.size();
		int count = 0 ;
		if(a.get(a_size - 1) == 9){

		 	a.set((a_size -1),0);

		 //	System.out.println("a"+ a);
		 	int t = a_size -2;
		 	for(int i = t;i >= 0;i--){
		 		if(a.get(i) == 9){
		 			a.set(i,0);
		 			
		 			count ++;
		 //			System.out.println("count:"+count);
		 		}
		 		else{
		 			a.set(i,(a.get(i) + 1));
		 			break;
		 		}
		 	}
		 	if(count == a_size-1){
		// 		System.out.println("count:"+count);
		 		a.add(0,1);
		// 		System.out.println(a);
		 	}
		 }
		 else{
		 	int last_inc_element = a.get(a_size - 1) + 1;
		 	a.set((a_size - 1),last_inc_element);

		 }
		 int place = 0;
		a_size = a.size();
		for(int i = 0;i < a_size;i ++){
			if(a.get(i) == 0){
				continue;
			}
			else{
				place = i;
				break;
			}
		}
		int b = a_size - place;
		for(int i = 0, j = place;i < a_size && j < a_size;i++,j++){
		
			a.set(i,a.get(j));
		}
		for(int i = (a.size() -1);i >= b ;i--){
		//	System.out.println("i is:" + i);
			a.remove(i);
	
		}
		return a;
	}

	public static void main(String[] args) {

		ArrayList<Integer> b = new ArrayList<Integer>();

		ArrayList<Integer> c = new ArrayList<Integer>();
		Scanner in  = new Scanner(System.in);
		System.out.println("enter thr size of the arraylist:");
		int size = in.nextInt();
	//	int a_size = a.size();
		 for(int i = 0;i < size;i++){
		 	int num = in.nextInt();
		 	if(num != '!')
		 		c.add(num);
		 	else
		 		break;
		 }
		Solution obj = new Solution();
		b = obj.plusOne(c);
		System.out.println("b:"+b);	
	}
}