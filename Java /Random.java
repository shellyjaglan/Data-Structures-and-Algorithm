import java.util.*;

class Random{
	public static void main(String[] args){
	//	char[] array={'a', 'd', 's'};
		// array = new char[5];
		// or we can combine these 
		// char[] array =new char[5];

		// System.out.println(array[2]);
		// String typeThis = new String(array);
		// System.out.println(typeThis);
		// System.out.println("yoooo sussesful submition yooo");

		// String football = "i dont play football";
		// int len = football.length();
		// System.out.println("length is"+len);
		// System.out.println(football.charAt(0));

		ArrayList list = new ArrayList();
		list.add(-1);
		list.add(-2);
		list.add(4);
		int i = (int) list.get(2);
		System.out.println(i);

		Iterator itr = list.iterator();
	   while(itr.hasNext()){
		   	int h = (int) itr.next();
		   	System.out.println("h is: "+h);
		  // 	currsum = max(h , currsum + h);
			//System.out.println("currsum: "+currsum);
			//maxSum = max(currsum , maxSum);
	   }
	}
}