import java.util.Arrays;
import java.util.HashMap;

public class LongConsecSeq {
    public static void main(String[] args) {
        int[] arrays = {1,4,6,8};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arrays.length;i++){
            map.put(arrays[i],i);
        }
        int max = 1;
        int count = 1;
        for(int i=0;i<arrays.length;i++){
            int j=0;
            if(map.containsKey(arrays[i]-1)){
                continue;
            }
            while(map.containsKey(arrays[i] + ++j)){
                count++;
            }
            if(count>max){
                max = count;
                count=1;
            }
        }
        System.out.println(max);
    }
}
