public class FirstOccurence {
    public static int firstOccurence(int[] array, int size, int target){
        int low = 0;
        int high = size-1;
        int index = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(array[mid] == target){
                index = mid;
                high = mid-1;
            }
            else if(array[mid] > target){
                high = mid-1;
            }
            else low = mid+1;
        }
        return index;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,3,4,4,4,4,5,5,5,6,6,6,7};
        System.out.println(firstOccurence(array,array.length,5));
    }
}
