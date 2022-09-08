import java.util.Scanner;

public class Create2dArray {
    public static void main(String[] args) {
        int[][] array2d = new int[3][2];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the element at indices : ");
        for(int i=0; i< array2d.length; i++){
            for(int j=0; j<array2d[i].length; j++){
                System.out.print("[" + i + "]" + "[" + j +"] : ");
                array2d[i][j] = input.nextInt();
            }
        }

        for(int[] array : array2d){
            for(int element : array){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
