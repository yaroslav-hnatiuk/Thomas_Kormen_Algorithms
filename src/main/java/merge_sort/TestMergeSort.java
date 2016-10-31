package merge_sort;

public class TestMergeSort {
    public static int[] array = {1,2,2,3,4,7,8,10,20,1,4,5,6,10,11};

    public static void main(String[] args){
        int begin = 0;
        int end = array.length - 1;

        MergeSort.sort(array, begin, end);

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

}
