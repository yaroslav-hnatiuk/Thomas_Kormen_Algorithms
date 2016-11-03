package merge_sort;

public class MergeSort {
    public static void sort(int[] array, int begin, int end)
    {
        if(begin == end) {
            return;
        }else
        {
            int mid = (begin + end + 1) / 2;
            sort(array, begin, mid - 1);
            sort(array, mid, end);
            merge(array, begin, end, mid);
        }
    }

    public static void merge(int[] array, int begin, int end, int mid) {
        int lPointer = 0, rPointer = 0;

        int leftSize = mid - begin;
        int[] leftPart = new int[leftSize];

        int rightSize = end - mid + 1;
        int[] rightPart = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftPart[i] = array[begin + i];
        }

        for (int i = 0; i < rightSize; i++) {
            rightPart[i] = array[mid + i];
        }

        while(lPointer < leftSize && rPointer < rightSize){
            if(leftPart[lPointer] < rightPart[rPointer]){
                array[begin++] = leftPart[lPointer++];
            }
            else{
                array[begin++] = rightPart[rPointer++];
            }
        }

        while (lPointer < leftPart.length){
            array[begin++] = leftPart[lPointer++];
        }

        while (rPointer < rightPart.length){
            array[begin++] = rightPart[rPointer++];
        }
    }
}
