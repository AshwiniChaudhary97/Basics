public class N_Queens_HashMap {
    public static boolean isSafeAt(int[] rowCheck, int[] LDCheck, int[] RDCheck,int row){
        if(rowCheck[row] == 1)
            return false;

        if(LDCheck[row] == 1)
            return false;

        if(RDCheck[row] == 1)
            return false;

        return true;
    }
    public static void printQueens(int[][] array, int n, int col,int[] rowCheck, int[] LDCheck, int[] RDCheck){
        if(col == n){
            for(int[] i : array){
                for(int j : i){
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for(int row=0; row<n; row++){
            if(isSafeAt(rowCheck,LDCheck,RDCheck,row) == true){
                array[row][col] = 1;
                rowCheck[row] = 1;
                LDCheck[row+col] = 1 ;
                RDCheck[(n-1) + (col-row)] = 1 ;
                printQueens(array,n,col+1,rowCheck,LDCheck,RDCheck);
                array[row][col] = 0;
                rowCheck[row] = 0 ;
                LDCheck[row+col] = 0 ;
                RDCheck[(n-1) + (col-row)] = 0 ;
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = {
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0}
        };

        int[] rowCheck = new int[array.length];
        for(int i=0; i< array.length; i++){
            rowCheck[i] = 0;
        }
        int[] LDCheck = new int[2* array.length];
        for(int i=0; i< array.length; i++){
            LDCheck[i] = 0;
        }
        int[] RDCheck = new int[2* array.length];
        for(int i=0; i< array.length; i++){
            RDCheck[i] = 0;
        }
        printQueens(array, array.length,0,rowCheck,LDCheck,RDCheck);

    }
}
