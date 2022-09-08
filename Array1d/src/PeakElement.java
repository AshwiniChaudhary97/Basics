public class PeakElement {
    public static int findPeak(int[] array){
        int i = 0;
        while(i < array.length){
            if(array.length == 1){
                return i;
            }
            else if(i == 0){
                if(array[i] > array[i+1]){
                    return i;
                }
            }
            else if(i == array.length-1){
                if(array[i] > array[i-1]){
                    return i;
                }
            }
            else {
                if(array[i] > array[i-1] && array[i] > array[i+1]){
                    return i;
                }
            }
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,6,0};
        int peakIndex = findPeak(array);
        System.out.println("The peak element is " + array[peakIndex] + " at index " + peakIndex);
    }
}
