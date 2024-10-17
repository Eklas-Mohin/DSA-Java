public class InsertionSort {

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; ++i) {
            int temp = arr[i];
            int idx = i - 1;

            while (idx >= 0 && arr[idx] > temp) {
                arr[idx + 1] = arr[idx];
                idx--;
            }
            arr[idx + 1] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {17, 23, 7, 59, 73, 13, 37, 53, 47};

        System.out.println("Unsorted Array:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }
}
