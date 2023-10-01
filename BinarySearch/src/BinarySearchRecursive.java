public class BinarySearchRecursive {
    public static int binarySearchRecursive(int[] array, int low, int high, int target){
        if(low>high){
            return -1;
        }
        int mid = low + (high-low)/2;
        if(array[mid] == target){
            return mid;
        }
        else if(array[mid] > target){
            return binarySearchRecursive(array,low,mid-1,target);
        }
        else return binarySearchRecursive(array,mid+1,high,target);
    }

    public static void main(String[] args) {
        int[] array = {-8,4,56,89};
        System.out.println(binarySearchRecursive(array,0, array.length-1,89));
    }
}
