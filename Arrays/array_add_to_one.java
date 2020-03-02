import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

class array_add_to_one{
	public static void main(String[] args) {


		ArrayList<Integer> a = new ArrayList<Integer>();
		Scanner in  = new Scanner(System.in);
		System.out.println("enter thr size of the arraylist:");
		int size = in.nextInt();
	//	int a_size = a.size();
		 for(int i = 0;i < size;i++){
		 	int num = in.nextInt();
		 	if(num != '!')
		 		a.add(num);
		 	else
		 		break;
		 }

		 int a_size = a.size();
		 System.out.println("size of the made array :" + a_size);
		 int count = 0 ;
		 if(a.get(a_size - 1) == 9){

		 	a.set((a_size -1),0);

		 	System.out.println("a"+ a);
		 	int t = a_size -2;
		 	for(int i = t;i >= 0;i--){
		 		if(a.get(i) == 9){
		 			a.set(i,0);
		 			//st =  i-1;
		 			count ++;
		 			System.out.println("count:"+count);
		 		}
		 		else{
		 			a.set(i,(a.get(i) + 1));
		 			break;
		 		}
		 	}
		 	if(count == a_size-1){

		 		System.out.println("count:"+count);
		 		a.add(0,1);
		 		System.out.println(a);
		 	}
		 }
		 else{
		 	int last_inc_element = a.get(a_size - 1) + 1;
		 	a.set((a_size - 1),last_inc_element);

		 }
		
		//int adsd = a.get(size -1)
		

		System.out.println(a);

		// Iterator<Integer> itr = a.iterator();
		// //do this itr or below 
		// while(itr.hasNext()){	
		// 	int f = itr.next();
		// //	System.out.println("da");
		// 	if(f == 0){
		// 		break;
		// 	}
		// 	else{
		// 		a.set(,f)
		// 	}
		// 	System.out.println(f);
		// }
		//below using for loop
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
		System.out.println("place: " + place);
		int b = a_size - place;

		System.out.println("value of b is:"+b);
		for(int i = 0, j = place;i < a_size && j < a_size;i++,j++){
		//	a.set(index,value);
			a.set(i,a.get(j));
		}
		System.out.println("new array +1 is:"+a);
		System.out.println("aray size:" + a_size);
		for(int i = (a.size() -1);i >= b ;i--){
			System.out.println("i is:" + i);
			a.remove(i);
			//a.set(i,0);
	//		System.out.println()
		}
		System.out.println(a);
	}
}