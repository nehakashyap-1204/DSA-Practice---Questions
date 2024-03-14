import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZeroesToEndofArray {
    public static void main(String[] args) {
        int[] arr = {1,9,8,4,0,0,2,7,0,6,0,9};
        moveAllZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0,9));
        moveAllZeroes2(list);
        moveAllZeroes3(arr);
    }

    public static void moveAllZeroes(int[] arr) { // TC O(N)
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(j, i, arr);
                j++;
            } 
        }
    }
    public static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void moveAllZeroes2(List<Integer> list) {  // TC : O(N) SC : O(N)
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                count++;

                list.remove(i);
                i--;
            }
        }
        for (int i = 0; i < count; i++) {
            list.add(0);
        }
        System.out.println("Array after shifting zeroes to right side :");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void moveAllZeroes3(int[] a) { //TC : O(N)   SC : O(N)
        int n = a.length;
        int[] b = new int[n];
        int j = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                b[j] = a[i];
                j++;
            } else {
                count++;
            }
        }
        while (count > 0) {
            b[j] = 0;
            count--;
            j++;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
    }
}