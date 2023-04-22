public class SelectionSort {
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void selectionSort(int[] array, int size){
        for(int i=0; i<size-1; i++){
            int minIndex = i;

            for(int j=i+1; j<size; j++){
                if(array[j] < array[minIndex]){
                    swap(array,j,minIndex);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {9,0,7,6,5,4};
        selectionSort(array,array.length);
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
