public class NQueens {
    public static  boolean cellIsValid(int row, int col, int[][] array){
        for(int i=col-1; i>=0; i--){
            if(array[row][i] == 1)
                return false;
        }
        for(int i=row-1,j=col-1; i>=0 && j>=0;i--, j--){
            if(array[i][j] == 1)
                return false;
        }
        for(int i=row+1,j=col-1; i<= array.length-1 && j>=0;i++, j--){
            if(array[i][j] == 1)
                return false;
        }
        return true;
    }
    public static void n_Queens(int[][] chess, int n, int col){
        if(col == n){
            for(int[] i : chess){
                for(int j : i){
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int row=0; row<n; row++){
            if(cellIsValid(row,col,chess) == true){
                chess[row][col] = 1;
                n_Queens(chess,n,col+1);
                chess[row][col] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };
        n_Queens(array, array.length, 0);

    }
}
