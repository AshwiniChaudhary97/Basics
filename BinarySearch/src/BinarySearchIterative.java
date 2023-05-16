public class BinarySearchIterative {
    public static int binarySearch(int[] array, int size, int target){
        int low = 0;
        int high = size-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(array[mid] == target){
                return mid;
            }
            else if(array[mid] > target){
                high = mid-1;
            }
            else low = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {11,12,34,55,67,89};
        System.out.println(binarySearch(array,array.length,11));
    }
}
