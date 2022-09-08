import java.sql.SQLOutput;
import java.util.Scanner;

public class Create2dMethod {
    public static int[][] create2d(int n, int m){
        int[][] array2d = new int[n][m];

        Scanner input = new Scanner(System.in);

        System.out.println("enter the elements at indices :");

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("[" + i +"]" + "[" + j + "] : ");
                array2d[i][j] = input.nextInt();
            }
        }
        return array2d;
    }

    public static void printArray(int[][] array2d){
        System.out.println("The given array is : ");
        for(int[] array : array2d){
            for(int element : array){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] first2dArray = create2d(2,3);
        int[][] second2dArray = create2d(3,2);

        printArray(first2dArray);
        printArray(second2dArray);
    }
}
