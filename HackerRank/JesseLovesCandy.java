import java.util.*;

class JesseLovesCandy{
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int arr[] = new int[n];
		for(int i=0 ; i<n ; i++){
			arr[i] = in.nextInt();
		}
		//findMiniTime(n,k,arr);
		int time = findMiniTime(n,k,arr);
		System.out.println(time);
	}
	

	// static int findMiniTime(int n,int k,int[] arr){
	// 	int count1= 0;
	// 	int start1 = -1;
	// 	int end1 = -1;
	// 	int mini= Integer.MAX_VALUE;
	// 	int tempmini = Integer.MAX_VALUE;
	// 	int startfix = -1;

	// 	for(int i=0 ; i<n ; i++){
	// 		if(arr[i] == 1){
	// 			if(start1 == -1 && end1 == -1){
	// 				start1 = i;
	// 				end1 = i;
	// 			}
	// 			else if(start1 != -1){
	// 				end1 = i;
	// 			}
	// 			if(start1 != -1 && end1 != -1 && (end1 - start1 != 0)){
	// 				tempmini = Math.abs(end1 - start1);
	// 				if(tempmini < mini){
	// 					mini = tempmini;
	// 					startfix = start1;
	// 				}	
	// 				start1 = i;
	// 			}
					
	// 		}
	// 	}
	// 	// System.out.println("tempmini: "+tempmini);
	// 	// System.out.println("startfix: "+startfix);
	// 	return startfix + (tempmini*k);
	// }


	static int findMiniTime(int n,int k,int[] arr){
		int count1= 0;
		int start1 = -1;
		int end1 = -1;
		int mini= Integer.MAX_VALUE;
		int tempmini = Integer.MAX_VALUE;
		int startfix = -1;
		int ans = Integer.MAX_VALUE;
		for(int i=0 ; i<n ; i++){
			if(arr[i] == 1){
				if(start1 == -1 && end1 == -1){
					start1 = i;
					end1 = i;
				}
				else if(start1 != -1){
					end1 = i;
				}
				if(start1 != -1 && end1 != -1 && (end1 - start1 != 0)){
					tempmini = Math.abs(end1 - start1);
					// if(tempmini < mini){
					// 	mini = tempmini;
					// 	startfix = start1;
					// }	
					ans = start1 + (tempmini*k);
					if(ans < mini){
						mini = ans;
					}
					start1 = i;
				}
					
			}
		}
		// System.out.println("tempmini: "+tempmini);
		// System.out.println("startfix: "+startfix);
		//return startfix + (tempmini*k);
		return mini;
	}
}