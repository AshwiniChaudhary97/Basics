import java.util.ArrayList;
import java.util.Arrays;

public class CombSumPart2 {
    public static void combSum(int[] array, int n, int target, int index, ArrayList<Integer> temp){
/*

Here the condn "if(index == n)" wont be suitable as the index will not reach to "n" if target becomes < 0
before index == 0i f the condn is included then only that sequence will be printed when the index == n will
get target == 0;

 */
            if (target == 0) {
                for (int i : temp) {
                    System.out.print(i + " ");
                }
                System.out.println();
                return;
            }
            if(target < 0){
                return;
            }

        for(int i=index; i<n; i++){
            if(i>index && array[i] == array[i-1]) continue;
            /*
            here we didn't chose dont pick component as once an index  is greater then a target
            all the elements after it  will also be greater than it.
            WE can only track back and remove the previous element to adjust the target value.
             */

            //if(array[i] > target) break;

            temp.add(array[i]);
            combSum(array, n, target-array[i],i+1,temp);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,2};
        Arrays.sort(array);
        ArrayList<Integer> temp = new ArrayList<>();
        combSum(array, array.length, 13,0,temp);
    }
}
