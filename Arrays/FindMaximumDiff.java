class FindMaximumDiff 
{ 
    /* Utility Functions to get max and minimum of two integers */
    int max(int x, int y)  
    { 
        return x > y ? x : y; 
    } 
  
    int min(int x, int y)  
    { 
        return x < y ? x : y; 
    } 
  
    /* For a given array arr[], returns the maximum j-i such that 
       arr[j] > arr[i] */
    int maxIndexDiff(int arr[], int n)  
    { 
        int maxDiff; 
        int i, j; 
  
        int RMax[] = new int[n]; 
        int LMin[] = new int[n]; 
  
        /* Construct LMin[] such that LMin[i] stores the minimum value 
           from (arr[0], arr[1], ... arr[i]) */
        LMin[0] = arr[0]; 
        for (i = 1; i < n; ++i) 
            LMin[i] = Math.min(arr[i], LMin[i - 1]); 
  
        /* Construct RMax[] such that RMax[j] stores the maximum value 
           from (arr[j], arr[j+1], ..arr[n-1]) */
        RMax[n - 1] = arr[n - 1]; 
        for (j = n - 2; j >= 0; --j) 
            RMax[j] = Math.max(arr[j], RMax[j + 1]); 
  

        print(LMin,n);
        print(RMax, n);
        /* Traverse both arrays from left to right to find optimum j - i 
           This process is similar to merge() of MergeSort */
        i = 0; j = 0; maxDiff = 0; 
        while (j < n && i < n)  
        { 
            if (LMin[i] <= RMax[j])  
            { 
                maxDiff = Math.max(maxDiff, j - i); 
                j = j + 1; 
            }  
            else 
                i = i + 1; 
        } 
  
        return maxDiff; 
    } 
  
    /* Driver program to test the above functions */
    public static void main(String[] args)  
    { 
        FindMaximumDiff max = new FindMaximumDiff(); 
        int arr[] = {9, 2, 3, 4, 5, 6, 7, 8, 18, 0}; 
        //int arr[] = {2,2,2,2,2}; 
        int n = arr.length; 
        int maxDiff = max.maxIndexDiff(arr, n); 
        System.out.println(maxDiff); 
    } 

    void print(int[] arr, int n){
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+ " ");

        }
        System.out.println();
    }
} 