package bubble_sorting;

public class TestBubbleSorting {
    public static void main(String[] args) {
        int[] arr = {10,2,45,19,48,22};
        BubbleSorting bubbleSorting = new BubbleSorting(arr);
        System.out.println(bubbleSorting.toString());
        bubbleSorting.sort();
        System.out.println(bubbleSorting.toString());
    }
}
