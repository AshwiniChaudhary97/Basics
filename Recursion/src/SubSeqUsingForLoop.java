import java.util.ArrayList;

public class SubSeqUsingForLoop {
    public static void printSubSeq(int[] array, int n, int index, ArrayList<Integer> temp){
        if(temp.size() == 0){
            System.out.print("*");
        }
        else {
            for (int i : temp) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for(int i=index; i<n; i++){
            temp.add(array[i]);
            printSubSeq(array,n,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] array = {1,3,2};
        ArrayList<Integer> temp = new ArrayList<>();
        printSubSeq(array,array.length, 0, temp);
    }
}
