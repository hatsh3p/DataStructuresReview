public class BubbleSort {
    public static void sort(int[] array) {
        boolean swapping = true;
        while (swapping) {
            swapping = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    Swap.swap(i, i + 1, array);
                    swapping = true;
                }
            }
        }
    }
}
