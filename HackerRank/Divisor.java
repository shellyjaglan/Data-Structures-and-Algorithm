import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Divisor {
    int max;
    int max_no;
    public static void main(String[] args) {
        Divisor obj = new Divisor();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i=1 ; i<=n ; i++){
            if(n % i == 0){
                //go to the function...send i..
                obj.calAns(i);
            }
        }
        // for(int i=0 ; i<5 ; i++){
        //     obj.calAns(in.nextInt());
        // }
        System.out.println("max no is: "+ obj.max_no);
    }
    void calAns(int n){
        int num = n;
        int sum = 0 ;
        while(num != 0){
            sum += num%10;
            num = num/10;
        }
        if(sum > max){
            max = sum;
            max_no = n;
        }
        if(sum == max){
            if(n < max_no){
                max_no = n;
            }
        }
        System.out.println("sum is: "+sum);
        System.out.println("max is: "+max);
        System.out.println("max_no is: "+max_no);
    }
}