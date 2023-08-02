public class SpiralTraversing {
    public static void traversing(int[][] array, int size, int row, int col){
        if(size%2 == 0 && row == size/2 && col == size/2){
            return;
        }
        else if(size%2 != 0 && row == size/2 && col == size/2){
            System.out.print(array[row][col] + " ");
            return;
        }
        int i = row;
        int j = col;
            while(j < array.length-1-col){
                System.out.print(array[i][j] + " ");
                j++;
            }
        while(i < array.length-1-row){
                System.out.print(array[i][j] + " ");
                i++;
            }
        while(j > col){
                System.out.print(array[i][j] + " ");
                j--;
            }
        while(i > row) {
                System.out.print(array[i][j] + " ");
                i--;
            }
        traversing( array, array.length, row+1, col+1);
        return;
    }
    public static void main(String[] args) {
        int[][] array = new int[6][6];
        for(int i = 0; i< array.length; i++){
            for(int j = 0; j< array.length; j++){
                array[i][j] = i+j;
            }
        }

        for(int[] i : array){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        traversing(array, array.length, 0,0);


    }
}
