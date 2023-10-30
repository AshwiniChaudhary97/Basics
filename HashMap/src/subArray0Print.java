import java.util.HashMap;

public class subArray0Print {
    public static void main(String[] args) {
        int[] array = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        for(int i=0;i< array.length;i++){
            sum = sum+array[i];
            if(sum==0){
                for(int j=0;j<=i;j++){
                    System.out.print(array[j] + " ");
                }
                System.out.println();
            }
            if(map.containsKey(sum)){
                for(int j=map.get(sum)+1;j<=i;j++){
                    System.out.print(array[j] + " ");
                }
                System.out.println();
            }
            else map.put(sum,i);
        }

    }
}
