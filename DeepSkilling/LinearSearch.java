package DeepSkilling;

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 4;
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element Fount At Index " + i);
                isFound = true;
            }
        }
        if (!isFound)
            System.out.println("Element Not Found");
        sc.close();
    }
}
