//to to:- reach end of the matrix -(m,n)..
//filled with 0 or -1..where -1 denotes closure/broken path...
//find the  number of ways you could reach m,n using recursion...

class CountPathinMaze{
    public static void main(String[] args){
        CountPathinMaze obj = new CountPathinMaze();

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

}