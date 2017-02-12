package merge_sort;

import merge_sort_v2.MergeSort2;

import java.util.Arrays;

public class TestMergeSort {
    public static Comparable[] array = {1, 23, 67, 16, 4, 7, 12, 10, 20, 28, 19, 19, 11, 121, 271} /*{3,5,2,8}*/;

    public static void main(String[] args) {
//        int begin = 0;
//        int end = array.length - 1;

        System.out.println("array size before: " + array.length);
        Arrays.stream(array).map(e -> e + " ").forEach(System.out::print);

        MergeSort2.sort(array);

        System.out.println("\narray size after: " + array.length);
        Arrays.stream(array).map(e -> e + " ").forEach(System.out::print);
    }

}
