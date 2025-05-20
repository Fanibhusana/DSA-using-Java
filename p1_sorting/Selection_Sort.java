package p1_sorting;

public class Selection_Sort {

    // Method to perform selection sort on the array
    public static void sort(int[] arr){
        // Traverse the entire array
        for(int i = 0; i < arr.length-1; i++){
            int minIdx = i; // Assume the current index is the minimum
            // Find the index of the minimum element in the unsorted part
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIdx]) minIdx = j;
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
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
Selection Sort       TC- O(n^2)
---------------      ---------
In Selection sort we divide the given array into two parts - sorted part and unsorted part.

The algorithm sorts an array by repeatedly finding the minimum in an unsorted array and making it part of the sorted array.
From unsorted part, we pick minimum element and swap it with leftmost element of unsorted part. After swap,
that element now becomes part of sorted array.

Its repeated till unsorted array is not empty.


Steps to Impliment
------------------
1: start from 1st element of the array
2: find the minimum element in the unsorted part of the array.
3: swap the minimum element with the first element of the unsorted part
4: repeat until the array is sorted
 */
