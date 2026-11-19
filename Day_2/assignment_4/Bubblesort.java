package Day_2.assignment_4;
import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] num = {42, 17, 35, 8, 36};
        int n = num.length;
        for (int pass = 1; pass < n; pass++) {
            for (int i = 0; i < n - pass; i++) {
                if (num[i] > num[i + 1]) {
                    int temp = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = temp;
                }
            }
            System.out.println("Pass " + pass + ": " + Arrays.toString(num));
        }
    }
}
