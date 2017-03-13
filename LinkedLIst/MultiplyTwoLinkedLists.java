import java.util.*;
import java.util.LinkedList;

class MultiplyTwoLinkedLists{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0 ; i<t ; i++){
			int n = in.nextInt();
			LinkedList l1 = new LinkedList();
			for(int next=0 ; next<n ; next++){
				int element = in.nextInt();
				l1.add(element);
			}
			System.out.println("l1 is: "+ l1);
			int m = in.nextInt();
			LinkedList l2 = new LinkedList();
			for(int next2 =0 ; next2<m ; next2++){
				int element2 = in.nextInt();
				l2.add(element2);
			}
			System.out.println("l2is: "+ l2);
			//pass to func
			long product = multipleLL(l1,l2);
			System.out.println("result is: "+product);
		}
	}
	static long multipleLL(LinkedList l1,LinkedList l2){
		int size1 = l1.size();
		int size2 = l2.size();
		long num1 = 0,num2 = 0;

		for(int i=0 ; i<size1; i++){
			num1 += (long)l1.get(i)* (long)(Math.pow(10,size1-i-1));
		}
		for(int i=0 ; i<size2; i++){
			num2 += (long)l2.get(i)* (long)(Math.pow(10,size2-i-1));
		}
		long result;
		result = (long)(num1 % (long)(Math.pow(10,9)+7)) * (long)(num2%((long)Math.pow(10,9)+7));
		return result;
	}
}