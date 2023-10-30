import java.util.HashMap;

public class SubArray0Sum {
    public static void main(String[] args) {
        int[] array = {3,4,-7,3,1,3,1,-4,-2,-2};
        int[] prefix = new int[array.length];
        prefix[0]=array[0];
        for(int i=1;i<array.length;i++){
            prefix[i]=prefix[i-1]+array[i];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< prefix.length;i++){
            if(map.containsKey(prefix[i])){
                System.out.println(true);
            }
            map.put(prefix[i],i);
        }
    }
}
