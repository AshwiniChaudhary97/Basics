public class PermutationSwap {
    public static void printPermutation(int[] array, int n, int index){
        if(index == n){
            for(int i : array){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for(int i=index; i<n; i++){
            swap(index,i,array);
            printPermutation(array,n,index+1);
            swap(index,i,array);
        }
    }
    public static void swap(int index, int i, int[] array){
        int temp = 0;
        temp = array[index];
        array[index] = array[i];
        array[i] = temp;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        printPermutation(array,array.length,0);
    }
}
