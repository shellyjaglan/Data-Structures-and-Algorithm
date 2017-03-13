import java.util.*;

class LexicographicalPermutationsAll{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LexicographicalPermutationsAll obj = new LexicographicalPermutationsAll();
		String s = in.nextLine();
		//String res = obj.lexo_string(s);
		obj.lexo_string(s);
		//System.out.println("res is: "+res);
	}
	void lexo_string(String s){
		String res;
		int l = s.length();
		char arr[] = new char[l];
		for(int j = 0;j < l;j++){
			arr[j] = s.charAt(j);
		}
		int x_index = -1;
		int y_index = -1;
		int y = Integer.MAX_VALUE;
		boolean finished = false;
		for(int i = 0;i < l;i++){
			if(i != l-1 && arr[i] < arr[i+1]){
				x_index = i;
				y_index = i+1;
				y = arr[i+1];
			}
			else if(x_index != -1 && arr[i] > arr[x_index] && arr[i] <= y){
				y_index = i;
				y = arr[i];
			}
		}
		//this will print all permutations...as we are calling all permutation func...
		if(x_index == -1)
			return;
		if(y_index == -1){
			String str= new String(arr);
			System.out.println(str);
			lexo_string(str);
			//return new String(arr);
		}else{
			swap(arr,x_index,y_index);
			reverse(arr,x_index+1,l-1);
			String str= new String(arr);
			System.out.println(str);
			lexo_string(str);
			//return new String(arr);
		}
	}
	void swap(char[] arr,int a,int b){
		char temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;	
	}
	void reverse(char[] arr,int start,int end){
		int i ,j;
		for (i = start,j = end;i < j;i++,j--) {
			swap(arr,i,j);
		}
	}
}