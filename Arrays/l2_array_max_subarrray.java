import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;


public class l2_array_max_subarrray {
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
		int size = a.size();
		long currentsum = 0;
		int start = 0;
		int max_start = 0;
		int max_end = 0;
		long maxsum = 0;
		int len_curr = 0;
		int len_max =0;
		int end =0;
		int count = 0;

		for(int i = start;i < size;i++){
			if(a.get(i) >= 0){
				currentsum += a.get(i);
				len_curr ++;
				if(currentsum >= maxsum){
					maxsum = currentsum;
					if(len_curr >= len_max){
						len_max = len_curr;
						max_start = start;
						max_end = i;
					}
				}
			}
			else{
				currentsum = 0;
				len_curr = 0;
				start = i +1;
				end = i+ 1;
				count ++;
				continue;
			}
		}
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(count == size){
			return res;
		}
		
			for(int i = max_start;i <= max_end;i++){
				int x = a.get(i);
				res.add(x);
			}
		
		return res;
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

		l2_array_max_subarrray obj = new l2_array_max_subarrray();

		b = obj.maxset(c);
		System.out.println("b:"+b);	

	}
}

/*
25150 1412  82797 48381 7065 -47699 -25129 -65483 -64607 -45322 -55176 27224
 80366 60444 70285 -93898 -41133 96576 -58266 21711 -20614 -95737 20591 -48762
  -76197 -38588 -54873 37304 61200 -68960
 93947*/