import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CutTheSticks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        print(arr);
    }
    static int min(int[] a){
        int len = a.length;
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i<len ; i++){
          if(a[i] != 0){
            if(a[i] < min){
                min = a[i];
            }
          }   
        }
        return min;
    }
     public static void print(int[] a){
      int len = a.length;
      while(len >= 1){
          System.out.println(len);
        int count = 0;
          
          int mini = min(a);
        
          for(int i = 0;i < a.length;i++){
              if(a[i] != 0){
                  a[i] = a[i] - mini; 
                  
                  if(a[i] == 0){
                      count ++;
                  }
              }                
          }
          len = len - count;
      }
    }
}
