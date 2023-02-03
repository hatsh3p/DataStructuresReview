import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] luckyNumbers = {27, 45, 18, 54, 36, 63, 9};
        System.out.println(Arrays.toString(luckyNumbers));
        QuickSort.sort(luckyNumbers);
        System.out.println(Arrays.toString(luckyNumbers));
    }
}
