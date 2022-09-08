public class GroupingNegatives {
    public static int[] groupedNegative(int[] array){
        int i = 0;
        while(i < array.length){
            if(array[i] > 0){
                int j = i+1;
                while(j < array.length){
                    if(array[j] < 0 ) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                    j++;
                }
            }
            i++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {-2,1,-1,2,4,5,6,-5,-8,0,-3,-4};
        int[] newArray = groupedNegative(array);
        for(int element : newArray){
            System.out.print(element + " ");
        }
    }
}
