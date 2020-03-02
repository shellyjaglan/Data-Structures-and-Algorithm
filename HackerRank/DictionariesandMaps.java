Inimport java.util.*;
import java.io.*;
//import java.util.HashMap;

class DictionariesandMaps{
    public static void main(String []argh){
        DictionariesandMaps obj = new DictionariesandMaps();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
           // obj.addtoMap(name,phone);
            hm.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            obj.checkinMap(s,hm);
        }
        in.close();
    }
    /*
    void addtoMap(String name,int phone){
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        hm.put(name,phone);
    }*/
    void checkinMap(String name,HashMap<String,Integer> hm){
        if(hm.containsKey(name)){
            System.out.println(name+"="+(int) hm.get(name));
        }
        else{
            System.out.println("Not found");
        }
    }
}
