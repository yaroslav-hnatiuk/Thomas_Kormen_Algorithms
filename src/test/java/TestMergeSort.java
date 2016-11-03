import merge_sort.MergeSort;
import org.junit.Test;

/**
 * Created by yroslav on 11/2/16.
 */
public class TestMergeSort {
    int[] firstArr = {1,4,7,18,22,24,1,3,10, 15, 18,21,24};
    int m = firstArr.length/2;
    @Test
    public void merge(){
        MergeSort.merge(firstArr,0,firstArr.length-1,m);
        for (int i = 0; i < firstArr.length; i++) {
            System.out.println(firstArr[i]);
        }
    }
}
