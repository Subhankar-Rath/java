public class Std {

    public static void mergeSort(int arr[], int si, int ei) {

        // Base case
        if (si >= ei) {
            return;
        }

        // Find middle
        int mid = si + (ei - si) / 2;

        // Sort left half
        mergeSort(arr, si, mid);

        // Sort right half
        mergeSort(arr, mid + 1, ei);

        // Merge both sorted halves
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1];

        int i = si;       // Pointer for left half
        int j = mid + 1;  // Pointer for right half
        int k = 0;        // Pointer for temp array

        // Compare elements from both halves
        while (i <= mid && j <= ei) {

            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp back into original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {

        int arr[] = {6, 3, 9, 5, 2, 8};

        // Call merge sort
        mergeSort(arr, 0, arr.length - 1);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

