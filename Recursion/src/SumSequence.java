import java.util.ArrayList;

public class SumSequence {
    public static void printSumSeq(ArrayList<Integer> array, int n, int target, ArrayList<Integer> temp){
        /*
        //PRINTS ALL THE SEQUENCE WITH TARGET AS TOTAL VALUE
        if(n == 0){
            if(target == 0){
                for(int i : temp){
                System.out.print(i + " ");
                }
                System.out.println();
            }
         }

         */

        //PRINTS ONLY ONE SEQUNCE AS SOON AS IT IS FOUND

        if(n == 0){
            return;
        }
        if(target == 0){
            for(int i : temp){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        else{
            temp.add(array.get(n-1));
            target = target - array.get(n-1);
            printSumSeq(array, n-1, target, temp);
            temp.remove(temp.size()-1);
            target = target + array.get(n-1);
            printSumSeq(array, n-1, target, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(4);
        array.add(4);
        array.add(3);
        array.add(2);
        array.add(1);

        ArrayList<Integer> temp = new ArrayList<>(4);
        printSumSeq(array, array.size(), 6, temp);
    }
}
