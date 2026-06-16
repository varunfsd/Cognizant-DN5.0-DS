package DeepSkilling;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 6, 7, 3, 8, 9, 2 };
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.print(Arrays.toString(arr));
    }
}
