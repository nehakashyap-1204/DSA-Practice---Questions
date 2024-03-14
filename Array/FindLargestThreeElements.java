import java.util.Arrays;

public class FindLargestThreeElements {
    public static void main(String[] args) {
        int[] arr = { 10, 4, 3, 50, 23, 90 };
        findLargestThree2(arr);
    }

    public static void findLargestThree(int[] arr) {  //TC O(N)
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
        }
        System.out.println("First :" + first + " Second :" + second + " Third :" + third);
    }

    public static void findLargestThree2(int[] arr) {  //TC N(LOGN)
        Arrays.sort(arr);
        for (int i = arr.length -1; i >= 3; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}