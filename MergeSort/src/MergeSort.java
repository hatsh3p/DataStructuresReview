import java.util.Arrays;

public class MergeSort {
    /**
     * A recursive sort that divides the array in half until each array contains
     * a single element then merges the arrays.
     *
     * @param arr
     * @return
     */
    public static int[] sort(int arr[]) {
        int length = arr.length;
        if (length <= 1) {
            return arr;
        }
        int mid = Math.floorDiv(length, 2);
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, length);
        return merge(sort(left), sort(right));
    }

    /**
     * Takes two arrays and merges them into a new array.
     *
     * @param left
     * @param right
     * @return
     */
    private static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int currentIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) { // Current left value is less than current right value.
                merged[currentIndex] = left[leftIndex]; // Set current index == to left value.
                leftIndex++; // Allows us to check the next left value.
            } else {
                merged[currentIndex] = right[rightIndex];
                rightIndex++;
            }
            currentIndex++;
        }

        // When the while loop exits, either the left or right may still have values that need
        // to be copied over to merged. The next two lines copy those values.
        System.arraycopy(left, leftIndex, merged, currentIndex, left.length - leftIndex);
        System.arraycopy(right, rightIndex, merged, currentIndex, right.length - rightIndex);
        return merged;
    }
}
