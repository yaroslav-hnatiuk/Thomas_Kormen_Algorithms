package utils;

/**
 * Created by asutp on 19.03.17.
 */
public class FillArrayUtil {
    public static int[] RandomArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize - 1; i++) {
            array[i] = (int) (Math.random() * (arraySize - 1));
        }
        return array;
    }
}
