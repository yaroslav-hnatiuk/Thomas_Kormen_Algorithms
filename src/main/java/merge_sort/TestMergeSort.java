package merge_sort;

import insertion_sort.InsertionSort;

public class TestMergeSort {
    public static int[] array = /*{1, 23, 67, 16, 4, 7, 12, 10, 20, 28, 19, 19, 11, 121, 271}*/ {3, 5, 11, 22, 34, 2, 8};

    public static void main(String[] args) {
//        int begin = 0;
//        int end = array.length - 1;

        System.out.println("array size before: " + array.length);
        for (int e :
                array) {
            System.out.print(e + " ");
        }

        InsertionSort.sort(array);

        System.out.println("\narray size after: " + array.length);
        for (int e :
                array) {
            System.out.print(e + " ");
        }
    }

}
