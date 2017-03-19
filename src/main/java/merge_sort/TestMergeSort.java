package merge_sort;

import utils.FillArrayUtil;

import java.util.Arrays;

public class TestMergeSort {
    public static void main(String[] args) {
        int[] array = FillArrayUtil.RandomArray(100_000);

        System.out.println(Arrays.toString(array));
        MergeSort mergeSort = new MergeSort(array);
        mergeSort.sort();
        System.out.println(mergeSort.toString());


    }
}
