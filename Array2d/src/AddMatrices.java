public class AddMatrices {
    public static int[][] sumArray(int[][] array1, int[][] array2){
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array1[i].length; j++){
                array1[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return array1;
    }

    public static void printArray(int[][] array){
        for(int[] elemArray : array){
            for(int element : elemArray){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] array2 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("the given arrays are : ");
        printArray(array1);
        System.out.println();
        printArray(array2);


        int[][] sumArray = sumArray(array1,array2);
        System.out.println("The sum array is : ");
        for(int[] array : sumArray){
            for(int element : array){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
