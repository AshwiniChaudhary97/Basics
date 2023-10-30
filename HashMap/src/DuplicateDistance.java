import java.util.HashMap;

public class DuplicateDistance {
    public static void main(String[] args) {
        int[] array = {2,4,2,6,7,4,3,9,6,4,2};
        int k=6;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                if(i-map.get(array[i])<=k){
                    System.out.print(array[i]);
                    System.out.println();
                }
            }
            else{
                map.put(array[i],i);
            }
        }
    }
}
