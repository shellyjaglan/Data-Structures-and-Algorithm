import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        if(meet(x1,v1,x2,v2)){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
    public static boolean meet(int x1,int v1,int x2,int v2){
        int dis1 = x1;
        int dis2 = x2;
        if(x1 < x2 && v1 < v2)
            return false;
        while(dis1 < dis2){
            dis1 = dis1 + v1;
            dis2 = dis2 + v2;
            if(dis1 == dis2)
                return true;
        }
        return false;
    }
}
