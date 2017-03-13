import java.util.*;

class WorkbookLisa{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int no_of_chap = in.nextInt();//n
		int max_problems = in.nextInt();//k
		int arr[] = new int[no_of_chap];//arrr of t num of problm in a chapter..
		for(int i=0 ; i<no_of_chap ; i++){
			arr[i] = in.nextInt();
		}
		int ans = find_special_problems(no_of_chap,max_problems,arr);  
	}
	static int find_special_problems(int no_of_chap,int max_problems,int[] arr){
		int page = 0;
		int count = 0;
		for(int i=0 ; i<no_of_chap; i++){
			int problems = 1;
			//System.out.println("Arr i is: "+ arr[i]);
		//	page++;
			while(arr[i] >= 1){
				page++;
				int problem_count = 1;
				while(problem_count <= max_problems && arr[i] >=1){
					if(problems == page){
						System.out.println("problems: "+problems);
						System.out.println("page is: "+page);
						count++;
					}
					problems++;
					problem_count++;
					arr[i] = arr[i] -1;
				}
				// if(problems < arr[i]){
				// 	page++;
				// }
			}
		}
		//System.out.println("count is: " +count);
		return count;
	}
}