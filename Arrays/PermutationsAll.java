import java.util.*;

class PermutationsAll{
    public static void main(String[] args) {
        PermutationsAll obj = new PermutationsAll();

        int[] arr = {1,2,3};
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        list = obj.permute(arr);
        System.out.print(list);
    }

    public List<List<Integer>> permute(int[] arr){
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        permuteRecur(arr, result);
        return result;
    }

    public void permuteRecur(int[] arr, List<List<Integer>> result){
        ArrayList<Integer> list = new ArrayList<Integer>();

        int len = arr.length;
        int x_index, y_index ;
        x_index = y_index = -1;
        int y = Integer.MAX_VALUE;

        for(int i=0 ; i<len ; i++){
            if(i != len-1 && arr[i] < arr[i+1]){
                x_index = i;
                y_index = i+1;
                y = arr[i+1];
            }else if(x_index != -1 && arr[i] > arr[x_index] && arr[i] <= y){
                y
            }
        }
    }
}