package p1_sorting;

public class Merge_Sort {

    // Recursive method to perform merge sort
    public static void mergeSort(int[] arr, int[] temp, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            // Sort the left half
            mergeSort(arr, temp, low, mid);
            // Sort the right half
            mergeSort(arr, temp, mid + 1, high);
            // Merge the sorted halves
            merge(arr, temp, low, mid, high);
        }
    }


    // method to merge two sorted subarrays
    public static void merge(int[] arr, int[] temp, int low, int mid, int high) {
        // Copy the relevant part of arr to temp
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }

        int left = low;      // Starting index of left subarray
        int right = mid + 1; // Starting index of right subarray
        int current = low;   // Current index for merged array

        // Merge the two subarrays back into arr
        while (left <= mid && right <= high) {
            if (temp[left] <= temp[right]) {
                arr[current++] = temp[left++];
            } else {
                arr[current++] = temp[right++];
            }
        }

        // Copy any remaining elements from the left subarray
        while (left <= mid) {
            arr[current++] = temp[left++];
        }
        // No need to copy the right subarray, as they are already in place
    }

    public static void main(String[] args) {
        int[] array = {78, 5, 69, 14, 456, 55, 99, 7589, 55};
        int[] temp = new int[array.length];
        // Print the array before sorting
        for (int i : array) {
            System.out.print(i + " ");
        }
        mergeSort(array, temp, 0, array.length - 1); // Sort the array using merge sort
        System.out.println();
        // Print the array after sorting
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
/*
Merge Sort      TC- O(nlogn)
----------      -----------
Merge Sort is a divide and conquer algorithm.

Divide and Conquer recursively breaks down a problem into two or more sub-problems of the same or related type, until these become simple enough to be solved directly.
The solutions to the sub-problems are then combined to give a solution to the original problem.

Steps to Impliment
------------------
1: If the array has 1 or 0 elements, it is already sorted.
2: Split the array into two halves.
3: Recursively sort each half.
4: Merge the two sorted halves into one sorted array.
5: Repeat until the whole array is sorted.
 */