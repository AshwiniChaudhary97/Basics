public class QuickSort {
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
            while(i<r && array[i] < array[r]){
                i++;
            }
            while(j>p && array[j] >= array[r]){
                j--;
            }
            if(i<j){
                swap(array,i,j);
                System.out.println("After swapp");
                for(int k : array){
                    System.out.print(k + " ");
                }
                System.out.println();
            }
        }
            swap(array, i, r);
        System.out.println("After 2bd swapp");
        for(int k : array){
            System.out.print(k + " ");
        }
        System.out.println();
        return i;
    }
    public static void quickSort2(int[] array, int p, int r){
        if(p<r) {
            int pivotIndex = partision2(array, p, r);
            quickSort(array, p, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, r);
        }
    }
    public static int partision2(int[] array, int p, int r){
        int pI = p;
        for(int i=p; i<r; i++){
            if(array[i] < array[r]){
                swap(array,i,pI);
                pI++;
            }
        }
        swap(array,pI,r);
        return pI;
    }


    public static void main(String[] args) {
        int[] array = {7,8,9,6,3,4,5};
        quickSort(array,0,array.length-1);
        System.out.println("final");
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();

        int[] array2 = {4,3,2,1};
        quickSort2(array2,0,array2.length-1);
        System.out.println("final");
        for(int i : array2){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
