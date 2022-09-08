import java.util.Scanner;

public class JaggedArray {
    public static int[][] createJagged(int row_size, int... col_size){
        int[][] array2d = new int[row_size][];

        for(int i=0; i<row_size; i++){
            array2d[i] = new int[col_size[i]];
        }
        Scanner input = new Scanner(System.in);
        System.out.println("enter the elements at indices :");

        System.out.println("the element at indices is : ");
        for(int i=0; i<row_size; i++){
            for(int j=0; j<array2d[i].length; j++){
                System.out.print("[" + i + "]" + "[" + j + "] : ");
                array2d[i][j] = input.nextInt();
            }
            System.out.println();
        }
        return array2d;
    }

    public static void printjagged(int[][] array2d){
        System.out.println("the given array is : ");
        for(int[] array : array2d){
            for(int element : array){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array2d = createJagged(4,1,2,3,4);
        printjagged(array2d);
    }
}
