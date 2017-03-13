//aim of program
//Given an array, write a program that prints 1 if given array can represent preorder traversal of a BST, else prints 0.
import java.util.*;

class PreorderBST{
	public static void main(String[] args) {
		PreorderBST obj = new PreorderBST();
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0 ; i<t ; i++){
			int n = in.nextInt();
			int arr[] = new int[n];
			for(int j=0 ; j<n ; j++){
				arr[j] = in.nextInt();
			}
			//pass to func..
			System.out.println(obj.check(arr));
		}
	}
	boolean check(int[] arr){
		if(arr.length == 0)
			return true;
		int num = arr[0];
		int flag = 0;

		for(int i=1 ; i<arr.length ; i++){
			if(arr[i] <= num){
				if(flag == 1){
					return false;
				}
				else
					continue;
			}
			else{
				flag = 1;
			}
		}
		return true;
	}
}