
import java.util.Scanner;

class MergeAlgo{
	public static void main(String[] args) {
		int start = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = in.nextInt();
		int array[] = new int[n];
		System.out.println("enetr the elements");
		for(int i = 0;i < n;i++){
			array[i] = in.nextInt();
		}
		MergeSort(array,start,n-1,0);
		for(int i = 0;i < n;i++){
			System.out.print(array[i]);
		}	
	}
	public static void MergeSort(int A[],int s,int e, int level){
		String spaces = "";
		for(int i=0;i<level;i++)
			spaces = spaces + " ";
		System.out.println(spaces + "MergeSort("+s+","+e+")");
		int n = e-s+1;
		if(n==1)
			return;
		int mid=(e+s)/2;
		MergeSort(A,s,mid,level+2);
		MergeSort(A,mid+1,e,level+2);
		Merge(A,s,mid,mid+1,e);	
		return;
	}

	public static void Merge(int A[],int s1,int e1,int s2,int e2){
		int i = s1, j = s2, k = 0;
		int temp[] = new int[e2-s1+1];
		System.out.println("i:"+ i);
		System.out.println("j:"+ j);
		while(i<=e1 && j<=e2){
			if(A[i] < A[j]){
				temp[k++] = A[i++];
			}
			else{
				temp[k++] = A[j++];
			}
		}
		while(i<=e1){
			temp[k++] = A[i++];
		}
		while(j<=e2){
			temp[k++] = A[j++];
		}
		for(i = s1, j = 0;i <= e2;i++, j++){
			A[i] = temp[j];
		}
	}

}