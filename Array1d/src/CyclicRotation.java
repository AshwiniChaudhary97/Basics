public class CyclicRotation {
    public static int[] cyclicRotate(int... array){
        int i = 1;
        int temp = 0;
        while(i < array.length){
            if(i != array.length-1){
                temp = array[i];
                array[i] = array[0];
                array[0] = temp;
            }else{
                temp = array[i];
                 array[i] = array[0];
                 array[0] = temp;
            }
            i++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = cyclicRotate(1,2,4,5,6,7,8,9,3,4,7,8,0,0);
        for (int element : array){
            System.out.print(element + " ");
        }
    }
}

