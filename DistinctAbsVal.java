import java.util.HashMap;
public class DistinctAbsVal {
    public static void main(String[] args) {
        int[] array = {-1,-1,-1,0,0,1,1,1,2,3,4};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< array.length;i++){
            if(map.containsKey(Math.abs(i))){
                continue;
            }
            map.put(Math.abs(array[i]),i);
        }
        System.out.println(map.size());
    }
}
