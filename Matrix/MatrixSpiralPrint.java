class MatrixSpiralPrint{
    public int count = 1;
    public static void main(String[] args) {
        MatrixSpiralPrint obj = new MatrixSpiralPrint();
        int n = 4;

        int[][] res = obj.sprial(n);
        //obj.print_arr(res, n);
        obj.create_arraylist(res, n);
    }

    int[][] sprial(int size){
        int arr[][] = new int[size][size];

        int k, m,l,n ,i;
        k = l = 0;
        m = n = size ;

        while(k < m && l < n){
            for(i=l ; i<n ; i++){
                arr[k][i] = count;
                count++;
            }
            k++;
            
            for(i=k ; i<m ; i++){
                arr[i][n-1] = count;
                count++;
            }
            n--;

            if(k < m){
                for(i=n-1 ; i>=l ; i--){
                    arr[m-1][i] = count;
                    count++;
                }
                m--;
            }

            if(l < n){
                for(i=m-1; i>=k ; i--){
                    arr[i][l] = count;
                    count++;
                }
                l++;
            }
        }

        //we now have complete matrix...
        return arr;
    }

    ArrayList<ArrayList<Integer>> create_arraylist(int[][] arr, int n){
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<n ; i++){
            ArrayList<Integer> list1 = new ArrayList<Integer>();
            for(int j=0 ; j<n ; j++){
               list1.add(arr[i][j]);
            }
            list.add(list1);
        }
        return list;
    }

    // void print_arr(int[][] arr, int n){
    //     for(int i=0; i<n ; i++){
    //         for(int j=0 ; j<n ; j++){
    //             System.out.print(arr[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    // }
}