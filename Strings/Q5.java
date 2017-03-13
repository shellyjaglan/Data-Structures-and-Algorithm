
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

class Q5{
	public static void main(String[] args) {
		ArrayList<Character> list1 = new ArrayList<Character>();	
		ArrayList<Character> list2 = new ArrayList<Character>();
		Scanner in = new Scanner(System.in);
		System.out.println("enter the elements:");
		while(true){
			char c = in.next().charAt(0);
			if(c == '~')
			break;
			list1.add(c);
		}
		in.close();
		Iterator<Character> itr1 = list1.iterator();
		Iterator<Character> itr2 = list2.iterator();

		while(itr1.hasNext()){
     		System.out.print((char)itr1.next());
      	}

      	for(int i = 0;i < list1.size();i++){
      		list2.add(list1.get(i));
      	}

      	while(itr2.hasNext()){
     		System.out.print((char)itr2.next());
      	}
	}
}

/*
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

class Q5{
	public static void main(String[] args) {
		ArrayList<Character> list1 = new ArrayList<Character>();
		ArrayList<Character> list2 = new ArrayList<Character>();

		Iterator itr1 = new list1.Iterator();
		Iterator itr2 = new list2.Iterator();
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the elements:");
		while(in.hasNextChar()){
			char c = in.nextChar();
			list1.add(c);
		}
		while(itr1.hasNext()){
      		System.out.println(itr1.next());
      	}
	}
} */