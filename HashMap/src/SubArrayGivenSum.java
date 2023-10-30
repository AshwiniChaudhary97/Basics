import java.util.HashMap;

public class SubArrayGivenSum {
    public static void main(String[] args) {
        int[] nums = { 2, 6, 0, 9, 7, 3, 1, 4, 1, 10 };
        int target = 16;
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1] + nums[i];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< prefix.length;i++){
            map.put(prefix[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]+target)){
                System.out.print(map.get(nums[i]+target) + " " + (nums[i+1]));
                System.out.println();
            }
        }

    }
}
