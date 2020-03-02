import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WhoWinsGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WhoWinsGame obj = new WhoWinsGame();
        
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int size = in.nextInt();
            int arr[] = new int[size];
            for(int i=0 ; i<size ; i++){
                arr[i] = in.nextInt();
            }
            obj.whoWins(arr);
        }
    }
    void whoWins(int[] arr){
        int max = Integer.MIN_VALUE;
       int count = 0;
        for(int k=0 ; k<arr.length ; k++){
            if(arr[k] > max){
                count++;
                max = arr[k];
            }
        }
        if(count % 2 == 0){
            System.out.println("ANDY");
        }
        else{
            System.out.println("BOB");
        }
    }
}
