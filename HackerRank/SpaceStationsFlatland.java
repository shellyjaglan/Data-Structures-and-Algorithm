//correct code of the hacker rank question flatland space station

import java.util.*;

class SpaceStationsFlatland2{
	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		int m = in.nextInt();
		for(int i=0 ; i<m ; i++){
			int sta = in.nextInt();
			arr[sta] = -1;	
		}
		for(int j=0 ; j<n ;j++){
			if(arr[j] != -1){
				arr[j] = 0;
			}
			System.out.println(arr[j]);
		}
		int res = func(arr);
		System.out.println(res);
	}
	static int func(int[] arr){
		int ans = 0;
		int count=0;
		int max =0;
		int start = -1,temp_start = -1;
		int end = -1,temp_end =-1;
		for(int i=0 ; i<arr.length ; i++){
			if(arr[i] != -1){
				count++;
				temp_end = i;
				if(temp_start == -1){
					temp_start = i;
				}
				if(count > max)
					max = count;
			}
			else{
				count = 0;
				if(i != arr.length)
					temp_start = i+1;
			}

			//////////////
			int case1;

			if((temp_end == arr.length-1) || (temp_start == 0)){
				case1 = temp_end - temp_start +1;
			}
			else if(temp_start == -1 && temp_end ==-1 && max == 0){
				case1 = 0;
			}
			else{
				case1 = (int) Math.ceil((double)(temp_end - temp_start+1)/2);
			}
			if(case1 > ans)
				ans = case1;
		}		
		return ans;
	}
}