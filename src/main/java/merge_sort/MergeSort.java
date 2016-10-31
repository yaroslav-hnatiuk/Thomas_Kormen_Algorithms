package merge_sort;

public class MergeSort {
    public static void sort(int[] array, int begin, int end)
    {
        if(begin == end) {
            return;
        }else
        {
            int mid = (begin + end) / 2;
            sort(array, begin, mid);
            sort(array, mid + 1, end);
            merge(array, begin, end, mid);
        }
    }

    private static int[] merge(int[] array, int begin, int end, int mid){
        int lengthLeft = begin + mid;
        int lengthRight = end - mid + 1;

        int[] leftPart = new int[lengthLeft];
        int[] rightPart = new int[lengthRight];

        for (int i = 0; i < leftPart.length; i++) {
            leftPart[i] = array[i];
        }

        for (int i = 0; i < rightPart.length; i++) {
            rightPart[i] = array[mid + i];
        }

        int l = 0,r = 0, res = 0;

        while ( l < leftPart.length && r < rightPart.length ){
            if(leftPart[l] < rightPart[r]){
                array[res++] = leftPart[l++];
            }

            else{
                array[res++] = rightPart[r++];
            }
        }

        while (rightPart.length > r){
            array[res++] = rightPart[r++];
        }

        while (leftPart.length > l){
            array[res++] = leftPart[l++];
        }

        return array;
    }
}
