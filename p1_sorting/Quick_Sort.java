package p1_sorting;

public class Quick_Sort {

    // Recursive method to perform quick sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int p = partition(arr, low, high);
            // Recursively sort elements before and after partition
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    // Partition the array and return the pivot index
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as pivot
        int i = low - 1; // Index of smaller element

        // Rearrange elements based on pivot
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the pivot index
    }

    // Main method to test quick sort
    public static void main(String[] args) {
        int[] arr = {125, 85, 759, 5, 45, 26, 22, 2, 31, 11};
        quickSort(arr, 0, arr.length - 1); // Sort the array
        // Print the sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
/*
Quick Sort       TC- O(nlogn)
----------       -----------
Quick Sort is a divide and conquer algorithm. It involves 3 steps
Pivot Selection - We pick an element and mark it as pivot. The pivot element can be first element, last element or any random element.

Partitioning - We reorder the array such that all elements greater than pivot comes after the pivot and all elements smaller than pivot comes before the pivot.
The elements equal to pivot can go either side of the pivot.
After this partitioning the pivot is at its correct sorted position.

Recursion - Recursively apply the above steps on the subarray formed to the left side of pivot and on the subarray formed on the right side of the pivot.


Steps to Impliment
------------------
1: Pick a pivot element from the array.
2: Rearrange (partition) the array so that:
   - All elements less than the pivot are on the left.
   - All elements greater than the pivot are on the right.
3: The pivot is now in its correct sorted position.
4: Recursively repeat steps 1-3 for the left and right parts of the array.
5: Stop when each part has 1 or 0 elements (already sorted).
 */