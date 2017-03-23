package algorithm.insertion_sort;

import utils.FillArrayUtil;

import java.util.Arrays;

public class TestInsertionSort {

    public static void main(String[] args) {
        int[] array = FillArrayUtil.RandomArray(100_000);
        System.out.println(Arrays.toString(array));

        int[] sortArray = InsertionSort.sort(array);

        System.out.println(Arrays.toString(sortArray));
    }
}
