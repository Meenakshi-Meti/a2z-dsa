Problem 1  -> Sort the array and return the last element.
Brute force Approach:
import java.util.Arrays;

public class LargestElement {
    public static int largestElement(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 0};
        System.out.println(largestElement(arr));
    }
}

Better Approach:
public static int largestElement(int[] arr) {
    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }

    return max;
}

Problem 2 ->Second Largest Element in an Array.
Brute Force Approach : 
import java.util.Arrays;

public class SecondLargestBrute {
    public static int secondLargest(int[] arr) {
        Arrays.sort(arr);

        int largest = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                return arr[i];
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        System.out.println(secondLargest(arr));
    }
}



