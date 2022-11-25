import java.util.ArrayList;

public class SubSequence {

// //WITH USING PARAMETER SEQUENCE ARRAY
    public static void printSubSeq(ArrayList<Integer> array, int size, int index, ArrayList<Integer> temp){
        if(index == size){
            if(temp.size() == 0){
                System.out.print("{}");
            }
            for(int i : temp){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        else{
            temp.add(array.get(index));
            printSubSeq(array, size, index+1, temp);
            temp.remove(temp.size()-1);
            printSubSeq(array, size, index+1, temp);
        }
    }
//WITHOUT USING PARAMETER SEQUENCE ARRAY
    public static void printSequence(ArrayList<Integer> array, int n){
        if(array.size() == 0){
            System.out.println("{}");
            return;
        }
        if(n < 0){
            for(int i : array){
                System.out.print(i + " ");
            }

            System.out.println();
        }

        else{
            int temp = array.get(n);
            array.remove(n);
            printSequence(array, n-1);
            array.add(n,temp);
            printSequence(array, n-1);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>(3);
        array.add(3);
        array.add(1);
        array.add(2);
        ArrayList<Integer> temp = new ArrayList<>(array.size());
        printSequence(array , array.size()-1);
        printSubSeq(array , array.size(), 0, temp);
    }
}
