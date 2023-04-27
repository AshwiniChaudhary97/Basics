public class QuickSort2 {
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void quickSort(int[] array, int p, int r){
        if(p<r) {
            int pivotIndex = partision(array, p, r);
            quickSort(array, p, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, r);
        }
    }

    public static int partision(int[] array, int p, int r){
        int i = p;
        int j = r;
        while(i<j){
            while(i<r && array[i] <= array[p]){
                i++;
            }
            while(j>p && array[j] > array[p]){
                j--;
            }
            if(i<j){
                swap(array,i,j);
            }
        }
        swap(array, j, p);
        return j;
    }

    public static void main(String[] args) {
        int[] array = {1,4,5,2,3};
        quickSort(array,0,array.length-1);
        System.out.println("final qs2");
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();

    }
}

