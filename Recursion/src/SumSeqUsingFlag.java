import java.util.ArrayList;

public class SumSeqUsingFlag {
    public static boolean seqUsingFlag(ArrayList<Integer> array, int n, int target, ArrayList<Integer> temp){
        if(n == 0 ){
            if(target == 0){
                for(int i : temp){
                    System.out.print(i + " ");
                }
                System.out.println();
                return true;
            }
            return false;
        }
        else{
            temp.add(array.get(n-1));
            target = target - array.get(n-1);
            if(seqUsingFlag(array, n-1, target, temp)){
                return true;
            }
            else{
                temp.remove(temp.size()-1);
                target = target + array.get(n-1);
                if(seqUsingFlag(array, n-1, target, temp)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(4);
        array.add(4);
        array.add(3);
        array.add(2);
        array.add(1);

        ArrayList<Integer> temp = new ArrayList<>(4);

        boolean flag = seqUsingFlag(array, array.size(), 1, temp);
        System.out.println(flag);
    }
}
