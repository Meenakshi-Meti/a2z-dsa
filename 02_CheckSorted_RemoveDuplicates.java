Problem 3 : Check if the Array is Sorted

Brute Force Approach :
import java.util.Arrays;

public static boolean isSorted(int[] arr) {
    int[] copy = arr.clone();
    Arrays.sort(copy);

    return Arrays.equals(arr, copy);
}

Better Approach :
public static boolean isSorted(int[] arr) {

    for(int i = 0; i < arr.length - 1; i++) {

        if(arr[i] > arr[i + 1]) {
            return false;
        }

    }

    return true;
}

Problem 4 : Remove Duplicates from Sorted Array

Brute Force Approach :
import java.util.HashSet;

public static int removeDuplicates(int[] arr) {

    HashSet<Integer> set = new HashSet<>();

    for(int num : arr) {
        set.add(num);
    }

    int index = 0;

    for(int num : set) {
        arr[index++] = num;
    }

    return index;
}

Better Approach :
public static int removeDuplicates(int[] arr) {

    int[] temp = new int[arr.length];

    temp[0] = arr[0];

    int k = 1;

    for(int i = 1; i < arr.length; i++) {

        if(arr[i] != temp[k - 1]) {
            temp[k++] = arr[i];
        }

    }

    for(int i = 0; i < k; i++) {
        arr[i] = temp[i];
    }

    return k;
}

Optimal Approach : Two Pointer Approach
public static int removeDuplicates(int[] arr) {

    int i = 0;

    for(int j = 1; j < arr.length; j++) {

        if(arr[i] != arr[j]) {
            i++;
            arr[i] = arr[j];
        }

    }

    return i + 1;
}



