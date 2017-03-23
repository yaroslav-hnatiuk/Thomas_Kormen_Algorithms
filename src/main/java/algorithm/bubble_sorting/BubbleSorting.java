package algorithm.bubble_sorting;

import java.util.Arrays;

public class BubbleSorting {
    private int[] array;

    public BubbleSorting(int[] array) {
        this.array = array;
    }

    public void sort(){
        for (int i = array.length - 1; i > 1 ; i--) {
            for (int j = 0; j < i; j++) {
                if(array[j] > array[j+1]){
                    swap(j,j+1);
                }
            }
        }
    }

    private void swap(int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    @Override
    public String toString() {
        return "BubbleSorting{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
