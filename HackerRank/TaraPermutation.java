import java.util.*;

class TaraPermutation{
	static int count = 0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		TaraPermutation obj = new TaraPermutation();
        int t = in.nextInt();
        for(int i=0 ; i<t ; i++){
            int size = in.nextInt();
            int arr[] = new int[size];
          //  StringBuffer sb = new StringBuffer();
            for(int j=0 ; j<size ; j++){
                arr[j] = in.nextInt();
                //char c = in.next().charAt(0);
               // sb.append(c);
            }
            Arrays.sort(arr);
            StringBuffer sb = new StringBuffer();
         	for(int k=0 ; k<arr.length ; k++){
         		sb.append(arr[k]);
         	}
        //    System.out.println("str is: "+sb);
         	obj.countBeautifulPermtaions2(arr);
            obj.lexo_string(sb.toString());
            System.out.println(obj.count);
            count = 0;
        }
		//String s = in.nextLine();
		//String res = obj.lexo_string(s);
		
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
			countBeautifulPermtaions(arr);
			String str= new String(arr);
			System.out.println(str);
			lexo_string(str);
			//return new String(arr);
		}else{

			swap(arr,x_index,y_index);
			reverse(arr,x_index+1,l-1);
			countBeautifulPermtaions(arr);
			String str= new String(arr);
		//	System.out.println(str);
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
    
    void countBeautifulPermtaions(char arr[]){
    	int len = arr.length ;
    	int i,j,escape = -1;
    	for(i=0,j=1 ; i<j && j<len ; i++,j++){
    		if((arr[j] - '0') - (arr[i] - '0') == 0){
    			escape = 0;
    			break;
    		}
    	}
    	if(escape == -1){
    		count++;
    	}
    }

    void countBeautifulPermtaions2(int arr[]){
    	int len = arr.length ;
    	int i,j,escape = -1;
    	for(i=0,j=1 ; i<j && j<len ; i++,j++){
    		if(arr[j] - arr[i] == 0){
    			escape = 0;
    			break;
    		}
    	}
    	if(escape == -1){
    		count++;
    	}
    }
}