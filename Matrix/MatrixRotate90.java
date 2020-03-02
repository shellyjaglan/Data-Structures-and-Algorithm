import java.util.ArrayList;

class MatrixRotate90{
    public int count = 1;
    public static void main(String[] args) {
        MatrixRotate90 obj = new MatrixRotate90();
        int n = 3;

        int[][] arr =  {{1,2,3},{4,5,6},{7,8,9}};

        //int[][] res = obj.rotate90(arr,n);
        //obj.print_arr(res, n);
        //obj.create_arraylist(res, n);

        //arraylis...
        ArrayList<ArrayList<Integer>> list_res = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        
        list2.add(4);
        list2.add(5);
        list2.add(6);

        list3.add(7);
        list3.add(8);
        list3.add(9);
        
        list_res.add(list1);
        list_res.add(list2);
        list_res.add(list3);
        
        obj.rotate90_list(list_res, n);
        System.out.println("here res: "+ list_res);        
    }


    
    int[][] rotate90(int[][] arr, int n){
        //transform..

        for(int i=0 ; i<n ; i++){
            for(int j=i; j<n ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=0 ; i<n ; i++){
            for(int j=0, k=n-1 ; j<k ; j++, k--){
                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
            }
        }

        return arr;
    }


    ArrayList<ArrayList<Integer>> rotate90_list(ArrayList<ArrayList<Integer>> arr, int n){
        //transform..

        for(int i=0 ; i<n ; i++){
            for(int j=i; j<n ; j++){

                int temp = (int)arr.get(i).get(j); //1
                arr.get(i).set(j, arr.get(j).get(i));
                arr.get(j).set(i, temp);

                // int temp = arr[i][j];
                // arr[i][j] = arr[j][i];
                // arr[j][i] = temp;
            }
        }

        for(int i=0 ; i<n ; i++){
            for(int j=0, k=n-1 ; j<k ; j++, k--){

                int temp = (int)arr.get(i).get(j); //1
                arr.get(i).set(j, arr.get(i).get(k));
                arr.get(i).set(k, temp);

                // int temp = arr[i][j];
                // arr[i][j] = arr[i][k];
                // arr[i][k] = temp;
            }
        }

        return arr;
    }

    // ArrayList<ArrayList<Integer>> create_arraylist(int[][] arr, int n){
    //     ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

    //     for(int i=0; i<n ; i++){
    //         ArrayList<Integer> list1 = new ArrayList<Integer>();
    //         for(int j=0 ; j<n ; j++){
    //            list1.add(arr[i][j]);
    //         }
    //         list.add(list1);
    //     }
    //     return list;
    // }

    void print_arr(int[][] arr, int n){
        for(int i=0; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}