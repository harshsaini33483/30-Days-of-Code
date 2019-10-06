import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Birthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int finalArr[] = findAnswer(arr, n);
        for (int i : finalArr) {
            System.out.print(i + " ");
        }
    }

    public static int[] findAnswer(int arr[], int n) {
        int ans[] = new int[n];
        Arrays.fill(ans, 0);
        Arrays.sort(arr);
        int j = n - 1, k = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                ans[k] = arr[i];
                ++k;
            } else {
                ans[j] = arr[i];
                --j;
            }

        }
        return ans;
    }
}