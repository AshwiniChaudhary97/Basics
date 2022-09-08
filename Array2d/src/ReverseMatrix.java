public class ReverseMatrix {
    public static int[][] reverse(int[][] array){
        for(int i=0; i< array.length/2; i++){
            for(int j=0; j< (array[i].length); j++){
                int temp = array[i][j];
                array[i][j] = array[array.length-1-i][array[i].length-1-j];
                array[array.length-1-i][array[i].length-1-j] = temp;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        System.out.println("original array : ");
        for(int[] arrays : array){
            for(int element : arrays){
                System.out.print(element + " ");
            }
            System.out.println();
        }
        array = reverse(array);
        System.out.println("after reverse operation : ");
        for(int[] arrays : array){
            for(int element : arrays){
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}
