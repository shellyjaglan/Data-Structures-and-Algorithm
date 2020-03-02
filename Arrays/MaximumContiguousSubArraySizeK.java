import java.util.ArrayList;
import java.util.*;

class MaximumContiguousSubArraySizeK{
    public static void main(String[] args){
        MaximumContiguousSubArraySizeK obj = new MaximumContiguousSubArraySizeK();

       // int a[] = { 1, 4, 3, 2, 5 };
        int a[] = { 1, 9, 2, 7, 9, 3};

        ArrayList<Integer> res = new ArrayList<Integer>();

        res = obj.findMaxSubarray(a, 3);
        System.out.println("here res: "+ res);
    }

    ArrayList<Integer> findMaxSubarray(int[] arr, int k){
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        for(int i=0 ; i<arr.length-k+1 ; i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j=i ; j<k+i ; j++){
                temp.add(arr[j]);
            }

            list.add(temp);
        }

        //Collections.sort(list);
        Collections.sort(list, new Comparator<List<Integer>> () {
            public int compare(List<Integer> a, List<Integer> b) {
                return a.get(0).compareTo(b.get(0));
            }
        });

        return list.get(list.size() -1);
    }
}