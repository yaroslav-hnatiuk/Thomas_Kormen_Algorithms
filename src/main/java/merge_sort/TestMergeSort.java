package merge_sort;

public class TestMergeSort {
    public static int[] array = {1,23,67,16,4,7,12,10,20,28,19,19,11,121,271};

    public static void main(String[] args){
        int begin = 0;
        int end = array.length - 1;

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();


        MergeSort.sort(array, begin, end);

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

}
