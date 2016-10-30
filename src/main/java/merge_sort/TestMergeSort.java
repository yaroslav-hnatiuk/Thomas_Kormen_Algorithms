package merge_sort;

public class TestMergeSort {
    public static int[] arrayLeft = {1,2,2,3,4,7,8,10,20};
    public static int[] arrayRight = {1,4,5,6,10,11};

    public static void main(String[] args){
        int[] newArray = MergeSort.merge(arrayLeft, arrayRight);

        for (int i = 0; i < newArray.length; i++){
            System.out.println(newArray[i]);
        }
    }

}
