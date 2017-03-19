import merge_sort.MergeSort;
import org.junit.Test;
import quick_sort.QuickSort;
import utils.FillArrayUtil;

/**
 * Created by yroslav on 11/2/16.
 */
public class TestMergeSort {
    @Test
    public void merge(){
        int[] array = FillArrayUtil.RandomArray(100_000);
        QuickSort quickSort = new QuickSort(array);
        System.out.println(quickSort.toString());
        quickSort.sort();
        System.out.println(quickSort.toString());
    }
}
