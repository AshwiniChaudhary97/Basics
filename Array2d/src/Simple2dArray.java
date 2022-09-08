public class Simple2dArray {
    public static void main(String[] args) {
        int[][] array2d ;
        array2d = new int[3][2];
        //accessing array element with proper indices
        array2d[0][0] = 1;
        array2d[0][1] = 2;
        array2d[1][0] = 3;
        array2d[1][1] = 4;
        array2d[2][0] = 5;
        array2d[2][1] = 6;

        System.out.println("The 2d array is : ");
        for(int i=0; i<array2d.length; i++){
            for(int j=0; j<array2d[i].length; j++){
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
