import java.util.Arrays;

public class RearrangeArrayInMaxMin {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        System.out.println(Arrays.toString(arr));
        RearrangeArray(arr);
        RearrangeArray2(arr);
    }

    public static void RearrangeArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        boolean bool = true;

        int[] temp = new int[arr.length];
        for (int k = 0; k < arr.length; k++) {
            if (bool) {
                temp[k] = arr[j];
                j--;
            } else {
                temp[k] = arr[i];
                i++;
            }
            bool = !bool;
        }

        for (int k = 0; k < temp.length; k++) {
            System.out.print(temp[k] + " ");
        }

    }

    public static void RearrangeArray2(int[] arr) {  //TC : O(N)  SC : O(N)
        int n = arr.length;
        int[] b = new int[n];
        int p = 0;
        int q = arr.length - 1;

        for (int i = 0; i < b.length; i++) {
            if (i % 2 == 0) {
                b[i] = arr[q];
                q--;
            } else {
                b[i] = arr[p];
                p++;               
            }
        }
        for (int i = 0; i < b.length; i++) {
           System.out.print(b[i]+" "); 
        }
    }
}
