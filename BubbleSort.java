public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {17, 23, 7, 59, 73, 13, 37, 53, 47};

        // Print the unsorted array
        System.out.println("Unsorted Array:");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Bubble Sort Algorithm
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = 0; j < arr.length - i - 1; ++j) {
                // Swap if the current element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("\nSorted Array:");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
