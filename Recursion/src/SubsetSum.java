import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.*;

public class SubsetSum {
    public static void printSubsetSum(int[] array, int n, int index, int sum, ArrayList<Integer> temp){
        if(index == n){
            temp.add(sum);
            return;
        }

        printSubsetSum(array,n,index+1,sum,temp);
        printSubsetSum(array,n,index+1,sum + array[index],temp);
    }

    public static void main(String[] args) {
        int[] array ={1,2,3};
        ArrayList<Integer> temp = new ArrayList<>();
        printSubsetSum(array, array.length, 0,0,temp);
        Collections.sort(temp);
        for(int i : temp){
            System.out.println(i);
        }
    }
}
