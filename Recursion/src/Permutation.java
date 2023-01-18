import java.util.ArrayList;

public class Permutation {
    public static void printPermutation(int[] array, int n, int index, boolean[] check, ArrayList<Integer> temp){
        if(index == n){
            for(int i : temp){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for(int i=0; i<n; i++){
            if(check[i] == false){
                temp.add(array[i]);
                check[i] = true;
                printPermutation(array,n,index+1,check,temp);
                temp.remove(temp.size()-1);
                check[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        ArrayList<Integer> temp = new ArrayList<>();
        boolean[] check = new boolean[array.length];
        for(int i=0; i< check.length; i++){
            check[i] = false;
        }
        printPermutation(array,array.length,0,check,temp);
    }
}
