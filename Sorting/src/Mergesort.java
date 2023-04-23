public class Mergesort {
    public static void mergeSort(int[] array, int p, int r){
        if(p==r){
            return;
        }
        int q = p + (r-p)/2;
        mergeSort(array,p,q);
        mergeSort(array,q+1,r);
        merge(array,p,q,r);
    }

    public static void merge(int[] array, int p, int q, int r){
        int[] temp = new int[array.length];

        int i = p;
        int j = q+1;
        int k = p;
        while(i<=q && j<=r){
            if(array[i] <= array[j]){
                temp[k] = array[i];
                i++;
                k++;
            }
            else{
                temp[k] = array[j];
                j++;
                k++;
            }
        }

        while(i<=q){
            temp[k] = array[i];
            i++;
            k++;
        }
        while(j<=r){
            temp[k] = array[j];
            j++;
            k++;
        }
        for(int index=p; index<=r; index++){
            array[index] = temp[index];
        }

    }

    public static void main(String[] args) {
        int[] array = {1,1,2,9,8,7,6,5,4,3};
        mergeSort(array,0, array.length-1);

        for(int i : array){
            System.out.print(i + " ");
        }
    }
}
