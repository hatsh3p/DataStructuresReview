import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] grades = {89, 72, 40, 100, 67, 93, 79};
        System.out.println("Unsorted: " + Arrays.toString(grades));
        BubbleSort.sort(grades);
        System.out.println("Sorted: " + Arrays.toString(grades));
    }
}
