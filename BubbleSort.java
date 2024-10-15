public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {17, 23, 7, 59, 73, 13, 37, 53, 47};
        // Unsorted
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Bubble Sort Algorithm
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = 0; j < arr.length - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Sorted
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
