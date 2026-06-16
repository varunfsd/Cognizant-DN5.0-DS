package DeepSkilling;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 6, 7, 3, 8, 9, 2 };
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            while (j > 0) {
                if (arr[j] < arr[j - 1]) {
                    int tep = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tep;
                } else {
                    break;
                }
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
