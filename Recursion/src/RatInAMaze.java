import java.util.ArrayList;

public class RatInAMaze {
    public static void printMaze(int[][] array, int n, int i, int j, ArrayList<Character> path){
        if(i == n-1 && j == n-1){
            for(char element : path){
                System.out.print(element + " ");
            }
            System.out.println();
        }

        if(j != n-1 && array[i][j+1] == 1){
            path.add('R');
            array[i][j] = 0;
            printMaze(array,n,i,j+1,path);
            path.remove(path.size()-1);
            array[i][j] = 1;
        }
        if(j !=0 &&array[i][j-1] == 1){
            path.add('L');
            array[i][j] = 0;
            printMaze(array,n,i,j-1,path);
            path.remove(path.size()-1);
            array[i][j] = 1;
        }
        if(i !=n-1 && array[i+1][j] == 1){
            path.add('D');
            array[i][j] = 0;
            printMaze(array,n,i+1,j,path);
            path.remove(path.size()-1);
            array[i][j] = 1;
        }
        if(i !=0 && array[i-1][j] == 1){
            path.add('U');
            array[i][j] = 0;
            printMaze(array,n,i-1,j,path);
            path.remove(path.size()-1);
            array[i][j] = 1;
        }
    }

    public static void main(String[] args) {
        int[][] array = {
                {1,1,0,0},
                {0,1,1,1},
                {1,1,1,1},
                {0,1,1,1}
        };
        ArrayList<Character> path = new ArrayList<>();
        printMaze(array, array.length, 0,0,path);
    }
}
