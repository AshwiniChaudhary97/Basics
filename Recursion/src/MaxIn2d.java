public class MaxIn2d {
    public static int findMaxIn2d(int[][] array, int row){
        if(row == 0){
            return -1;
        }
        int col = 0;
        int max = array[row-1][col];

        while(col < array[row-1].length){
            if(max < array[row-1][col]){
                max = array[row-1][col];
            }
            col++;
        }

        max = (max < findMaxIn2d(array, row-1)) ? findMaxIn2d(array , row-1):max;
        return max;
    }

    public static void main(String[] args) {
        int[][] array = {{1,2,3},{2,32,4},{4,5,6}};
        System.out.println("max element in array is " + findMaxIn2d(array, array.length));
    }
}
