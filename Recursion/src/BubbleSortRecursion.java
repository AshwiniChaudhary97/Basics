public class BubbleSortRecursion {
    public static int[] sortUsingRecursion(int[] array, int n){
        if(n == 0){
            return array;
        }
        array = sortUsingRecursion(array, n-1);

        int index = 0;
        while(index < n-1){
            if(array[n-1] < array[index]){
                int temp = array[n-1];
                array[n-1] = array[index];
                array[index] = temp;
            }
            index ++;
        }
        return array;

    }

    public static void main(String[] args) {
        int[] array = {2,3,4,1};
        array = sortUsingRecursion(array, array.length);
        for(int i : array){
            System.out.print(i + " ");
        }
    }
}
