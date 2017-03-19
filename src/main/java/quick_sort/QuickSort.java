package quick_sort;

public class QuickSort {
    public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }
    private static void sort(int[] a, int lo, int hi) {
        if ((hi - lo) <= 0) return;

        int pivot = a[hi];
        int j = partition(a, pivot, lo, hi);

        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static int partition(int[] a, int pivot, int lo, int hi) {
        int leftPtr = lo - 1, rightPtr = hi;
        while (true) {
            while (a[++leftPtr] < pivot) ;
            while (a[--rightPtr] > pivot && rightPtr > 0);

            if (leftPtr>=rightPtr)
                break;
            else
                swap(a,rightPtr,leftPtr);
        }
        swap(a, leftPtr, hi);
        return leftPtr;
    }

    private static void swap(int[] a, int rightPtr, int leftPtr) {
        int temp = a[leftPtr];
        a[leftPtr] = a[rightPtr];
        a[rightPtr] = temp;
    }
}
/*{3, 5, 11, 22, 34, 2, 8}*/