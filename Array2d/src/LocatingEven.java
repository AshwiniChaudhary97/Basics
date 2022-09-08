public class LocatingEven {
    public static int[][] locateEven(int[][] array){
        for(int i =0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                if(array[i][j]%2 == 0){
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[][] array = {{1,2,3,6},{4,5,6,4},{7,8,9}};
        System.out.println("original array is : ");
        for(int[] arrays : array){
            for(int element : arrays){
                System.out.print(element + " ");
            }
            System.out.println();
        }
        array = locateEven(array);
        System.out.println("new array is : ");
        for(int[] arrays : array){
            for(int element : arrays){
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}
