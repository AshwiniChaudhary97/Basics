import java.util.HashMap;

public class _3Sum {
    public static void main(String[] args) {
        int[] array = {2, 7, 4, 0, 9, 5, 1, 3};
        int target = 7;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< array.length;i++){
            map.put(array[i],i);
        }
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                int diff = target - array[i]-array[j];
                if(map.containsKey(diff) && map.get(diff) >i &&  map.get(diff) >j){
                    System.out.println(array[i] + " " + array[j] + " " + diff);
                }
            }
        }
    }
}
