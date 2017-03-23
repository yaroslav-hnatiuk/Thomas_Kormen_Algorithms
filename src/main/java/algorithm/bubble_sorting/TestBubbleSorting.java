package algorithm.bubble_sorting;

import utils.FillArrayUtil;

public class TestBubbleSorting {
    public static void main(String[] args) {
        int[] arr = FillArrayUtil.RandomArray(100_000);
        BubbleSorting bubbleSorting = new BubbleSorting(arr);
        System.out.println(bubbleSorting.toString());
        bubbleSorting.sort();
        System.out.println(bubbleSorting.toString());
    }
}
