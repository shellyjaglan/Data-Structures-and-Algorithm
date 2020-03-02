import java.util.*;

class RepeatedNumberNoSpace{
    public static void main(String[] args) {
        RepeatedNumberNoSpace obj = new RepeatedNumberNoSpace();

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(4);
        list.add(1);

        int item = obj.repeatedNumber(list);
        System.out.println("here res: "+ item);
    }
    
    public int repeatedNumber(ArrayList<Integer> list) {
        int size = list.size();
        
        for(int i=0 ; i<size-1 ; ){
            int item = list.get(i);
            int item_at_index = list.get(item);
            //swap these two if they are not same...
            
            if(item != item_at_index){
                //swap
                list.set(i, item_at_index);
                list.set(item, item);
            }else{
                return item;
            }
        }
        return -1;
    }
}

