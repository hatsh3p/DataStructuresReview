import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] sanJoseTemperatures = {40, 76, 35, 55, 82, 90, 41, 58, 60, 78};
        int[] sortedTemperatures = MergeSort.sort(sanJoseTemperatures);
        System.out.println(Arrays.toString(sortedTemperatures));
    }
}
