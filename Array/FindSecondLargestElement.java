import java.util.Arrays;
public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        secondLargest(arr);
    }

    public static void secondLargest(int[] arr) {   //TC O(NLOGN)
        Arrays.sort(arr);
        for (int i = arr.length -2; i >= 0; i--) {
            if (arr[i] != arr[i + 1]) {
                System.out.println(arr[i]);
                break;
            }
        }
    }

    public static void secondLargest2(int[] arr) {  //TC  O(N)
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no second largest Element");
        } else {
            System.out.println("Second largest element : " + second);
        }
    }
}