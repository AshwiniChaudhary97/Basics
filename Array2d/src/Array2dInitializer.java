public class Array2dInitializer {
    public static void main(String[] args) {
        int[][] array2d = {{1,2,0},{3,4,0},{5,6,0},{7,8,0}};
        for(int[] array : array2d){
            for(int element : array){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
