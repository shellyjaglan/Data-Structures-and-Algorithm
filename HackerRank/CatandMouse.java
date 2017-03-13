import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CatandMouse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            findCatch(x,y,z);
        }
    }
    // static void findCatch(int a,int b,int c){
    //     if(c > b && c > a){
    //         System.out.println("Cat B");
    //     }
    //     else if(c < b && c < a){
    //         System.out.println("Cat A");
    //     }
    //     else{
    //         int d1 = Math.abs(b-c);
    //         int d2 = Math.abs(c-a);
    //         if(d1 > d2){
    //              System.out.println("Cat A");
    //         }
    //         if(d1 < d2){
    //              System.out.println("Cat B");
    //         }
    //         else
    //              System.out.println("Mouse C");
    //     }
    // }
    static void findCatch(int a,int b,int c){
        int d1 = Math.abs(c-a);
        int d2 = Math.abs(c-b);
        if(d1 < d2){
            System.out.println("Cat A");
        }
        if(d1 > d2){
            System.out.println("Cat B");
        }
        else{
            System.out.println("Mouse C");
        }
    }
}