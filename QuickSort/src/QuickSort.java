public class QuickSort {
    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static int[] sort(int[] arr, int start, int end) {
        if (end > start) {
            int pivot = partition(arr, start, end);
            // Recurse on the left.
            if (start < pivot) {
                sort(arr, start, pivot);
            }
            // Recurse on the right.
            if (pivot + 1 < end) {
                sort(arr, pivot + 1, end);
            }
        }
        return arr;
    }

    private static int partition(int[] arr, int leftPointer, int rightPointer) {
        int pivot = arr[Math.floorDiv(leftPointer + rightPointer, 2)];

        while(leftPointer < rightPointer) {
            while (arr[leftPointer] < pivot) {
                leftPointer++;
            }
            while (arr[rightPointer] > pivot) {
                rightPointer--;
            }
            if (leftPointer < rightPointer) {
                Swap.swap(leftPointer, rightPointer, arr);
            }
        }
        return leftPointer; // Becomes the new pivot.
    }
}
