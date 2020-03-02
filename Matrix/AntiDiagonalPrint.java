import java.util.ArrayList;

class AntiDiagonalPrint{
    public static void main(String[] args) {
        AntiDiagonalPrint obj = new AntiDiagonalPrint();

        int n = 3;

        int[][] arr =  {{1,2,3},{4,5,6},{7,8,9}};

        //obj.dota(arr,n);

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
        
        ArrayList<ArrayList<Integer>> ans = obj.anti(list_res, n);
        obj.printlist(ans);
    }

    void dota(int[][] arr, int n){
        //dowhatever to the matrxi....

        for(int c=0 ; c<n ; c++){
            for(int r=0 ; r<=c ; r++){
                System.out.print(arr[r][c-r]+" ");
            }
            System.out.println();
        }

        for(int r=1 ; r<n ; r++){
            for(int c=n-1 ; c>=r ; c--){
                System.out.print(arr[n-c+r-1][c]+" ");
            }
            System.out.println();
        }
    }

    ArrayList<ArrayList<Integer>> anti(ArrayList<ArrayList<Integer>> list, int n){

        ArrayList<ArrayList<Integer>> result = new  ArrayList<ArrayList<Integer>>();
        
        for(int c=0 ; c<n ; c++){
            ArrayList<Integer> row = new ArrayList<Integer>();

            for(int r=0 ; r<=c ; r++){
                row.add(list.get(r).get(c-r));
                //System.out.print(arr[r][c-r]+" ");
            }
            result.add(row);
        }

        for(int r=1 ; r<n ; r++){
            ArrayList<Integer> row = new ArrayList<Integer>();

            for(int c=n-1 ; c>=r ; c--){
                row.add(list.get(n-c+r-1).get(c));
                //System.out.print(arr[n-c+r-1][c]+" ");
            }
            result.add(row);
            //System.out.println();
        }

        return result;
    }

    void printlist(ArrayList<ArrayList<Integer>> list){
        int n = list.size();
        System.out.println("size: "+ n);


    }
}




// public class Solution {
//     public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {
//          int rows = a.size();
//         ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        
//         for(int i=0 ; i<(rows*2)-1 ; i++){
//             int k = (i<rows)?0:i-rows+1;
//             ArrayList<Integer> row = new ArrayList<Integer>();
            
//             for(int j=k ; j<= (i-k) ; j++){
//                 row.add(a.get(j).get(i-j));
//             }
//             res.add(row);
//         }
//         return res;
//     }
// }
