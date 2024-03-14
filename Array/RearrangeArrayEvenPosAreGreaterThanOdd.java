import java.util.Arrays;

public class RearrangeArrayEvenPosAreGreaterThanOdd {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 2, 5 };
        int n = arr.length;
        RearrangeArray(arr, n);
    }

    public static void RearrangeArray(int[] arr, int n) {
        Arrays.sort(arr);
        int[] b = new int[n];
        int p = 0;
        int q = n - 1;

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 == 0) {
                b[i] = arr[q];
                q--;
            } else {
                b[i] = arr[p];
                p++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
