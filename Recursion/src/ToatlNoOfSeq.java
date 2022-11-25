import java.util.ArrayList;

public class ToatlNoOfSeq {
    public static int TotalSeq(ArrayList<Integer> array, int n, int target, ArrayList<Integer> temp){
        if(n == 0){
            if(target == 0){
                return 1;
            }
            else return 0;
        }
        else{
            temp.add(array.get(n-1));
            target = target - array.get(n-1);
            int first = TotalSeq(array,n-1, target, temp);
            temp.remove(temp.size()-1);
            target = target + array.get(n-1);
            int second = TotalSeq(array,n-1, target, temp);
            return first + second;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(4);
        array.add(4);
        array.add(3);
        array.add(2);
        array.add(1);

        ArrayList<Integer> temp = new ArrayList<>(4);

        int flag = TotalSeq(array, array.size(), 3, temp);
        System.out.println(flag);
    }
}
