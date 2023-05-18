public class MinInRotatedArray {
    public static int minRotatedArray(int[] array, int size){
        int low = 0;
        int high = size-1;
        int mid = -1;
        while(low<=high){
            if(array[high] >= array[low]){
                return 0;
            }
            mid = low + (high-low)/2;
            if(array[mid+1] < array[mid] ){
                return mid+1;
            }
            else if(array[mid] >= array[low] ){
                low = mid+1;
            }
            else if(array[mid] <= array[low] ){
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {7,8,2,3,4,5,6};
        System.out.println(minRotatedArray(array, array.length));
    }
}
