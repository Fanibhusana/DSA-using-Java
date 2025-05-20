package p1_sorting;

public class Insertion_Sort {

    // Method to perform insertion sort on the array
    public static void sort(int[] arr){
        // Start from the second element (index 1)
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i]; // Store the current element to be inserted
            int j = i - 1; //sorted part
            // Shift elements of the sorted part that are greater than temp to the right
            while(j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j]; // Shifting larger elements
                j--;
            }
            // Insert the current element at its correct position
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {78, 5, 69, 14, 456, 55, 99, 7589, 55};
        // Print the array before sorting
        for(int i : array){
            System.out.print(i + " ");
        }
        sort(array); // Sort the array using insertion sort
        System.out.println();
        // Print the array after sorting
        for(int i : array){
            System.out.print(i + " ");
        }
    }
}

/*
Insertion Sort     TC- O(n^2)
--------------     ----------
Insertion sort is a simple sorting algorithm that works the way. we sort playing cards in our hands.

In Insertion sort we divide the given array into two parts sorted part and unsorted part.

From unsorted part, we take first element and place at its correct position in sorted array.
This is done by shifting all the elements which are larger than first element by one position.
Its repeated till unsorted array is not empty.

Steps to Impliment
------------------
1: Start from the second element (index 1) of the array.
2: Compare the current element with elements in the sorted part (to its left).
3: Shift all elements in the sorted part that are greater than the current element one position to the right.
4: Insert the current element at the correct position in the sorted part.
5: Repeat until the array is sorted

 */