public class TransposeArray {
    public static int[][] transpose(int[][] array, int row, int col){
        int[][] transposed = new int[col][row];

        for(int rows=0;rows<transposed.length; rows++){
            for(int cols=0; cols<transposed[rows].length; cols++){
                transposed[rows][cols] = array[cols][rows];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
        int[][] array = {{1,2,3},{3,4,5},{5,6,7},};
        array = transpose(array,3,3);

        for(int[] arrays : array){
            for(int elements : arrays){
                System.out.print(elements + " ");
            }
            System.out.println();
        }
    }
}
