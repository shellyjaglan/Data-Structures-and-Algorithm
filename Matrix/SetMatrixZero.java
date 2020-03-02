import java.util.ArrayList;

class SetMatrixZero{
    public static void main(String[] args) {
        SetMatrixZero obj = new SetMatrixZero();

        ArrayList<ArrayList<Integer>> list_ori = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(0);
        list1.add(1);
        
        list2.add(1);
        list2.add(1);
        list2.add(1);

        list3.add(1);
        list3.add(1);
        list3.add(1);

        list_ori.add(list1);
        list_ori.add(list2);
        list_ori.add(list3);

        obj.setzero(list_ori);
    }

    ArrayList<ArrayList<Integer>> setzero(ArrayList<ArrayList<Integer>> list){
        int row = list.size();
        int column = list.get(0).size();

        boolean row_zero = false;
        boolean colmn_zero = false;

        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<column ; j++){
                if(i == 0 && list.get(i).get(j) == 0){
                    row_zero = true;
                }
                if(j == 0 && list.get(i).get(j) == 0){
                    colmn_zero = true;
                }

                if(list.get(i).get(j) == 0){
                    list.get(0).set(j, 0);
                    list.get(i).set(0, 0);
                }
            }
        }

        for (int i=1; i<row; i++){ 
            for (int j=1; j<column ; j++){ 
                if(list.get(0).get(j) == 0 || list.get(i).get(0) == 0){
                    list.get(i).set(j,0);
                }
            }   
        } 

        if(row_zero == true){
            for(int i=0 ; i<column ; i++){
                list.get(0).set(i,0);
            }
        }
        if(colmn_zero==true){
            for(int i=0 ; i<row ; i++){
                list.get(i).set(0, 0);
            }
        }

        return list;
    }
}