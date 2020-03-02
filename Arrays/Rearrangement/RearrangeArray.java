import java.util.Scanner;

class RearrangeArray{
  public static void main(String[] args){
    int a[]= {-1,-1,6,1,9,3,2,-1,4,-1};
    rearrangeArray(a, a.length);
  }

  public static void rearrangeArray(int[] arr, int n){
    for(int i=0 ; i<n ;){
      if(arr[i] >=0 && arr[i] != i ){
        //swap the two..
        int x = arr[arr[i]];
        arr[arr[i]] = arr[i];
        arr[i] = x;
      }
      else
        i++;
    }
    
    for(int i=0 ; i<n; i++){
       System.out.print(arr[i]+ "  ");
    }
   
  }
}