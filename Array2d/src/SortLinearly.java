public class SortLinearly {

    /*

        // sort 2D array in descending order
        public static void sort2dArray(int arr[][]) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        for (int l = 0; l < n; l++) {
                            if (arr[i][j] > arr[k][l]) {
                                // swap
                                int temp = arr[i][j];
                                arr[i][j] = arr[k][l];
                                arr[k][l] = temp;
                            }
                        }
                    }
                }
            }
        }

        public static void display2dArray(int arr[][]) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void main(String args[]) {
            int array[][] =
                    {
                            { 10, 28, 72, 91, 9 },
                            { 27, 33, 40, 52 },
                            { 69, 75, 73, 72 },
                            { 46, 33, 31, 2 }
                    };

            System.out.println("2d Array: ");
            display2dArray(array);

            // sort the array
            sort2dArray(array);

            System.out.println("\nSorted 2d Array: ");
            display2dArray(array);
        }
    }

     */

    public static int[][] sortLinear(int[][] array2D) {
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                for (int k = i; k < array2D.length; k++) {
                    if (i < k) {
                        for (int l = 0; l < array2D[k].length; l++) {
                            if (array2D[i][j] > array2D[k][l]) {
                                int temp = array2D[k][l];
                                array2D[k][l] = array2D[i][j];
                                array2D[i][j] = temp;
                            }
                        }
                    } else {
                        for (int l = j + 1; l < array2D[k].length; l++) {
                            if (array2D[i][j] > array2D[k][l]) {
                                int temp = array2D[k][l];
                                array2D[k][l] = array2D[i][j];
                                array2D[i][j] = temp;
                            }
                        }
                    }
                }
            }
        }
        return array2D;
    }

    public static void main(String[] args) {
        int[][] array = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        System.out.println("Before sorting");
        for (int[] arrays : array) {
            for (int element : arrays) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        array = sortLinear(array);
        System.out.println("after sorting");
        for (int[] arrays : array) {
            for (int element : arrays) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}



