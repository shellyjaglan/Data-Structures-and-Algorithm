
//Sort an array according to absolute difference with given value
//Given an array of n distinct elements and a number x, arrange array elements according to the absolute difference with x, 
//i. e., element having minimum difference comes first and so on.
//Note : If two or more elements are at equal distance arrange them in same sequence as in the given array.

class SortInWaveForm{
	public static void main(String[] args) {
        // int[] arr = {10, 5, 3, 9, 2};

        //int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
        //  int[] arr = {20, 10, 8, 6, 4, 2};
        // int[] arr = {10, 5, 3, 9, 2};
        // int[] arr = {10, 5, 3, 9, 2};
        int[] arr = {0,0,1,0,1,0,1,0,0,1,1,1};
        sort(arr);
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] arr){
        int i,j;
        i=0;
        j=arr.length -1;

        while(i < j){
            if(arr[i] == 0){
                i++;
            }
            if(arr[j] == 1){
                j--;
            }
            if( i<j && arr[i] == 1 && arr[j] == 0){
                System.out.println("i and j index swap: "+ i + " " +  j);
                //swap..
                arr[i] = 0;
                arr[j] = 1;
                System.out.println("i and j value swap: "+ arr[i] + " " + arr[j]);
                // i++;
                // j--;
            }
        }
        // for(int i=0 ; i<arr.length ; i+=2){
        //     if(i>0 && arr[i-1] > arr[i]){
        //         //swap arr[i-1] ,arr[i];
        //         int temp = arr[i-1];
        //         arr[i-1] = arr[i];
        //         arr[i] = temp;
        //     }

        //     if(i<arr.length-1 && arr[i+1] > arr[i]){
        //         int temp = arr[i+1];
        //         arr[i+1] = arr[i];
        //         arr[i] = temp;
        //     }
        // }
        // return;
    }
}