import java.util.ArrayList;

public class CombinationSum2 {

    public static boolean check( ArrayList<ArrayList<Integer>> ds, ArrayList<Integer> temp){
        for(int i=0;i<ds.size();i++){
            if(ds.get(i) ==temp)
                return true;
        }
        return false;
    }


    public static void storeCombination(int[] array, int n,int index, int target, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> ds){

        if(index == n){
           if(target == 0){
               if(!check(ds,temp))
                   ds.add(temp);
           }
           return;
       }
        if(target < 0) {
            return;
        }
            temp.add(array[index]);
            storeCombination(array, n, index+1, target-array[index],temp, ds);
            temp.remove(temp.size()-1);
            storeCombination(array, n, index+1, target,temp, ds);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3};
        ArrayList<ArrayList<Integer>> ds = new ArrayList<ArrayList<Integer>>(6);
        ArrayList<Integer> temp = new ArrayList<>(6);
        storeCombination(array, array.length, 0,3,temp, ds);
            for(int i = 0; i < ds.size(); i++){
                for(int j = 0; j < ds.get(i).size(); j++){
                    System.out.print(ds.get(i).get(j));
                }
                System.out.println();
            }
    }
}
