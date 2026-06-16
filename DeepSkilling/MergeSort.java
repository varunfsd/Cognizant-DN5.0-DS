package DeepSkilling;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 6, 7, 1, 2, 8, 9 };

        mergeSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] b = new int[arr.length];

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                b[k] = arr[i];
                i++;
            } else {
                b[k] = arr[j];
                j++;
            }
            k++;
        }

        if (i > mid) {
            while (j <= right) {
                b[k] = arr[j];
                j++;
                k++;
            }
        } else {
            while (i <= mid) {
                b[k] = arr[i];
                i++;
                k++;
            }
        }

        for (int p = left; p <= right; p++) {
            arr[p] = b[p];
        }
    }
}