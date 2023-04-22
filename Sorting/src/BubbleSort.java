public class BubbleSort {

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void bubbleSort_1(int[] array, int size){
        int i = 0;
        while(i<size-1){
            int j = 0;
            while(j<size-1){
                if(array[j] > array[j+1]){
                    swap(array,j,j+1);
                }
                j++;
            }
            i++;
        }
    }

    public static void bubbleSort_2(int[] array, int size){
        int i = 0;
        while(i<size-1){
            int j = 0;
            while(j<size-1-i){
                if(array[j] > array[j+1]){
                    swap(array,j,j+1);
                }
                j++;
            }
            i++;
        }
    }

    public static void bubbleSort_3(int[] array, int size){
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            int j = 0;
            while(j<size-1){
                if(array[j] > array[j+1]){
                    swap(array,j,j+1);
                    sorted = false;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = {9,7,5,3,1};
        bubbleSort_1(array1, array1.length);

        for(int k : array1){
            System.out.print(k + " ");
        }
        System.out.println();

        int[] array2 = {9,7,5,3,1};
        bubbleSort_2(array2, array2.length);

        for(int k : array2){
            System.out.print(k + " ");
        }
        System.out.println();

        int[] array3 = {9,7,5,3,1};
        bubbleSort_3(array3, array3.length);

        for(int k : array3){
            System.out.print(k + " ");
        }
        System.out.println();

    }
}
