package p1_sorting;

public class Bubble_Sort {

    // Method to perform bubble sort on the array
    public static void sort(int[] arr){
        int len = arr.length;
        // Outer loop for each pass
        for(int i = 0; i < len - 1; i++){
            // Inner loop for comparing adjacent elements
            for(int j = 0; j < len - 1 - i; j++){
                // Swap if elements are in the wrong order
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {78, 5, 69, 14, 456, 55, 99, 7589, 55};
        // Print the array before sorting
        for(int i : array){
            System.out.print(i + " ");
        }
        sort(array); // Sort the array
        System.out.println();
        // Print the array after sorting
        for(int i : array){
            System.out.print(i + " ");
        }
    }
}
/*
Bubble Sort     TC-O(n^2)
-----------     --------
It is also called as Sinking Sort.

While applying this sorting algorithm on unsorted array, the largest elements tends to sink at the end of the array.

It repeatedly compares pair of adjacent elements and swap them if they are in wrong order.

Steps to Impliment
-----------------
1: start from 1st element of the array.
2: Compare each pair of adjacent elements.
3: If a pair is in the wrong order, swap them.
4: Repeat the process for all elements, reducing the range each time, until no swaps are needed (the array is sorted).
 */