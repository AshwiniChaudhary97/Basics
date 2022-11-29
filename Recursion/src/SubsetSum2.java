import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum2 {
   public static void subsetSum(int[] a, int n, int ind, ArrayList<Integer> temp, ArrayList<Integer> ds,int sum){

           for (int i : temp) {
               /*
                   if(temp.size() == 0){
                       System.out.print(0);
                   }
                   else {
                */

                   sum = sum + i;

               // }
           }
           ds.add(sum);

        for(int i=ind; i<n; i++){
            if(i>ind && a[i] == a[i-1]){
                continue;
            }
            temp.add(a[i]);
            subsetSum(a,n,i+1,temp,ds,0);
            temp.remove(temp.size()-1);
        }
   }

    public static void main(String[] args) {
        int[] array = {2,3};
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        subsetSum(array, array.length, 0,temp,ds,0);
        Collections.sort(ds);
        for(int i : ds){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
