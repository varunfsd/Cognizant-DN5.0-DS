package DeepSkilling;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 6;
        int left = 0, right = arr.length - 1;
        boolean isFound = false;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println("Found");
                isFound = true;
                break;
            } else if (target > arr[mid])
                left = mid + 1;
            else
                right = mid - 1;
        }
        if (!isFound)
            System.out.println("Not Found");
        sc.close();
    }
}
