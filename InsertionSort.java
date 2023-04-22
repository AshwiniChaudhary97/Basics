public class InsertionSort {
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void insertionSort(int[] array, int size){
        for(int i=1; i<size; i++){
            for(int j=i; j>0; j--){
                if(array[j] < array[j-1]){
                    swap(array,j,j-1);
                }
                else break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {9,9,8,7,6,5,11};
        insertionSort(array, array.length);
        for(int i : array){
            System.out.print(i + " ");
        }
    }
}
