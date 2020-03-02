//what to do:- given  an array and a "sum", return if
//there exists a sub set(in random order) that sums to "sum".
//using recursion, dp should be used next...

class SumKArray{
    int count = 0;
    public static void main(String[] args){
        SumKArray obj = new SumKArray();
        int[] arr = {1,2,3, 10};
        int x = 8;
        int n  = arr.length;
        System.out.println("here ans: "+ obj.recur(arr, x,n));


        int[][] arr2 = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        int[][] arr3 = {{0, 0, 0, 0}, 
                       {0, -1, 0, 0}, 
                       {-1, 0, 0, 0}, 
                       {0, 0, 0, 0}};

        int m= 4;
        System.out.println("here count: "+ obj.findpaths(arr3,m, 0, 0));

    }

    int findpaths(int[][] arr, int n, int i, int j){
        if(i < 0 || j < 0)
            return 0;
        if(i == n-1 && j== n-1){
            return 1;
        }

        if(arr[i][j] == 1)
            return 0;

        if(i == n-1){
            return findpaths(arr, n, i, j+1);
        }

        if(j == n-1)
            return findpaths(arr, n, i+1, j);

        return findpaths(arr, n, i+1, j) + findpaths(arr, n, i, j+1);
    }

    boolean recur(int arr[], int x, int n){
        if(x == 0)
            return true;
        if( n == 0 && x != 0){
            return false;
        }

        if(arr[n-1] > x)
            return recur(arr, x, n-1);
        return recur(arr, x, n-1) || recur(arr, x-arr[n-1], n-1);
    }
}