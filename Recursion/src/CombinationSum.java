import java.util.ArrayList;
 public class CombinationSum {
     public static void printCombinationSum(int[] array, int n, int target, int index, ArrayList<Integer> temp){
         if(index == n){
             if(target == 0){
                 for(int i : temp){
                     System.out.print(i + " ");
                 }
                 System.out.println();
             }
             return;
         }
         if(target < 0){
             return;
         }
         temp.add(array[index]);
         printCombinationSum(array, n, target-array[index], index, temp);
         temp.remove(temp.size()-1);
         printCombinationSum(array, n, target, index+1, temp);

     }

     public static void main(String[] args) {
         int[] array = {1,2,3,4};
         ArrayList<Integer> temp = new ArrayList<>(array.length);
         printCombinationSum(array, array.length, 4, 0, temp);
     }
 }
