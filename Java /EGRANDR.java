import java.util.Scanner ;

class EGRANDR{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		EGRANDR obj = new EGRANDR();
	//	System.out.println("enter the test cases:");
		int t = in.nextInt();
		for(int i= 0;i <t;i++){
	//		System.out.println("enter the no of exams:");
			int e = in.nextInt();
			int arr[] = new int[e];
			for(int j = 0;j<e;j++){
				arr[j]=in.nextInt();
			}
			obj.avg(arr,e);
		}

	}
	public void avg(int a[],int size){
		int average = 0,count = 0;
		float res;
		for(int i=0;i < size;i++){
			if(a[i] == 5){
				count++;
			}
			if(a[i] == 2 ){
				System.out.println("No");
				return;
			}
			average = average + a[i];
		}
		res = average/size;
		if(res >= 4 && count > 0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}

	}
}