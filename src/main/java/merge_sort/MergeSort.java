package merge_sort;

public class MergeSort {
    public static int[] sort(int[] array){
        return array;
    }

    public static int[] merge(int[] leftArr, int[] rightArr){
        int[] array = new int[leftArr.length + rightArr.length];

        int l = 0,r = 0, res = 0;

        while ( l < leftArr.length && r < rightArr.length ){
            if(leftArr[l] < rightArr[r]){
                array[res++] = leftArr[l++];
            }

            else{
                array[res++] = rightArr[r++];
            }
        }

        while (rightArr.length > r){
            array[res++] = rightArr[r++];
        }

        while (leftArr.length > l){
            array[res++] = leftArr[l++];
        }

        return array;
    }
}
