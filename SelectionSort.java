public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {17, 23, 7, 59, 73, 13, 37, 53, 47};

        System.out.println("Unsorted Array:");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length - 1; ++i) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        System.out.println("\nSorted Array:");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
