import java.util.HashMap;

public class PairSum {
    public static void main(String[] args) {
        int[] nums = {8,7,2,5,3,1};
        int target = 10;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if (map.containsKey(diff) && map.get(diff) > i) {
                System.out.println(nums[i] + " " + diff);
            }
        }
    }
}
